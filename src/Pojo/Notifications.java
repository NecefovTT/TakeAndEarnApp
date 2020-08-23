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
public class Notifications {

    private int id;
    private int user_id_from;
    private int user_id_to;
    private int route_id;
    private int count_passenger;
    private double count_luggage;
    private String note;
    private int status;

    public Notifications() {
    }

    public Notifications(int id, int user_id_from, int user_id_to, int route_id, int count_passenger, double count_luggage, String note, int status) {
        this.id = id;
        this.user_id_from = user_id_from;
        this.user_id_to = user_id_to;
        this.route_id = route_id;
        this.count_passenger = count_passenger;
        this.count_luggage = count_luggage;
        this.note = note;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id_from() {
        return user_id_from;
    }

    public void setUser_id_from(int user_id_from) {
        this.user_id_from = user_id_from;
    }

    public int getUser_id_to() {
        return user_id_to;
    }

    public void setUser_id_to(int user_id_to) {
        this.user_id_to = user_id_to;
    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public int getCount_passenger() {
        return count_passenger;
    }

    public void setCount_passenger(int count_passenger) {
        this.count_passenger = count_passenger;
    }

    public double getCount_luggage() {
        return count_luggage;
    }

    public void setCount_luggage(double count_luggage) {
        this.count_luggage = count_luggage;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " " + user_id_from + " " + user_id_to + " " + route_id + " " + count_passenger + " " + count_luggage + " " + note + " " + status;
    }

}
