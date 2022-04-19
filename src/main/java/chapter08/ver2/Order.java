package chapter08.ver2;


public class Order {

    Customer customer;

    public Order(String customerName) {
        customer = Customer.getNamed(customerName);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(String customerName) {
        customer = new Customer(customerName);
    }

    public String getCumstomerName() {
        return customer.get_name();
    }

}
