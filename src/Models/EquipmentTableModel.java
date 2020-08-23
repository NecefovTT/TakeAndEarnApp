/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Pojo.Equipment;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author TT
 */
public class EquipmentTableModel extends AbstractTableModel {

    List<Equipment> data;
    List<String> header;

    public EquipmentTableModel(List<Equipment> data, List<String> header) {
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
            return data.get(rowIndex).getBrand();
        } else if (columnIndex == 2) {
            return data.get(rowIndex).getModel();
        } else if (columnIndex == 3) {
            return data.get(rowIndex).getBan_type();
        } else if (columnIndex == 4) {
            if (data.get(rowIndex).getConditioner() == 'Y') {
                return "Var";
            } else if (data.get(rowIndex).getConditioner() == 'N') {
                return "Yox";
            } else {
                return null;
            }

        } else if (columnIndex == 5) {

            if (data.get(rowIndex).getStatus() == 1) {
                return "Aktiv";
            } else if (data.get(rowIndex).getStatus() == 0) {
                return "Deavktiv";
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
