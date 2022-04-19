package chapter10.ver7;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-13 15:01
 */
public class Room {


    private TempRange _range;

    /**
     * @return the _range  对象传输，不需要分离字段出来
     * @param plan
     * @return
     */
    boolean withinPlan(HeatingPlan plan) {
   /*     int low = daysTempRange().getlow();
        int high = daysTempRange().gethigh();
        return plan.withinRange(daysTempRange(), low, high);*/
        return plan.withinRange(daysTempRange());
    }

    private TempRange daysTempRange() {
        return new TempRange();
    }


    class HeatingPlan {

        boolean withinRange(TempRange tempRange) {

            return _range.includes(tempRange);
  /*          return (tempRange.getlow() >= _range.getlow()
                    && tempRange.gethigh() <= _range.gethigh());*/
        }
    }

    class TempRange {

        int low;
        int high;

        public int getlow() {
            return low;
        }

        public int gethigh() {
            return high;
        }

        /**
         * @Description 比较两个温度范围是否相等
         */
        public boolean includes(TempRange tempRange) {
            return (tempRange.getlow() >= this.getlow()
                    && tempRange.gethigh() <= this.gethigh());
        }

    }


}
