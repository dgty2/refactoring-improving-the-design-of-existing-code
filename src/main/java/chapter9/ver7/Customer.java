package chapter9.ver7;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-13 10:22
 */
public class Customer implements Nullable {

    String name;    // 客户姓名
    String plan;    // 客户计划
    String History; // 客户历史

    public BillingPlan getPlan() {
        return new BillingPlan();
    }

    public PaymentHistory getHistory() {
        return new PaymentHistory();
    }


    public boolean isnull(String name) {
        return false;
    }

    public String getName() {
        return "occupant";
    }


    static Customer getNullCustomer() {
        return new NullCustomer();
    }
}
