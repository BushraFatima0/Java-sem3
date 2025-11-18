class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }
}
class MidException extends BaseException {
    public MidException(String message) {
        super(message);
    }
}
class TopException extends MidException {
    public TopException(String message) {
        super(message);
    }
}
class A {
    void show() throws BaseException {
        throw new BaseException("Exception at Level 1 (BaseException) from class A");
    }
}
class B extends A {
    @Override
    void show() throws MidException {
        throw new MidException("Exception at Level 2 (MidException) from class B");
    }
}
class C extends B {
    @Override
    void show() throws TopException {
        throw new TopException("Exception at Level 3 (TopException) from class C");
    }
}
public class ExceptionHierarchy {
    public static void main(String[] args) {
        System.out.println("Bushra 24csu265");
        A obj = new C();
        try {
            obj.show();
        } catch (BaseException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
