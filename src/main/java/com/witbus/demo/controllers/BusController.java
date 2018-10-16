package com.witbus.demo.controllers;

import com.witbus.demo.dto.BusDTO;
import com.witbus.demo.dto.BusSeatDTO;
import com.witbus.demo.dto.Reponse.Response;
import com.witbus.demo.dto.TourDTO;
import com.witbus.demo.services.SearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusController {
    private SearchService searchService;

    public BusController(SearchService searchService) {
        this.searchService = searchService;
    }
    @GetMapping(value = "/bus")
    public Response<List<BusDTO>> searchTour() {
        List<BusDTO> busSeatDTOList = searchService.listBus();
        return new Response<>(true, busSeatDTOList, "Succsess full!");
    }
}
