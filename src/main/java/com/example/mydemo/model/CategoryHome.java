package com.example.mydemo.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class CategoryHome {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cate_home_id")
    private Long id;
    private String nameCateHome;

    @OneToMany(mappedBy = "cateHome", cascade = CascadeType.ALL)
    private Set<Home> homes;

    public CategoryHome(){

    }

    public CategoryHome(String nameCateHome){
        this.nameCateHome = nameCateHome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCateHome() {
        return nameCateHome;
    }

    public void setNameCateHome(String nameCateHome) {
        this.nameCateHome = nameCateHome;
    }

    public Set<Home> getHomes() {
        return homes;
    }

    public void setHomes(Set<Home> homes) {
        this.homes = homes;
    }
}
