package com.wildcodeschool.checkpoint_carnet_de_voyage.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String country;
    private Date startTraveling;
    private Date endTraveling;

    @OneToMany(mappedBy = "travel", cascade = CascadeType.ALL)
    private List<StandingPoint> standingPoints;

    public Travel() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getStartTraveling() {
        return startTraveling;
    }

    public void setStartTraveling(Date startTraveling) {
        this.startTraveling = startTraveling;
    }

    public Date getEndTraveling() {
        return endTraveling;
    }

    public void setEndTraveling(Date endTraveling) {
        this.endTraveling = endTraveling;
    }

    public List<StandingPoint> getStandingPoints() {
        return standingPoints;
    }

    public void setStandingPoints(List<StandingPoint> standingPoints) {
        this.standingPoints = standingPoints;
    }
}
