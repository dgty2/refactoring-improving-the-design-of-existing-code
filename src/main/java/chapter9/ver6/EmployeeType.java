package chapter9.ver6;

import chapter08.ver15.Engineer;
import chapter08.ver15.Manager;
import chapter08.ver15.salesMan;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-12 16:32
 */
abstract class EmployeeType {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

/*    static EmployeeType newType(int code) {
        switch (code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new salesMan();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee code");
        }
    }*/

/*    int payAmount(Employee employee) {
        switch (getTypeCode()) {
            case ENGINEER:
                return employee.getMonthlySalary();
            case SALESMAN:
                return 1;
            case MANAGER:
                return 2;
            default:
                throw new IllegalArgumentException("Incorrect Employee code");
        }
    }*/

    abstract int getTypeCode();
    // TODO: 2022/4/13 多态取代case语句
    /**
     * @Description
     */
    abstract int payAmount(Employee employee);
}
