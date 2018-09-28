package com.witbus.demo.dao.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "bus")
public class Bus implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
    private Long id;

    @Column(name = "bus_plate")
    private String plate;

    @Column(name = "bus_name")
    private String name;

    @Column(name = "bus_origin")
    private String origin;

    @Column(name = "bus_destination")
    private String destination;

    @Column(name = "bus_start_time")
    private String start_time;

    @Column(name = "bus_end_time")
    private String end_time;

    @Column(name = "bus_distance_time")
    private Integer distance_time;

    @Column(name = "bus_price_default")
    private Integer price_default;

    @ManyToOne
    @JoinColumn(name = "bus_owner_id")
    private BusOwner bus_owner;

    @OneToMany(mappedBy = "bus", fetch = FetchType.EAGER)
    private Set<Seat> seats;

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

    public BusOwner getBus_owner() {
        return bus_owner;
    }

    public void setBus_owner(BusOwner bus_owner) {
        this.bus_owner = bus_owner;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seat> seats) {
        this.seats = seats;
    }
}
