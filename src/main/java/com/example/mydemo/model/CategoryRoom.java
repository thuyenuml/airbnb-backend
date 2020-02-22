package com.example.mydemo.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class CategoryRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cate_room_id")
    private Long id;

    private String nameCateRoom;

    @OneToMany(mappedBy = "cateRoom", cascade = CascadeType.ALL)
    private Set<Home> homes;


    public CategoryRoom(){}

    public CategoryRoom(String nameCateRoom){
        this.nameCateRoom = nameCateRoom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCateRoom() {
        return nameCateRoom;
    }

    public void setNameCateRoom(String nameCateRoom) {
        this.nameCateRoom = nameCateRoom;
    }

    public Set<Home> getHomes() {
        return homes;
    }

    public void setHomes(Set<Home> homes) {
        this.homes = homes;
    }
}
