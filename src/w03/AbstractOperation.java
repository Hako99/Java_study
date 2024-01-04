package w03;

public abstract class AbstractOperation {
    //추상 클래스
    // 중간다리단계로 각 사칙연산에서의 공통 기능인 각각인수를 받는 기능까지 넣어준다
    // first, second 두개의 숫자와 op 계산식을 받음
    public abstract double oper (double first, double second);
}
