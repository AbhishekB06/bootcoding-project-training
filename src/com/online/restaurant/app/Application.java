package com.online.restaurant.app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {

        Customer ramesh = new Customer();

        ramesh.setName("Ramesh");
        ramesh.setCity("Nagpur");
        ramesh.setAddress("New Nandanwan, Nagpur");
        ramesh.setState("Maharashtra");
        ramesh.setEmailId("abc@gmail.com");
        ramesh.setPhoneNumber(0712223344);

        Vendor haldiram = new Vendor();
        haldiram.setName("Haldiram Veg Restaurant");
        haldiram.setAddress("Medical Square, Nagpur");
        haldiram.setCategory("Veg");
        haldiram.setPhoneNumber(1234567890);
        haldiram.setRating(5.0);
        haldiram.getState("Mahrashtra");
        haldiram.setCity("Nagpur");

        System.out.println("Vendor Details:");
        System.out.println("Name:"+ haldiram.getName());
        System.out.println("Address :"+ haldiram.getAddress());
        System.out.println("Catgory :"+ haldiram.getCategory());
        System.out.println("Phone :"+ haldiram.getPhoneNumber());
        System.out.println("Rating :" + haldiram.getRating());
        System.out.println("State :"+ haldiram.getState());
        System.out.println("City :"+ haldiram.getCity());

        Order order = new Order();
        order.setCustomer(ramesh);
        order.setVendor(haldiram);
        order.setTotalAmount(999.00);
        order.SetOrderDate(new Date());
        order.setDeliveryAddress("Tulsibaugh Road, Mahal, Nagpur");

    }
}
