package com.witbus.demo.services;

import com.witbus.demo.dao.models.*;
import com.witbus.demo.dao.repository.*;
import com.witbus.demo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class WitBusServiceImpl implements WitBusService {
    @Autowired
    private BusRepository busRepository;
    private BusOwnerRepository bus_ownerRepository;
    private SeatRepository seatRepository;
    private UserRepository userRepository;
    private BookingRepository bookingRepository;

    public WitBusServiceImpl(BusOwnerRepository bus_ownerRepository, BusRepository busRepository, SeatRepository seatRepository, UserRepository userRepository, BookingRepository bookingRepository ){
        this.busRepository = busRepository;
        this.bus_ownerRepository = bus_ownerRepository;
        this.seatRepository = seatRepository;
        this.userRepository = userRepository;
        this.bookingRepository = bookingRepository;
    }

    //========================================================== BOOKING ====================================================//

    //=======================================================================================================================================//
    @Override
    public void addUser(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        userRepository.save(user);
//        User savedUser = userRepository.save(user);

    }
    @Override
    public void booking(BookingDTO bookingDTO, UserDTO userDTO) {
        Booking booking = new Booking();
        booking.setPay(bookingDTO.getPay());
        booking.setPrice(bookingDTO.getPrice());
        booking.setTickets(bookingDTO.getTickets());
        Optional<User> userOptional = userRepository.findById(bookingDTO.getUser().getId());
        User user ;
        if (!userOptional.isPresent()){
            User newUser = new User();
            newUser.setName(userDTO.getName());
            newUser.setPhone(userDTO.getPhone());
            newUser.setEmail(userDTO.getEmail());
            user = userRepository.save(newUser);
        }
        else {

            user = userOptional.get();
        }
        Optional<Seat> seatOptional = seatRepository.findById(bookingDTO.getSeat().getId());
        Seat seat;
        if (!seatOptional.isPresent()){
            Seat editSeat = new Seat();
            seat =seatRepository.save(editSeat);
        }else {

            seat = seatOptional.get();
        }
        booking.setUser(user);
        booking.setSeat(seat);
        Booking saveBooking = bookingRepository.save(booking);
    }
    
}
