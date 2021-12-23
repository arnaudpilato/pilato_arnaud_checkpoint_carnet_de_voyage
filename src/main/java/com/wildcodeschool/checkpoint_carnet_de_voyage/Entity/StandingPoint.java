package com.wildcodeschool.checkpoint_carnet_de_voyage.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class StandingPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String city;
    private Date stepDate;
    private String resume;

    @ManyToOne
    @JoinColumn(name = "travel_id")
    private Travel travel;

    @OneToMany(mappedBy = "standingPoint", cascade = CascadeType.ALL)
    private List<Link> links;

    public StandingPoint() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getStepDate() {
        return stepDate;
    }

    public void setStepDate(Date stepDate) {
        this.stepDate = stepDate;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
