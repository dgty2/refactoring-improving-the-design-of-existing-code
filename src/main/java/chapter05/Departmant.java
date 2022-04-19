package chapter05;


public class Departmant {

    private String _charCode;
    private Person _manager;

    public String get_charCode() {
        return _charCode;
    }

    public void set_charCode(String _charCode) {
        this._charCode = _charCode;
    }

    public Person get_manager() {
        return _manager;
    }

    public void set_manager(Person _manager) {
        this._manager = _manager;
    }
}
