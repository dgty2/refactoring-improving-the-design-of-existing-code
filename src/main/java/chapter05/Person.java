package chapter05;


public class Person {


    Departmant _departmant;
    private String _name;
    private TelNum telNum = new TelNum();

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public TelNum getTelNum() {
        return telNum;
    }

    public void setTelNum(TelNum telNum) {
        this.telNum = telNum;
    }

    public String get_number() {
        return telNum.get_number();
    }

    public void set_number(String _number) {

        telNum.set_number(_number);
    }

    public String get_areaCode() {
        return telNum.get_areaCode();
    }

    public void set_areaCode(String _areaCode) {
        telNum.set_areaCode(_areaCode);
    }

    public Person getManager() {
        return _departmant.get_manager();

    }

    public static void main(String[] args) {
        Person person = new Person();

        person.getTelNum().set_areaCode("2");
        System.out.println("person = " + person);
        //封装直接调用
        person.set_areaCode("3");


    }


}
