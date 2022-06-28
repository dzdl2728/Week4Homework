package MyException;

import MyException.RedefineException.*;
import java.io.IOException;

public class EXC2 {

    public void backRTException(){
        System.out.println("EXC2.backRTException begin");
        try {
            Object n = null;
            n.toString();
        } catch (Exception ex) {
            throw new MyRuntimeExcption("backRTException is wrong", ex);
        }
        System.out.println("EC2.backRTException  begin");
    }

    public void backException() throws MyException {
        System.out.println("EXC2.backException begin");
        try {
            Class.forName("MyException");
        } catch (ClassNotFoundException ex) {
            throw new MyException("", ex);
        }
        System.out.println("EC2.backRTException  over");
    }
}
