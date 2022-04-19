package chapter05;


public class Account {

    int gamma(int inputval, int quantity, int yearToDate) {
        int importantvalue1 = (inputval * quantity) + delta();
        int irnportantvalue2 = (inputval * yearToDate) + 100;

        if ((yearToDate - importantvalue1) > 100) {
            irnportantvalue2 -= 20;
        }

        int importantvalue3 = irnportantvalue2 * 7;
        //and so on.
        return importantvalue3 - 2 * importantvalue1;


    }

    public int delta() {
        return 1;
    }
}