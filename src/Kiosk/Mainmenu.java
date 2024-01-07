package Kiosk;

import java.util.Scanner;

public class Mainmenu {
    static void mainmenu() {
        Menu.bar();
        Top.top();
        Menu.mainmenu();
        Menu.menuorder1();

        Scanner ac = new Scanner(System.in);
        int a = ac.nextInt();
        if (0>=a || a >=8){
            Wrong.wrong();
        }

        switch (a) {
            case 1:
                MenuSelect.hamburger();
            case 2:
                MenuSelect.setmenu();
            case 3:
                MenuSelect.happysnack();
            case 4 :
                MenuSelect.side();
            case 5 :
                MenuSelect.happymill();
            case 6 :
                My.mycarry();
            case 7 :
                System.out.println("주문 프로그램을 종료합니다");
                System.exit(0);

        }
    }
}
