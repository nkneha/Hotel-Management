package com.example.HotelManagement.service;

import com.example.HotelManagement.model.HotelRoom;
import com.example.HotelManagement.repository.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    IRoomRepo roomRepo;

    public Iterable<HotelRoom> getAllRooms() {
        return roomRepo.findAll();
    }

    public String createRoom(HotelRoom room) {
        roomRepo.save(room);  //save will perform 2 operations save and update if id is same and we gave diff value
        return "Added";
    }

    public String createRooms(Iterable<HotelRoom> rooms) {
        roomRepo.saveAll(rooms);
        return "Rooms Added";
    }

    public HotelRoom roomInfo(Long id) {
         Optional<HotelRoom> optionalHotelRoom = roomRepo.findById(id);
         return optionalHotelRoom.get();


    }

    public Boolean isRoomExists(Long id) {
        return roomRepo.existsById(id);
    }

    public Long countRooms(long id) {
        return roomRepo.count();
    }

//    public HotelRoom updateRoom(Long id) {
//        roomRepo.save(Long id);
//        return
//    }
}
