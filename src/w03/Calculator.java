package w03;

public class Calculator {
    //계산기
    private AbstractOperation ope; // 추상화 클래스를 퍼블릭으로 불러옴
    public Calculator (AbstractOperation op){ // 추상화 클래스의 op를 받아와서      생성자
        this.ope = op;                           // Calculator의 op에 값을 넣음
    }
    public void setOp (AbstractOperation op){   // 사칙연산 연산자를 변경해줌
        this.ope = op;
    }
    public double Cal (double first, double second){
        double ans = 0;                     // 더블로 ans 만들고 값 0으로 초기화
        ans = ope.oper(first,second);        // ans의 값은 추상화 클래스 AbstractOperation에
                                                // 값을넣어서 나오는 값을 저장
        return ans;                             // ans 를 반환
    }

}
