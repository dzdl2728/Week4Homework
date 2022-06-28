package MyException.RedefineException;

public class MyRuntimeExcption extends  RuntimeException {

    public MyRuntimeExcption() {
    }

    public MyRuntimeExcption(String message) {
        super(message);
    }

    public MyRuntimeExcption(String message, Throwable cause) {
        super(message, cause);
    }

    public MyRuntimeExcption(Throwable cause) {
        super(cause);
    }
}
