package com.local;

public class Main {
    public static void main(String[] args) {

        OrderStatusNotifier orderStatusNotifier = new OrderStatusNotifier("ORD123", "Creado");
        Observer<String> listener1 = new OrderStatusObserver("Logistica");
        Observer<String> listener2 = new OrderStatusObserver("Facturacion");

        orderStatusNotifier.addObserver(listener1);
        orderStatusNotifier.addObserver(listener2);

        orderStatusNotifier.setOrderStatus("En proceso");
        orderStatusNotifier.setOrderStatus("En entrega");

    }
}