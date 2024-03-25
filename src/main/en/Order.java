package main.en;

import java.util.Objects;

public class Order {
    private int id;
    private String model;
    private Status status;

    public Order(int number, String car, Status status) {
        this.id = number;
        this.model = car;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Order order = (Order)o;
            return this.id == order.id && this.model.equals(order.model) && this.status == order.status;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.model, this.status});
    }

    public String toString() {
        return "Order{id=" + this.id + ", model='" + this.model + "', status=" + this.status + "}";
    }
}