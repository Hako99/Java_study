package Kiosk;

import java.util.Scanner;

public class MenuCheck {
    void burgercheck(int b) {
        if (0 < b && b <=6 ) {
            b = b - 1;
            System.out.println("선택하신 메뉴 [ " + Menu.burger[b] + " ] 을(를) 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인         2. 취소");
            Scanner ac = new Scanner(System.in);
            int a = ac.nextInt();
            switch (a) {
                case 1:
                    Main.my.add(Menu.burger[b]);
                    MenuSelect.hamburger();
                case 2:
                    MenuSelect.hamburger();
            }
        } else if (b == 7) {
            My.mycarry();
            MenuSelect.hamburger();
        }else if (b == 8){
            Mainmenu.mainmenu();
        } else {
           Wrong.wrong();
        }

    }
    void setmenucheck(int b) {
        if (0 < b && b <=6 ) {
            b = b - 1;
            System.out.println("선택하신 메뉴 [ " + Menu.setmenu[b] + " ] 을(를) 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인         2. 취소");
            Scanner ac = new Scanner(System.in);
            int a = ac.nextInt();
            switch (a) {
                case 1:
                    Main.my.add(Menu.setmenu[b]);
                    MenuSelect.setmenu();
                case 2:
                    MenuSelect.setmenu();
            }
        } else if (b == 7) {
            My.mycarry();
            MenuSelect.hamburger();
        }else if (b == 8){
            Mainmenu.mainmenu();
        } else {
            Wrong.wrong();
        }

    }
    void happysnack(int b) {
        if (0 < b && b <=5 ) {
            b = b - 1;
            System.out.println("선택하신 메뉴 [ " + Menu.happysnack[b] + " ] 을(를) 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인         2. 취소");
            Scanner ac = new Scanner(System.in);
            int a = ac.nextInt();
            switch (a) {
                case 1:
                    Main.my.add(Menu.happysnack[b]);
                    MenuSelect.happysnack();
                case 2:
                    MenuSelect.happysnack();
            }
        } else if (b == 6) {
            My.mycarry();
            MenuSelect.hamburger();
        }else if (b == 7){
            Mainmenu.mainmenu();
        } else {
            Wrong.wrong();
        }

    }
    void side(int b) {
        if (0 < b && b <=6 ) {
            b = b - 1;
            System.out.println("선택하신 메뉴 [ " + Menu.side[b] + " ] 을(를) 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인         2. 취소");
            Scanner ac = new Scanner(System.in);
            int a = ac.nextInt();
            switch (a) {
                case 1:
                    Main.my.add(Menu.side[b]);
                    MenuSelect.side();
                case 2:
                    MenuSelect.side();
            }
        } else if (b == 7) {
            My.mycarry();
            MenuSelect.hamburger();
        }else if (b == 8){
            Mainmenu.mainmenu();
        } else {
            Wrong.wrong();
        }

    }
    void happymill(int b) {
        if (0 < b && b <=6 ) {
            b = b - 1;
            System.out.println("선택하신 메뉴 [ " + Menu.happymill[b] + " ] 을(를) 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인         2. 취소");
            Scanner ac = new Scanner(System.in);
            int a = ac.nextInt();
            switch (a) {
                case 1:
                    Main.my.add(Menu.happymill[b]);
                    MenuSelect.happymill();
                case 2:
                    MenuSelect.happymill();
            }
        } else if (b == 7) {
            My.mycarry();
            MenuSelect.hamburger();
        }else if (b == 8){
            Mainmenu.mainmenu();
        } else {
            Wrong.wrong();
        }

    }



}

