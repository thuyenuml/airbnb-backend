package com.example.mydemo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CategoryRoom {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @GenericGenerator(name = "itemIdGen", strategy = "increment")
    @GeneratedValue(generator = "itemIdGen")
    @Column(name = "cate_room_id", nullable = false)
    private Long id;

    private String nameCateRoom;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cate_room_id", referencedColumnName = "cate_room_id")
    private Set<Home> homes;

    public CategoryRoom() {
    }

    public CategoryRoom(String nameCateRoom) {
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
