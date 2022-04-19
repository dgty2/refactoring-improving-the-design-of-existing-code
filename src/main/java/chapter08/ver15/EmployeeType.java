package chapter08.ver15;

/**
 * @Description
 * @Author dgty
 * @time 2022-04-12 16:32
 */
abstract class EmployeeType {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static EmployeeType newType(int code) {
        switch (code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new salesMan();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee code");
        }
    }



    public abstract int getTypeCode();

}
