/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author TT
 */
public class TheRoute {

    private int id;
    private int user_id;
    private int eq_id;
    private String loc_from;
    private String loc_to;
    private String dates;
    private char categories;
    private int passenger;
    private double luggage;
    private int status;

    public TheRoute() {
    }

    public TheRoute(int id, int user_id, int eq_id, String loc_from, String loc_to, String dates, char categories, int passenger, double luggage, int status) {
        this.id = id;
        this.user_id = user_id;
        this.eq_id = eq_id;
        this.loc_from = loc_from;
        this.loc_to = loc_to;
        this.dates = dates;
        this.categories = categories;
        this.passenger = passenger;
        this.luggage = luggage;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getEq_id() {
        return eq_id;
    }

    public void setEq_id(int eq_id) {
        this.eq_id = eq_id;
    }

    public String getLoc_from() {
        return loc_from;
    }

    public void setLoc_from(String loc_from) {
        this.loc_from = loc_from;
    }

    public String getLoc_to() {
        return loc_to;
    }

    public void setLoc_to(String loc_to) {
        this.loc_to = loc_to;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public char getCategories() {
        return categories;
    }

    public void setCategories(char categories) {
        this.categories = categories;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public double getLuggage() {
        return luggage;
    }

    public void setLuggage(double luggage) {
        this.luggage = luggage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " " + user_id + " " + eq_id + " " + loc_from + " " + loc_to + " " + dates + " " + categories + " " + passenger + " " + luggage + " " + status;
    }

}
