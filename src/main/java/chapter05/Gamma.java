package chapter05;


import org.junit.Test;

public class Gamma {

    private int importantvalue1;
    private int importantvalue2;
    private int importantvalue3;
    private final Account _account;
    private int inputval;
    private int quantity;
    private int yearToDate;

    public Gamma(Account _account, int inputval, int quantity, int yearToDate) {
        this._account = _account;
        this.inputval = inputval;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    int Gamma(int inputval, int quantity, int yearToDate) {
        return new Gamma(this._account, inputval, quantity, yearToDate).compute();
    }

    public Gamma() {

        _account = null;
    }

    int compute() {
        importantvalue1 = (inputval * quantity) + _account.delta();
        importantvalue2 = (inputval * yearToDate) + 100;
        importantThing();
        int importantvalue3 = importantvalue2 * 7;
        return importantvalue3 - 2 * importantvalue1;


    }

    private void importantThing() {
        if ((yearToDate - importantvalue1) > 100) {
            importantvalue2 -= 20;
        }
    }


    @Test
    public void testRepObjMeth() {

    }

}
