package chapter08.ver3;


import java.util.Collection;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class Customer {

    private static Dictionary _instance = new Hashtable();
    private final String _name;

    private Customer(String name) {
        _name = name;
    }

    public String get_name() {
        return _name;
    }

    public static Customer getNamed(String _name) {
        return (Customer) _instance.get(_name);
    }

    static void loadCustomers() {
        new Customer("lem").store();
        new Customer("lem22").store();
        new Customer("lem33").store();

    }


    private void store() {
        _instance.put(this.get_name(), this);
    }


    public static void main(String[] args) {
        Customer.loadCustomers();
        Customer lem = Customer.getNamed("lem");
        Enumeration keys = _instance.keys();
        String s = keys.nextElement().toString();

        Customer customer = (Customer) _instance.get(s);
        int size = _instance.size();
        System.out.println("size = " + size);
        System.out.println("customer.get_name() = " + customer.get_name());
        System.out.println("lem = " + lem.get_name());
    }


    private static int numberOfOrdersFor(Collection orders, String customer) {
        int result = 0;
        Iterator iterator = orders.iterator();
        while (iterator.hasNext()) {

            Order next = (Order) iterator.next();
            if (next.getCumstomerName().equals(customer)) {
                result++;
            }
        }
        return result;
    }


}
