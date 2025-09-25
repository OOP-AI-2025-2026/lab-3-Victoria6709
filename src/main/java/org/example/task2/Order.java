package org.example.task2;

public class Order {

    private final long id;
    private final String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {
        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(id).append(" for customer ").append(customer);
        builder.append("\n------------------\n");

        double sum = 0.0;

        for (Item item : cart.getItems()) {

            builder.append("Item id: ");
            builder.append(item.getId());
            builder.append(" name: ");
            builder.append(item.getName());
            builder.append(" price: ");
            builder.append(item.getPrice());
            builder.append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ");
        builder.append(sum);

        return builder.toString();
    }
}
