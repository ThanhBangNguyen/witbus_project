package com.witbus.demo.services;

import com.witbus.demo.dao.models.User;
import com.witbus.demo.dto.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WitBusService {

    void booking(BookingDTO bookingDTO, UserDTO userDTO);

    void addUser(UserDTO userDTO);


}
