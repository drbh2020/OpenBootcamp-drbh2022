package removeassign.bad;

public class Main {

    //No es una función pura, totalPrice es modificado dentro de la función
    double calculateDiscount(Order order, double totalPrice){
        if (order == null || order.getPrice() == null)  // programacion defensiva
            return totalPrice;

        if (order.getPrice() > 100)
            totalPrice += order.getPrice() * order.getOffer(); // sobreescribe totalPrice
        return totalPrice;
    }

}
