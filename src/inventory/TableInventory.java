/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nn
 */
public class TableInventory {

    private List<Product> listProducts;
    
    public TableInventory() {
        listProducts = new ArrayList<>();
    }

    public List<Product> getListProducts() {
        return listProducts;
    }
        
    public void addProduct (Product product) {
       listProducts.add(product);
    }

    public void deleteProduct(Product product) {
        listProducts.remove(product);
    }

    public void modificarProducto(int id, String newName, double newPrice, int newStock) {
        for (Product product : listProducts) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                product.setStock(newStock);
                return;
            }
        }
    }

    public boolean checkInventory (int id) {
        for (Product product : this.listProducts) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean checkInventory (String name) {
        for (Product product : this.listProducts) {
            if (product.getName().equalsIgnoreCase(name)) {
                return true; 
            }
        }
        return false;
    }
  
  
}
