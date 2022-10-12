package com.online.restaurant;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderName;

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public String getDiliveryAddress() {
        return diliveryAddress;
    }

    public void setDiliveryAddress(String diliveryAddress) {
        this.diliveryAddress = diliveryAddress;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderMenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<OrderMenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    private double orderPrice ;
    private int OrderID ;
    private String diliveryAddress;
    private Vendor vendor;
    private Customer customer;
    private List<OrderMenuItem> menuItems;
    private Date orderDate;


    public void setTotalAmount(double v) {
    }

    public void SetOrderDate(Date date) {
    }

    public void setDeliveryAddress(String s) {
    }
}
