package com.example.HotelManagement.controller;

import com.example.HotelManagement.model.HotelRoom;
import com.example.HotelManagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping("rooms")
    public Iterable<HotelRoom> getAllRooms(){
        return roomService.getAllRooms();
    }
    @PostMapping("room")
    public String createRoom(@RequestBody HotelRoom room){
        return roomService.createRoom(room);
    }
    @PostMapping("rooms")
    public String createRooms(@RequestBody Iterable<HotelRoom> rooms){
        return roomService.createRooms(rooms);
    }
//    @PutMapping("update/room/{id}")
//    public HotelRoom updateRoom(@PathVariable Long id){
//        return roomService.updateRoom(id);
//    }
    @GetMapping("room/{id}")
    public HotelRoom roomInfo(@PathVariable Long id){
        return roomService.roomInfo(id);
    }
    @GetMapping("room/{id}/exists")
    public Boolean isRoomExists(@PathVariable Long id){
        return roomService.isRoomExists(id);
    }
    @GetMapping("room/count")
    public Long countRooms(long id){
        return roomService.countRooms(id);
    }
}
