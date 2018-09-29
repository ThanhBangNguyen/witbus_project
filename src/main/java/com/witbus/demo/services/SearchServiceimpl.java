package com.witbus.demo.services;

import com.witbus.demo.dao.models.Seat;
import com.witbus.demo.dao.repository.*;
import com.witbus.demo.dto.BusDTO;
import com.witbus.demo.dto.BusSeatDTO;
import com.witbus.demo.dto.TourDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchServiceimpl implements SearchService {
   @Autowired

    private SeatRepository seatRepository;


    public SearchServiceimpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    public List<BusSeatDTO> searchTour(TourDTO tourDTO) {
         List<Seat> seats = seatRepository.getSeatAvailable(true,tourDTO.getTicketType());
         List<BusSeatDTO> result = new ArrayList<>();
            for (Seat seat :seats) {

                //Kiem tra thu bus da ton tai chua
                int index = -1 ;
                for (int i = 0 ; i<result.size();i++) {
                    if(result.get(i).getBus().getId().equals(seat.getBus().getId())){
                    index = i;

                    }
                    break;
                }

                //If index == -1 => add new ,index!=-1 => update (thêm ghế vào xe )

               if (index >=0) {
                    if(seat.getBus().getOrigin().equals(tourDTO.getLocationOrigin())){
                   BusSeatDTO busSeatDTO = new BusSeatDTO();
                   BusDTO busDTO = new BusDTO();
                   busDTO.setId(seat.getBus().getId());
                   busSeatDTO.setBus(busDTO);

                   List<Long> listSeat = new ArrayList<>();
                   listSeat.add(seat.getId());
                   busSeatDTO.setSeats(listSeat);
                   result.add(busSeatDTO);
                    }
                }
               else {
                    result.get(index).getSeats().add(seat.getId());
               }


            }
            return result;
    }
}
