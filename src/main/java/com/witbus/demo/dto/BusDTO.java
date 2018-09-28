package com.witbus.demo.dto;

import java.util.List;

public class BusDTO {
    private Long id;
    private String plate;
    private String name;
    private String origin;
    private String destination;
    private String start_time;
    private String end_time;
    private Integer distance_time;
    private Integer price_default;
    private BusOwnerDTO bus_owner;
    private List<SeatDTO> seats;

    @Override
    public String toString() {
        return "BusDTO{" +
                "id=" + id +
                ", plate='" + plate + '\'' +
                ", name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", distance_time=" + distance_time +
                ", price_default=" + price_default +
                ", bus_owner=" + bus_owner +
                ", seats=" + seats +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public Integer getDistance_time() {
        return distance_time;
    }

    public void setDistance_time(Integer distance_time) {
        this.distance_time = distance_time;
    }

    public Integer getPrice_default() {
        return price_default;
    }

    public void setPrice_default(Integer price_default) {
        this.price_default = price_default;
    }

    public BusOwnerDTO getBus_owner() {
        return bus_owner;
    }

    public void setBus_owner(BusOwnerDTO bus_owner) {
        this.bus_owner = bus_owner;
    }

    public List<SeatDTO> getSeats() {
        return seats;
    }

    public void setSeats(List<SeatDTO> seats) {
        this.seats = seats;
    }
}
