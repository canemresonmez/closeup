package com.example.closeup.repository;

import com.example.closeup.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {

    House findById(long id);
    House findAllByFloor(int floor);

}
