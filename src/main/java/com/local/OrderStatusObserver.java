package com.local;

public class OrderStatusObserver implements Observer<String> {

    String listenerName;

    public OrderStatusObserver(String listenerName) {
        this.listenerName = listenerName;
    }

    @Override
    public void update(String eventName, String eventData) {
        System.out.println(
                listenerName + " recibio una nueva actualizacion: Pedido: " + eventName + " Estado: " + eventData);
    }
}
