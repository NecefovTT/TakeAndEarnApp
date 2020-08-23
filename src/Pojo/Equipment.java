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
public class Equipment {

    private int id;
    private int user_id;
    private String brand;
    private String model;
    private String ban_type;
    private char conditioner;
    private int status;

    public Equipment() {
    }

    public Equipment(int id, int user_id, String brand, String model, String ban_type, char conditioner, int status) {
        this.id = id;
        this.user_id = user_id;
        this.brand = brand;
        this.model = model;
        this.ban_type = ban_type;
        this.conditioner = conditioner;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBan_type() {
        return ban_type;
    }

    public void setBan_type(String ban_type) {
        this.ban_type = ban_type;
    }

    public char getConditioner() {
        return conditioner;
    }

    public void setConditioner(char conditioner) {
        this.conditioner = conditioner;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

}
