package com.example.mydemo.model;

public class Home_Form {
    private Long id;
    private String name;
    private Double price;
    private String address;
    private String description;
    private int numberBath;
    private int numberBad;
    private Long cateRoom;
    private Long cateHome;

    public Home_Form(){

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberBath() {
        return numberBath;
    }

    public void setNumberBath(int numberBath) {
        this.numberBath = numberBath;
    }

    public int getNumberBad() {
        return numberBad;
    }

    public void setNumberBad(int numberBad) {
        this.numberBad = numberBad;
    }

    public Long getCateRoom() {
        return cateRoom;
    }

    public void setCateRoom(Long cateRoom) {
        this.cateRoom = cateRoom;
    }

    public Long getCateHome() {
        return cateHome;
    }

    public void setCateHome(Long cateHome) {
        this.cateHome = cateHome;
    }
}
