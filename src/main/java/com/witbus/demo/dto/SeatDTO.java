package com.witbus.demo.dto;

public class SeatDTO {
    private Long id;
    private String name;
    private Boolean status;
    private Integer price;
    private BusDTO bus;

    @Override
    public String toString() {
        return "SeatDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", price=" + price +
                ", bus=" + bus +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public BusDTO getBus() {
        return bus;
    }

    public void setBus(BusDTO bus) {
        this.bus = bus;
    }
}
