package com.local;

import java.util.ArrayList;
import java.util.List;

public class OrderStatusNotifier implements Subject<String> {

    List<Observer<String>> observers = new ArrayList<>();
    String orderId;
    String orderStatus;

    public OrderStatusNotifier(String orderId, String orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }

    // Cambiar order Status
    public void setOrderStatus(String newOrderStatus) {
        if (!newOrderStatus.equals(orderStatus)) {
            orderStatus = newOrderStatus;
            notifyObservers(); // Notificar a los observadores sobre el cambio de estado del pedido
        }
    }

    @Override
    public void addObserver(Observer<String> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<String> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(x -> x.update(orderId, orderStatus));
    }

}
