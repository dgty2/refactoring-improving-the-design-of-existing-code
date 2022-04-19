package chapter11.ver6;

import org.junit.Test;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-14 14:17
 */
public class JobItemTest {


    @Test
    public void testJobItem() {
        JobItem jobItem = new JobItem(10, 15);
        System.out.println(jobItem);

        JobItem laborItem = new LaborItem(10, new Employee());

        System.out.println(laborItem);
    }


}
