package w03;
public class AddOperation extends AbstractOperation {
    // 더하기
    // 각 사칙연산의 공통된 부분인 숫자, 계산식을 받는 기능은
    // 추상클래스를 통해 받아낸다.
    @Override
    public double oper(double first, double second) {
        return first + second;
    }


}
