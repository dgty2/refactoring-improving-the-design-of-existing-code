package chapter10.ver5;

import org.junit.Test;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-13 14:19
 */
public class Employee {

    private double salary;

    void tenPercentRaise() {
        System.out.println("10% raise");
    }

    void fivePercentRaise() {
        System.out.println("5% raise");
    }

    void raise(double factor) {
        salary *= (1 + factor);

    }


    Dollars baseCharge() {
        double result = Math.min(lastUsage(), 100) * 0.03;
        result += usageInRange(100, 300) * 0.05;
        result += usageInRange(200, Integer.MAX_VALUE) * 0.07;
        return new Dollars(result);
    }

    private double usageInRange(int start, int end) {
        if (lastUsage() > start) {
            return Math.min(lastUsage(), end) - start;
        } else {
            return 0;
        }
    }

    private int lastUsage() {

        return 330;
    }


    @Test
    public void test() {
        baseCharge();
    }
}
