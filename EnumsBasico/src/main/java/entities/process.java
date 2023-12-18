package entities;

import entities.enums.OrderStatus;

public class process {

    private Integer id;
    private String name;

    private OrderStatus status;

    public process(java.lang.Integer id, java.lang.String name, OrderStatus status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "process{" +
                "id=" + id +
                ", name=" + name +
                ", status=" + status +
                '}';
    }
}
