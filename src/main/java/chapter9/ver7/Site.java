package chapter9.ver7;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-13 10:44
 */
public class Site {


    Customer _customer;

    public Customer get_customer() {
        return _customer == null ? Customer.getNullCustomer() : _customer;
    }

    public void set_customer(Customer _customer) {
        this._customer = _customer;
    }


    public static void main(String[] args) {
        Site site = new Site();
        BillingPlan billingPlan = new BillingPlan();
        // TODO: 2022/4/13  判断语句写在site中,没有拿空对象
        /**
         * 如果没有设置customer，那么就会调用getNullCustomer()方法
         */
        Customer customer = site.get_customer();
        if (customer.isnull(null)) {
            billingPlan = BillingPlan.basic();
        } else {
            billingPlan = customer.getPlan();
        }

        String customerName;
        if (customer.isnull(null)) {
            customerName = "Customer";
        } else {
            customerName = customer.getName();
        }
    }

}
