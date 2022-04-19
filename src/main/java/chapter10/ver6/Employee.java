package chapter10.ver6;


/**
 * @Description
 * @Author dgty
 * @time 2022-04-12 16:28
 */
public class Employee {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private int _type;
    private EmployeeType employeeType;
/*    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;*/

    /**
     * 用函数代替参数创建对象
     */
    static Employee create(int type) {

        switch (type) {
            case ENGINEER:
                return Employee.createEngineer();
/*            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();*/
            default:
                throw new IllegalArgumentException("Incorrect type");
        }
    }

    private static Engineer createEngineer() {

        return new Engineer();
    }

}


