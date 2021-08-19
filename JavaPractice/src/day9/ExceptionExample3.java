package day9;

public class ExceptionExample3 {

    public static void main(String[] args) throws SpaceException {
        methodA(5);
    }

    static void methodA(int space) throws SpaceException {
        if (space < 1) {
            throw new SpaceException("공간 부족");
        }
    }
}

class SpaceException extends Exception {
    public SpaceException(String message) {
        super(message);    /// 조상 클래스인 Exception의 생성자 호출/
    }

}
