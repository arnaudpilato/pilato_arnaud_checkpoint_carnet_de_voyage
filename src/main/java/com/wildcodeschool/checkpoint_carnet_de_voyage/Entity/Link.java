package com.wildcodeschool.checkpoint_carnet_de_voyage.Entity;

import javax.persistence.*;

@Entity
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String Galery;
    private String restaurant;
    private String otherLink;

    @ManyToOne
    @JoinColumn(name = "standingPoint_id")
    private StandingPoint standingPoint;

    public Link() {
    }

    public String getGalery() {
        return Galery;
    }

    public void setGalery(String galery) {
        Galery = galery;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getOtherLink() {
        return otherLink;
    }

    public void setOtherLink(String otherLink) {
        this.otherLink = otherLink;
    }

    public StandingPoint getStandingPoint() {
        return standingPoint;
    }

    public void setStandingPoint(StandingPoint standingPoint) {
        this.standingPoint = standingPoint;
    }
}
