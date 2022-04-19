package chapter08.ver4;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import java.util.Set;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-08 09:43
 */
public class Currency {

    private String _code;



    public String get_code() {
        return _code;
    }

    public void set_code(String code) {
        this._code = code;
    }

    @Override
    public boolean equals(Object arg) {
        if (!(arg instanceof Currency)) {
            return false;
        }
        Currency other = (Currency) arg;
        return (_code.equals(other._code));


    }

    @Override
    public int hashCode() {
        return _code.hashCode();
    }

    private Currency(String _code) {
        this._code = _code;
    }

    public static void main(String[] args) {
        boolean equals = new Currency("usd").equals(new Currency("usd"));
        System.out.println("equals = " + equals);

        Set<String> strings = new HashSet<String>();
        strings.add("sdfs");
        //unmodifiableSet可以用get方法返回，添加数据时必须通过对象，该
        Set<String> strings1 = Collections.unmodifiableSet(strings);
        strings1.add("sdfs");

    }

}
