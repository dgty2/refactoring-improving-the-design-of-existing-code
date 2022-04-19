package chapter08.ver11;

import com.sun.org.apache.xpath.internal.operations.String;
import java.util.Collections;
import java.util.Set;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-08 10:55
 */
public class Person {

    private Set _courses;

    Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Set get_courses() {
        //返回不可修改对象set实例，确保不能通过取值函数修改，只能通过对象修改
        return Collections.unmodifiableSet(_courses);
    }

    public void addCourse(Course _courses) {
        //只能通过对象修改
        this._courses.add(_courses);
        String[] strings = new String[10];
        String[] rel = new String[strings.length];
        System.arraycopy(strings, 0, rel, 0, strings.length);

    }
}
