/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nn
 */
public class JTableModel extends AbstractTableModel {

    private String[] colums = {"ID", "Name Product", "Price", "Stock"};
    private List<Product> product = new ArrayList<>();

    public JTableModel(List<Product> product) {
        this.product = product;
    }

    @Override
    public int getRowCount() {
        return this.product.size();
    }

    @Override
    public int getColumnCount() {
        return this.colums.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Object reply;

        switch (column) {
            case 0:
                reply = this.product.get(row).getId();
            case 1:
                reply = this.product.get(row).getName();
            case 2:
                reply = this.product.get(row).getPrice();
            default:
                reply = this.product.get(row).getStock();
        }
        return reply;

    }
    
    public String GetColumnName (int column){
        return this.colums[column];
    } 
    
    public void UpdateJTable (){
        fireTableDataChanged();
    }
    
    public Product detail (int row){
        return this.product.get(row);
    }
}
