package chapter10.ver9;

import java.util.Date;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-14 09:24
 */
public class DateRange {


    final Date start;
    final Date end;

    public DateRange(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }


    /**
     * 改用传参对象   迁移方法到DateRange类中
     */
    public boolean includes(Date chargeDate) {
        return chargeDate.equals(start) || chargeDate.equals(end) || (chargeDate.after(start)
                && chargeDate.before(end));

    }
}
