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
public class Users {

    private int id;
    private String name;
    private String surname;
    private String father_name;
    private char gender;
    private String email;
    private String username;
    private String password;
    private String phone;
    private String date_of_birth;
    private byte image[];
    private String description;
    private String languages;
    private String register;
    private int status;
    private int role;

    public Users() {
    }

    public Users(int id, String name, String surname, String father_name, char gender, String email, String username, String password, String phone, String date_of_birth, byte image[], String description, String languages, String register, int status, int role) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.father_name = father_name;
        this.gender = gender;
        this.email = email;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.date_of_birth = date_of_birth;
        this.image = image;
        this.description = description;
        this.languages = languages;
        this.register = register;
        this.status = status;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte image[]) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

}
