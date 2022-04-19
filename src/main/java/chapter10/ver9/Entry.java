package chapter10.ver9;

import java.util.Date;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-14 09:09
 */
public class Entry {


    private Date _chargeDate;
    private double _value;

    public Entry(Date chargeDate, double value) {
        _chargeDate = chargeDate;
        _value = value;
    }

    public Date get_chargeDate() {
        return _chargeDate;
    }

    public double get_value() {
        return _value;
    }



}
