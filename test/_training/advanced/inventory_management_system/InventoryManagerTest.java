package _training.advanced.inventory_management_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryManagerTest {

    private InventoryManager manager;

    @BeforeEach
    void init() {
        manager = new InventoryManager();
    }

    @Test
    void testAddProduct() {
        Product p = manager.addProduct("Laptop", 1200.0, 10);
        assertNotNull(p.getId());
        assertEquals("Laptop", p.getName());
    }

    @Test
    void testUpdateProduct() {
        Product p = manager.addProduct("Phone", 500, 5);
        boolean updated = manager.updateProduct(p.getId(), "Smartphone", 650.0, 7);
        assertTrue(updated);
        Product updatedProduct = manager.findById(p.getId()).get();
        assertEquals("Smartphone", updatedProduct.getName());
        assertEquals(650.0, updatedProduct.getPrice());
        assertEquals(7, updatedProduct.getQuantity());
    }

    @Test
    void testRemoveProduct() {
        Product p = manager.addProduct("Tablet", 300.0, 3);
        boolean removed = manager.removeProduct(p.getId());
        assertTrue(removed);
        assertFalse(manager.findById(p.getId()).isPresent());
    }

    @Test
    void testFindAllProducts() {
        manager.addProduct("Item 1", 100, 1);
        manager.addProduct("Item 2", 200, 2);
        List<Product> list = manager.findAll();
        assertEquals(2, list.size());
    }

    @Test
    void testFindById() {
        Product p = manager.addProduct("Mouse", 25.0, 50);
        assertTrue(manager.findById(p.getId()).isPresent());
    }
}
