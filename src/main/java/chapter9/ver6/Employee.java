package chapter9.ver6;


/**
 * @Description
 * @Author dgty
 * @time 2022-04-12 16:28
 */
public class Employee {

    private int _type;
    private EmployeeType employeeType;
/*    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;*/

    public Employee(int type) {
        _type = type;
    }

    public int getType() {
        return employeeType.getTypeCode();
    }

    public void set_type(int arg) throws Exception {
     /*  switch (arg) {
            case ENGINEER:
                employeeType = new Engineer();
                break;
            case SALESMAN:
                employeeType = new Engineer();
                break;
            case MANAGER:
                employeeType = new Engineer();
                break;
            default:
                throw new Exception("Invalid Employee Type");*/
        //employeeType = EmployeeType.newType(arg);
    }


    int payAmount() {
        return employeeType.payAmount(this);
    }

    /**
     * 通过子类的类型来获取
     */
    private int gettype() {
        return employeeType.getTypeCode();
    }


    public int getMonthlySalary() {

        return 0;
    }
}


