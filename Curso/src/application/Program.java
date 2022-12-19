package application;

import java.util.Date;

import javax.sound.midi.Soundbank;

import entities.Order;
import entitiesenums.OrderStatus;

public class Program {
    public static void main(String[] args) {
        System.out.println("oi");

        Order order = new Order(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
        System.out.println(order);
        OrderStatus os1 = OrderStatus.ENTREGUE;
        OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
        System.out.println(os1);
        System.out.println(os2);
        
    }
}
