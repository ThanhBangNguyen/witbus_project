package com.witbus.demo.dao.repository;

import com.witbus.demo.dao.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
    @Query(value = "SELECT * from  seats where seat_status = ?1 AND seat_type IN  =?2",nativeQuery = true)
    List<Seat> getSeatAvailable (Boolean status, List<String> seatType);
}
