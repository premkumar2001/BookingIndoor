package com.example.BookingIndoor.Model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bookingground")
public class BookingGround {
    @Id
    private int bookingid;
    private String groundName;
    private String address;
    private String noOfPersons;
    private Date fromDate;
    private Date todate;
    private String totalPrice;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    public BookingGround() {
    }

    public BookingGround(
            int bookingid,
            String groundName,
                         String address,
                         String noOfPersons,
                         Date fromDate,
                         Date todate,
                         String totalPrice,
    User user) {
        this.bookingid=bookingid;
        this.groundName = groundName;
        this.address = address;
        this.noOfPersons = noOfPersons;
        this.fromDate = fromDate;
        this.todate = todate;
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
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
