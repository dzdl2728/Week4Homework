package MyException;

import MyException.RedefineException.MyException;

public class EXC1 {
    EXC2 ex2=new EXC2();
    public void backEXC2RT(){
        System.out.println("EC2RT Begin");
        ex2.backRTException();
        System.out.println("EC2RT OVER");
    }

    public void  backEXP() throws MyException {
        System.out.println("EXC2 Begin");
        ex2.backException();
        System.out.println("EXC2 Over");
    }


}
