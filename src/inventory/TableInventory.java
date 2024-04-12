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

    private HashMap<Integer, Product> listProducts = new HashMap<>();

    public TableInventory() {
        this.listProducts.put(1, new Product(1, "Arroz", 5500, 65));
        this.listProducts.put(2, new Product(2, "Cafe", 980, 647));
        this.listProducts.put(3, new Product(3, "Cepillos", 550, 12));
    }

    public List<Product> getListProducts() {
        return new ArrayList<>(this.listProducts.values());
    }

    public void setListProducts(HashMap<Integer, Product> listProducts) {
        this.listProducts = listProducts;
    }

    public Boolean checkInventory(Product product) {
        return this.listProducts.containsKey(product.getId());
    }

    public Boolean checkInventory(String name) {
        for (Product x : this.listProducts.values()) {
            if (name.toLowerCase().equals(x.getName().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public int consecutiveId() {
        int id = 0;
        for (Product p : this.listProducts.values()) {
            id = p.getId();
        }
        return id;
    }

    public void addNewProduct(Product p) {
        this.listProducts.put(p.getId(), p);
    }

    public void updateProduct(Product p) {
        this.listProducts.replace(p.getId(), p);
    }

    public void deleteProduct(Product p) {
        this.listProducts.remove(p.getId(), p);
    }

}
