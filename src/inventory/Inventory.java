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
public class Inventory {

    private HashMap<Integer, Product> listProducts = new HashMap<>();

    public Inventory() {
        this.listProducts.put(1, new Product(1, "Arroz", 5500, 65));
        this.listProducts.put(1, new Product(2, "Cafe", 980, 647));
        this.listProducts.put(1, new Product(3, "Cepillos", 550, 12));
        this.listProducts.put(1, new Product(4, "Jabon Liquido", 7800, 24212));
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
        for (Product x : this.listProducts.values()) {
            id = x.getId();
        }
        return id;
    }

    public void addNewProduct(Product x) {
        this.listProducts.put(x.getId(), x);
    }

    public void updateProduct(Product x) {
        this.listProducts.replace(x.getId(), x);
    }

    public void deleteProduct(Product x) {
        this.listProducts.remove(x.getId(), x);
    }

}
