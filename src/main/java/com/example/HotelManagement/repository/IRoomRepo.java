package com.example.HotelManagement.repository;

import com.example.HotelManagement.model.HotelRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepo extends CrudRepository<HotelRoom,Long> {
}
