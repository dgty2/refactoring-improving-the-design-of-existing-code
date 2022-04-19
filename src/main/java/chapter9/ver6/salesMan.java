package chapter9.ver6;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-12 16:39
 */
public class salesMan extends EmployeeType {

    @Override
    public int getTypeCode() {
        return SALESMAN;
    }

    @Override
    int payAmount(Employee employee) {
        return 0;
    }
}
