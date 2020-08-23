/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import DBConnected.DBConnection;
import Pojo.TheRoute;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author TT
 */
public class TheRouteTableModel extends AbstractTableModel {

    List<TheRoute> data;
    List<String> header;
    DBConnection dbc = new DBConnection();

    public TheRouteTableModel(List<TheRoute> data, List<String> header) {
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
            return dbc.findByid(data.get(rowIndex).getUser_id()).getName() + " " + dbc.findByid(data.get(rowIndex).getUser_id()).getSurname();
        } else if (columnIndex == 1) {
            return data.get(rowIndex).getUser_id();
        } else if (columnIndex == 2) {
            return dbc.findByEquipForEqId(data.get(rowIndex).getEq_id()).getBrand() + " " + dbc.findByEquipForEqId(data.get(rowIndex).getEq_id()).getModel();
        } else if (columnIndex == 3) {
            return data.get(rowIndex).getLoc_from();
        } else if (columnIndex == 4) {
            return data.get(rowIndex).getLoc_to();
        } else if (columnIndex == 5) {
            return data.get(rowIndex).getDates();
        } else if (columnIndex == 6) {
            return data.get(rowIndex).getPassenger();
        } else if (columnIndex == 7) {
            return data.get(rowIndex).getLuggage();
        } else if (columnIndex == 8) {
            return data.get(rowIndex).getId();
        } else if (columnIndex == 9) {
            return data.get(rowIndex).getEq_id();
        } else if (columnIndex == 10) {
            if (data.get(rowIndex).getStatus() == 0) {
                return "Deaktiv";
            } else if (data.get(rowIndex).getStatus() == 1) {
                return "Aktiv";
            } else {
                return "Silinib";
            }

        } else if (columnIndex == 11) {
            return data.get(rowIndex).getUser_id();
        } else {
            return null;
        }

    }

    @Override
    public String getColumnName(int column) {
        return header.get(column);
    }

}
