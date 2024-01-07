package Kiosk;

import java.util.HashMap;
import java.util.Scanner;

public class My {
    static void mycarry() {
        HashMap<String, Integer> menulist = new HashMap<>();
        menulist.put("행운버거 골드", 6800);
        menulist.put("행운버거 골드 스페셜", 7800);
        menulist.put("빅맥", 4800);
        menulist.put("더블 쿼터 파운더 치즈", 5800);
        menulist.put("쿼터 파운더 치즈", 5300);
        menulist.put("맥크리스피 디럭스 버거", 5800);
        menulist.put("빅맥 세트", 5800);
        menulist.put("맥크리스피 디럭스 버거 세트", 6800);
        menulist.put("맥스파이시 상하이 버거 세트", 5800);
        menulist.put("1955 버거 세트", 5800);
        menulist.put("더블 불고기 버거 세트", 4800);
        menulist.put("베이컨 토마토 디럭스 세트", 5800);
        menulist.put("아이스 아메리카노", 1500);
        menulist.put("카페 라떼", 3500);
        menulist.put("코카 콜라", 1800);
        menulist.put("골든 모짜렐라 치즈스틱", 2500);
        menulist.put("맥스파이시 치킨 텐더", 1900);
        menulist.put("컬리 후라이", 2400);
        menulist.put("토마토 치킨 스낵랩", 2800);
        menulist.put("후렌치 후라이", 1800);
        menulist.put("라즈베리 크림치즈 파이", 2300);
        menulist.put("베리 스트로베리 맥플러리", 3300);
        menulist.put("딸기 오레오 맥플러리", 3300);
        menulist.put("에그 맥머핀", 2500);
        menulist.put("핫케익", 2800);
        menulist.put("딸기 코코넛 푸딩", 1800);
        menulist.put("해쉬 브라운", 1500);
        menulist.put("생수", 1200);
        menulist.put("오렌지 주스", 1400);


        if (!Main.my.isEmpty()) {
            System.out.println("아래와 같이 주문 하시겠습니까?");
            System.out.println("[ Orders ]");
            for (String a : Main.my) {
                System.out.println(a + "  " + menulist.get(a) + " 원");

            }
            System.out.println("[ Total ]");
            int sum = 0;
            for (String a : Main.my) {
                sum = sum + menulist.get(a);
            }
            System.out.println(sum + " 원 입니다.");

            System.out.println();
            System.out.println("결제하시겠습니까?");
            System.out.println("1. 예     2. 아니오     3. 장바구니 비우기");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("결제가 완료되었습니다. 프로그램을 종료합니다.");
                    System.exit(0);
                case 2:
                    System.out.println("결제가 취소 되었습니다.");
                    My.mycarry();
                case 3:
                    System.out.println("장바구니를 비웠습니다. 메인화면으로 돌아갑니다.");
                    Main.my.clear();
                    Mainmenu.mainmenu();
                default:
                    System.out.println("입력이 잘못되었습니다.");
                    My.mycarry();

            }


        }else {
            System.out.println("장바구니가 비어있습니다 메인화면으로 진행합니다.");
            Mainmenu.mainmenu();
        }


    }
}

