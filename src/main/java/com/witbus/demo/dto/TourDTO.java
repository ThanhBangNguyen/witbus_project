package com.witbus.demo.dto;

import java.util.List;

public class TourDTO {
    private  String name;
    private  String address;
    private List<String> ticketType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getTicketType() {
        return ticketType;
    }

    public void setTicketType(List<String> ticketType) {
        this.ticketType = ticketType;
    }
}
