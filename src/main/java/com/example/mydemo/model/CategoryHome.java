package com.example.mydemo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CategoryHome {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @GenericGenerator(name = "itemIdGen", strategy = "increment")
    @GeneratedValue(generator = "itemIdGen")
    @Column(name = "cate_home_id", nullable = false)
    private Long id;

    private String nameCateHome;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="cate_home_id", referencedColumnName="cate_home_id")
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
