package chapter9.ver7;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-13 10:33
 */
public class NullCustomer extends Customer {

    private static final long serialVersionUID = 1L;

    @Override
    public boolean isnull(String name) {
        return true;
    }
}
