package chapter10.ver9;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;
import org.junit.Test;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-14 09:14
 */
public class Account {

    private Vector _entries = new Vector();    // 交易记录


    /**
     * double getFlowBetween(Date start, Date end, DateRange range) 改为传参对象  DateRange
     */
    // double getFlowBetween(Date start, Date end, DateRange range) {
    double getFlowBetween(DateRange range) {
        double result = 0;
        Enumeration elements = _entries.elements();
        while (elements.hasMoreElements()) {    // 遍历所有交易记录
            Entry entry = (Entry) elements.nextElement();

            if (range.includes(entry.get_chargeDate())) {

                {    // 如果交易日期在指定日期范围内

                    result += entry.get_value();

                }

            }

        }

        return result;
    }

    @Test
    public void test1() {

        Account account = new Account();

    }
}
