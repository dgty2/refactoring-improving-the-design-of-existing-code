package chapter11.ver6;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-14 14:19
 */
public class LaborItem extends JobItem {

    Employee _employee;

    public Employee get_employee() {
        return _employee;
    }

    /**
     *
     */
    // TODO: 2022/4/14 父类特性移到子类处理
    public LaborItem(int _unitPrice, int _quantity, Employee employee, boolean _isLabor) {
        super(0, _quantity, true);
        _employee = employee;
    }

    public LaborItem(int _quantity, Employee employee) {
        this(0, _quantity, employee, true);
    }


    @Override
    protected boolean isLabor() {
        return true;
    }


    @Override
    public int get_unitPrice() {
        return employee.get_rate();
    }


}
