package w03_Calculator;

import java.util.Scanner;

public class Main {
    // 메인
    public static void main(String[] args) {
        System.out.println("a 계산식 b");
        System.out.println("a에 들어갈 숫자를 입력해 주세요");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("계산식을 입력해 주세요 ( + - * / )");
        String c = sc.next();
        System.out.println("b에 들어갈 숫자를 입력해 주세요");
        double b = sc.nextDouble();

        System.out.println("입력한 계산식 : " + a + c + b);

        Calculator cal = new Calculator(new AddOperation());
        switch (c){
            case "+" :
                //더하기일 경우
            cal.setOp(new AddOperation());  // Calculator 클래스의 setOP 에다가 더하기쪽으로 연결시킴
                System.out.println("계산 결과 : " + cal.Cal(a,b));
                break;
            case "-" :
                // 뺴기일 경우
                cal.setOp(new SubstractOperation());
                System.out.println("계산 결과 : " + cal.Cal(a,b));
                break;
            case "*" :
                // 곱하기일 경우
                cal.setOp(new MultiplyOperation());
                System.out.println("계산 결과 : " + cal.Cal(a,b));
                break;
            case "/" :
                // 나누기일 경우
                cal.setOp(new DivideOperation());
                System.out.println("계산 결과 : " + cal.Cal(a,b));
//                cal.setOp(new Remainder());
//                System.out.println("나머지 : " + cal.Cal(a,b));
                break;
        }




    }
}
