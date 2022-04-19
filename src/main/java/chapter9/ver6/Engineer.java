package chapter9.ver6;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-12 16:33
 */
public class Engineer extends EmployeeType {


    @Override
    public int payAmount(Employee employee) {
        return employee.getMonthlySalary();
    }

    @Override
    public int getTypeCode() {
        return ENGINEER;
    }
}
