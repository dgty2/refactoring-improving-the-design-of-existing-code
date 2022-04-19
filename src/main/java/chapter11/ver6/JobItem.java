package chapter11.ver6;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-14 14:14
 */
public class JobItem {

    int _unitPrice;
    int _quantity;
    protected Employee employee;  // 员工
    boolean _isLabor;   // 是否工时

    public int get_unitPrice() {
        return _unitPrice;
    }

    protected JobItem(int _unitPrice, int _quantity, boolean _isLabor) {
        this._unitPrice = _unitPrice;
        this._quantity = _quantity;
        this._isLabor = _isLabor;
    }

    public JobItem(int _unitPrice, int _quantity) {
        this(_unitPrice, _quantity, false);
    }

    public int get_quantity() {
        return _quantity;
    }


    protected boolean isLabor() {
        return true;
    }


}
