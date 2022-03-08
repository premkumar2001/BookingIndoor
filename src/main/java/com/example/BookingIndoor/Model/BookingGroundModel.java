package com.example.BookingIndoor.Model;


import javax.persistence.Entity;
        import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="bookinggrounddetails")
public class BookingGroundModel {
    @Id
    private String groundName;
    private String address;
    private String noOfPersons;
    private Date fromDate;
    private Date todate;
    private String totalPrice;

    public BookingGroundModel() {
    }

    public BookingGroundModel(String groundName,
                        String address,
                        String noOfPersons,
                        Date fromDate,
                        Date todate,
                        String totalPrice) {
        this.groundName = groundName;
        this.address = address;
        this.noOfPersons = noOfPersons;
        this.fromDate = fromDate;
        this.todate = todate;
        this.totalPrice = totalPrice;
    }

    public String getGroundName() {
        return groundName;
    }

    public void setGroundName(String grounndName) {
        this.groundName = grounndName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNoOfPersons() {
        return noOfPersons;
    }

    public void setNoOfPersons(String noOfPersons) {
        this.noOfPersons = noOfPersons;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
