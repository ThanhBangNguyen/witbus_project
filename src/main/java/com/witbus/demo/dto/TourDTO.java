package com.witbus.demo.dto;

import java.util.List;

public class TourDTO {

    private  String locationOrigin;
    private List<String> ticketType;

    public String getLocationOrigin() {
        return locationOrigin;
    }

    public void setLocationOrigin(String locationOrigin) {
        this.locationOrigin = locationOrigin;
    }

    public List<String> getTicketType() {
        return ticketType;
    }

    public void setTicketType(List<String> ticketType) {
        this.ticketType = ticketType;
    }
}
