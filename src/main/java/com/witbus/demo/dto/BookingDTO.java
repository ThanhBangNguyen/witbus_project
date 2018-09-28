package com.witbus.demo.dto;

import com.witbus.demo.dao.models.Seat;
import com.witbus.demo.dao.models.User;

public class BookingDTO {
    private Long id;
    private int tickets;
    private Boolean pay;
    private Integer price;
    private Seat seat;
    private User user;

    @Override
    public String toString() {
        return "BookingDTO{" +
                "id=" + id +
                ", tickets=" + tickets +
                ", pay=" + pay +
                ", price=" + price +
                ", seat=" + seat +
                ", user=" + user +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public Boolean getPay() {
        return pay;
    }

    public void setPay(Boolean pay) {
        this.pay = pay;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
