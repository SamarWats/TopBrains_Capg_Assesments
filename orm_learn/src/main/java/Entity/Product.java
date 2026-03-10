package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Product {
    @Id
    private int pid;
    private String name;
    private double price;
    private int qty;
    private LocalDate dom;

    public Product() {
    }

    public Product(int id, String name, double price, int qty, LocalDate dom) {
        this.pid = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.dom = dom;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setDom(LocalDate dom) {
        this.dom = dom;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDom() {
        return dom;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public int getPid() {
        return pid;
    }
}