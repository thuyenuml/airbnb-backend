package com.example.mydemo.model;

import javax.persistence.*;

@Entity
@Table
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "cate_room_id")
    private CategoryRoom cateRoom;

    @ManyToOne
    @JoinColumn(name = "cate_home_id")
    private CategoryHome cateHome;

    public Home(){

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

    public CategoryRoom getCateRoom() {
        return cateRoom;
    }

    public void setCateRoom(CategoryRoom cateRoom) {
        this.cateRoom = cateRoom;
    }

    public CategoryHome getCateHome() {
        return cateHome;
    }

    public void setCateHome(CategoryHome cateHome) {
        this.cateHome = cateHome;
    }
}
