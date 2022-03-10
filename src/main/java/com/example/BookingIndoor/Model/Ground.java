package com.example.BookingIndoor.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grounddetails")
public class Ground {
    @Id
    @GeneratedValue
    private Long GroundId;
    private String GroundName;
    private String GroundImageURL;
    private String GroundAddress;
    private String GroundDescription;
    private String groundAvailableStatus;
    private String price;

    public Ground() {
    }

    public Ground(Long groundId,
                  String groundName,
                  String groundImageURL,
                  String groundAddress,
                  String groundDescription,
                  String groundAvailableStatus,
                  String price)
    {
        GroundId = groundId;
        GroundName = groundName;
        GroundImageURL = groundImageURL;
        GroundAddress = groundAddress;
        GroundDescription = groundDescription;
        this.groundAvailableStatus = groundAvailableStatus;
        this.price = price;
    }

    public Long getGroundId() {
        return GroundId;
    }

    public void setGroundId(Long groundId) {
        GroundId = groundId;
    }

    public String getGroundName() {
        return GroundName;
    }

    public void setGroundName(String groundName) {
        GroundName = groundName;
    }

    public String getGroundImageURL() {
        return GroundImageURL;
    }

    public void setGroundImageURL(String groundImageURL) {
        GroundImageURL = groundImageURL;
    }

    public String getGroundAddress() {
        return GroundAddress;
    }

    public void setGroundAddress(String groundAddress) {
        GroundAddress = groundAddress;
    }

    public String getGroundDescription() {
        return GroundDescription;
    }

    public void setGroundDescription(String groundDescription) {
        GroundDescription = groundDescription;
    }

    public String getGroundAvailableStatus() {
        return groundAvailableStatus;
    }

    public void setGroundAvailableStatus(String groundAvailableStatus) {
        this.groundAvailableStatus = groundAvailableStatus;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

