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
public class Messages {

    private int id;
    private int user_id_from;
    private int user_id_to;
    private String message;
    private int read_unread;
    private String date_message;
    private int status;

    public Messages() {
    }

    public Messages(int id, int user_id_from, int user_id_to, String message, int read_unread, String date_message, int status) {
        this.id = id;
        this.user_id_from = user_id_from;
        this.user_id_to = user_id_to;
        this.message = message;
        this.read_unread = read_unread;
        this.date_message = date_message;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRead_unread() {
        return read_unread;
    }

    public void setRead_unread(int read_unread) {
        this.read_unread = read_unread;
    }

    public String getDate_message() {
        return date_message;
    }

    public void setDate_message(String date_message) {
        this.date_message = date_message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return message;
    }

}
