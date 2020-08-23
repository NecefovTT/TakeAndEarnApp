/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Pojo.Users;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author TT
 */
public class UsersTableModel extends AbstractTableModel {

    private List<Users> data;
    private List<String> header;

    public UsersTableModel(List<Users> data, List<String> header) {
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
            return data.get(rowIndex).getName();
        } else if (columnIndex == 2) {
            return data.get(rowIndex).getSurname();
        } else if (columnIndex == 3) {
            return data.get(rowIndex).getEmail();
        } else if (columnIndex == 4) {
            return data.get(rowIndex).getPhone();
        } else if (columnIndex == 5) {
            return data.get(rowIndex).getGender();
        } else if (columnIndex == 6) {
            return data.get(rowIndex).getLanguages();
        } else if (columnIndex == 7) {
            if (data.get(rowIndex).getStatus() == 0) {
                return "Dondurulmuş";
            } else if (data.get(rowIndex).getStatus() == 1) {
                return "Aktiv";
            } else if (data.get(rowIndex).getStatus() == 2) {
                return "Bloklanmış";
            } else {
                return "Silinib";
            }

        } else {
            return null;
        }

    }

    @Override
    public String getColumnName(int column) {
        return header.get(column);
    }

}
