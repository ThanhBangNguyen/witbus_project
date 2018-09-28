package com.witbus.demo.services;

import com.witbus.demo.dto.BusSeatDTO;
import com.witbus.demo.dto.TourDTO;

import java.util.List;

public interface SearchService {
    List<BusSeatDTO> searchTour(TourDTO tourDTO);
}
