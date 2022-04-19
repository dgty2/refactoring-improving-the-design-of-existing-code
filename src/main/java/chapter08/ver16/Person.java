package chapter08.ver16;


 class Person {



    private final Boolean _isMale;
    private final char _code;

    protected Person(Boolean isMale, char code) {
        _isMale = isMale;
        _code = code;
    }

     /**
      * 字段取代子类，构造器取代子类
      * @param isMale 是否为男性
      *               true:男性       false:女性
      *
      * @return
      */
    static Person createMale() {
        return new Person(true, 'M');
    }


    public static void main(String[] args) {

    }


}

