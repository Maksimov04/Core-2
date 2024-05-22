package task.collection;

import java.util.ArrayList;
import java.util.List;

public class Order {
    int id;
    String customer;
    int totalAmount;


    public Order(int id, String customer, int totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    public static void printOrdersWithHighestTotal(List<Order> orders) {
        orders.stream().sorted((order1, order2) -> Double.compare(order2.totalAmount, order1.totalAmount)).forEach(System.out::println);
    }

    public static double calculateTotalAmount(List<Order> orders) {
        return orders.stream().mapToDouble(order -> order.totalAmount).sum();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Ilya", 550000));
        orders.add(new Order(2, "Misha", 444500));
        orders.add(new Order(3, "Maria", 3433000));
        orders.add(new Order(4, "Petr", 125200));

        printOrdersWithHighestTotal(orders);

        System.out.println("\n" + "Total amount of all orders: " + calculateTotalAmount(orders));
    }
}




