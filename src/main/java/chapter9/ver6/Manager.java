package chapter9.ver6;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-12 16:34
 */
public class Manager extends EmployeeType {

    @Override
    public int payAmount(Employee employee) {
        return 0;
    }

    @Override
    public int getTypeCode() {
        return MANAGER;
    }
}
