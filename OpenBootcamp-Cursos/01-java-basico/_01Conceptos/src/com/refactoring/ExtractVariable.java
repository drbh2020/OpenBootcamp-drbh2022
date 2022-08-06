package com.refactoring;

public class ExtractVariable {

    void printProductPrive(Order order) {
        //En vez de esto
        /*Double totalPrice = order.getPrice() * order.getQuantity() - order.getOffer() + order.getShipping() * 2;
        System.out.println(totalPrice);*/

        // 1. precio total de los productos
        Double quantityPrice = order.getPrice() * order.getQuantity();

        // 2. Descuento
        Double offerPrice = order.getPrice() * order.getOffer();

        // 3. Precio final = precio total menos descuento
        Double finalPrice = quantityPrice - offerPrice;

        // 4. cálculo del precio del envío
        Double shippingPrice = order.getShipping() * 2;

        // 5. precio final
        System.out.println(finalPrice + shippingPrice);

    }
}
