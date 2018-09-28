package com.witbus.demo.controllers;


import com.witbus.demo.dao.models.Seat;
import com.witbus.demo.dao.models.User;
import com.witbus.demo.dto.BookingDTO;
import com.witbus.demo.dto.BusDTO;
import com.witbus.demo.dto.SeatDTO;
import com.witbus.demo.dto.UserDTO;
import com.witbus.demo.dto.responses.Response;
import com.witbus.demo.services.WitBusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {
    private WitBusService witBusService;

    public BookingController(WitBusService witBusService) {
        this.witBusService = witBusService;
    }

    @PostMapping(value = "/booking")
    public @ResponseBody Response addBooking(@RequestBody BookingDTO bookingDTO, UserDTO userDTO){
        //witBusService.addUser(userDTO);
        witBusService.booking(bookingDTO,userDTO);
        Response<BookingDTO> response = new Response<>(true,bookingDTO,"Successful!");
        response.getData();
        return response;
    }
}
