package MyException;

import MyException.RedefineException.*;

public class ExcApp {
    public static void main(String[] args) throws MyException {
        EXC1 ex1 =new EXC1();
        System.out.println("let's go");
        ex1.backEXC2RT();
        //ex1.backEXP();
        System.out.println("It's over");
    }
}
