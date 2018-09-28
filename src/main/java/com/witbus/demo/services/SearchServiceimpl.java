package com.witbus.demo.services;

import com.witbus.demo.dao.models.Seat;
import com.witbus.demo.dao.repository.*;
import com.witbus.demo.dto.BusDTO;
import com.witbus.demo.dto.BusSeatDTO;
import com.witbus.demo.dto.TourDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchServiceimpl implements SearchService {
    private BusRepository busRepository;
    private BusOwnerRepository busOwnerRepository;
    private SeatRepository seatRepository;
    private BookingRepository bookingRepository;
    private UserRepository userRepository;

    public SearchServiceimpl(BusOwnerRepository busOwnerRepository, SeatRepository seatRepository, BookingRepository bookingRepository, UserRepository userRepository) {
        this.busOwnerRepository = busOwnerRepository;
        this.seatRepository = seatRepository;
        this.bookingRepository = bookingRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<BusSeatDTO> searchTour(TourDTO tourDTO) {
         List<Seat> seats = seatRepository.getSeatAvailable(false,tourDTO.getTicketType());
         List<BusSeatDTO> result = new ArrayList<>();
            for (Seat seat :seats) {

                //Check Bus exist
                int index = -1 ;
                for (int i = 0 ; i<result.size();i++) {
                    if(result.get(i).getBus().getId().equals(seat.getBus().getId())){
                    index = i;
                    break;
                    }
                }
                //Check Bus exist
                //If index == -1 => add new ,index!=> update (thêm ghế vào xe )
               if (index !=-1) {
                   BusSeatDTO busSeatDTO = new BusSeatDTO();
                   BusDTO busDTO = new BusDTO();
                   busDTO.setId(seat.getBus().getId());
                   busSeatDTO.setBus(busDTO);

                   List<Long> listSeat = new ArrayList<>();
                   listSeat.add(seat.getId());
                   busSeatDTO.setSeats(listSeat);
                   result.add(busSeatDTO);
               }
               else {
                    result.get(index).getSeats().add(seat.getId());
               }


            }
            return result;
    }
}
