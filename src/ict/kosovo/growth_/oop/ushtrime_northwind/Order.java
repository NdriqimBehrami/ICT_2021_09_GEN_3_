package ict.kosovo.growth_.oop.ushtrime_northwind;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int id;
    private int costumerId;
    private int employeeId;
    private LocalDate orderDate;

    private ArrayList<OrderDetail> orderDetails;
    private Costumer costumer;
    private Employee employee;

    public Order(int id, int costumerId, int employeeId, LocalDate orderDate) {
        this.id = id;
        this.costumerId = costumerId;
        this.employeeId = employeeId;
        this.orderDate = orderDate;
    }

    public Order(int id, int costumerId, int employeeId) {
        this.id = id;
        this.costumerId = costumerId;
        this.employeeId = employeeId;
        this.orderDate = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return costumerId;
    }

    public void setCustomerId(int costumerId) {
        this.costumerId = costumerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void addOrderDetail(OrderDetail detail) {
        if (orderDetails == null)
            orderDetails = new ArrayList<>();
        this.orderDetails.add(detail);
    }

    public double getTotal() {
        double total = 0;
        for (OrderDetail detail : orderDetails) {
            total += detail.getTotal();
        }
        return total;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
         /*
        Numri porosise: 1
        Bleresi: SHPK Adnani
        Addressa: .....
        --------------------------------------
        1 - Jogobella       50  x   0.30    =   15.00 EUR
        2 - Monte           50  x   0.40    =   20.00 EUR
        --------------------------------------
        TOtali: 35.00 EUR.
         */

    public void print() {
        System.out.println("Numri i porosise: " + id);
        System.out.println("Bleresi: " + costumer.getCompanyName());
        System.out.println("Addressa: " + costumer.getAddress() + ", " + costumer.getCity());
        System.out.println("------------------------------------------------------");
        for (OrderDetail detail : orderDetails) {
            detail.print();
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("Totali: %30.2f EUR.", getTotal());
    }
}
