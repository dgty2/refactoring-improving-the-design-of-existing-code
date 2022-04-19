package chapter08.ver3;


public class Order {

    Customer customer;

    public Order(String customerName) {
        customer = Customer.getNamed(customerName);
    }

    public Customer getCustomer() {
        return customer;
    }



    public String getCumstomerName() {
        return customer.get_name();
    }

}
