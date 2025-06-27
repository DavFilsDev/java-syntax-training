package _training.advanced.inventory_management_system;

import java.util.*;

public class InventoryManager {
    private final Map<String, Product> products = new HashMap<>();

    public Product addProduct(String name, double price, int quantity) {
        Product p = new Product(name, price, quantity);
        products.put(p.getId(), p);
        return p;
    }

    public boolean updateProduct(String id, String newName, double newPrice, int newQty) {
        Product p = products.get(id);
        if (p != null) {
            p.update(newName, newPrice, newQty);
            return true;
        }
        return false;
    }

    public boolean removeProduct(String id) {
        return products.remove(id) != null;
    }

    public Optional<Product> findById(String id) {
        return Optional.ofNullable(products.get(id));
    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }
}
