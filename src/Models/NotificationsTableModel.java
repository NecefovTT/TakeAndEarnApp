/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import DBConnected.DBConnection;
import Pojo.Notifications;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author TT
 */
public class NotificationsTableModel extends AbstractTableModel {

    DBConnection dbc = new DBConnection();

    List<Notifications> data;
    List<String> header;

    public NotificationsTableModel(List<Notifications> data, List<String> header) {
        this.data = data;
        this.header = header;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return header.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return data.get(rowIndex).getId();
        } else if (columnIndex == 1) {
            return dbc.findByid(data.get(rowIndex).getUser_id_from()).getName() + "  " + dbc.findByid(data.get(rowIndex).getUser_id_from()).getSurname();
        } else if (columnIndex == 2) {
            return dbc.findByid(data.get(rowIndex).getUser_id_to()).getName() + " " + dbc.findByid(data.get(rowIndex).getUser_id_to()).getSurname();
        } else if (columnIndex == 3) {
            return dbc.findByTheRouteId(data.get(rowIndex).getRoute_id()).getLoc_from();
        } else if (columnIndex == 4) {
            return dbc.findByTheRouteId(data.get(rowIndex).getRoute_id()).getLoc_to();
        } else if (columnIndex == 5) {
            return data.get(rowIndex).getCount_passenger();
        } else if (columnIndex == 6) {
            return data.get(rowIndex).getCount_luggage();
        } else if (columnIndex == 7) {
            return data.get(rowIndex).getNote();
        } else if (columnIndex == 8) {
            if (data.get(rowIndex).getStatus() == 0) {
                return "Təstiqləndi";
            } else if (data.get(rowIndex).getStatus() == 1) {
                return "Gözləmədə";
            } else if (data.get(rowIndex).getStatus() == 2) {
                return "Geri alındı";
            } else if (data.get(rowIndex).getStatus() == 3) {
                return "Ləğv edildi";
            } else {
                return null;
            }
        } else if (columnIndex == 9) {
            return data.get(rowIndex).getUser_id_from();
        } else if (columnIndex == 10) {
            return dbc.findByTheRouteId(data.get(rowIndex).getRoute_id()).getDates();
        } else {
            return null;
        }

    }

    @Override
    public String getColumnName(int column) {
        return header.get(column);
    }

}
