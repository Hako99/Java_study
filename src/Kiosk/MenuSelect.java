package Kiosk;

import java.util.Scanner;

public class MenuSelect {

    public static void hamburger() {
        MenuCheck burger = new MenuCheck();
        Menu.bar();
        Top.top();
        Menu.burgermenu();
        Menu.menuorder2();


        Scanner ac = new Scanner(System.in);
        int b = ac.nextInt();
        burger.burgercheck(b);


    }
    public static void setmenu() {
        MenuCheck setmenu = new MenuCheck();
        Menu.bar();
        Top.top();
        Menu.setmenu();
        Menu.menuorder2();

        Scanner ac = new Scanner(System.in);
        int b = ac.nextInt();
        setmenu.setmenucheck(b);

    }
    public static void happysnack() {
        MenuCheck happysnack = new MenuCheck();
        Menu.bar();
        Top.top();
        Menu.happysnack();
        Menu.menuorder1();

        Scanner ac = new Scanner(System.in);
        int b = ac.nextInt();
        happysnack.happysnack(b);

    }
    public static void side() {
        MenuCheck side = new MenuCheck();
        Menu.bar();
        Top.top();
        Menu.side();
        Menu.menuorder2();

        Scanner ac = new Scanner(System.in);
        int b = ac.nextInt();
        side.side(b);

    }
    public static void happymill() {
        MenuCheck happymill = new MenuCheck();
        Menu.bar();
        Top.top();
        Menu.happymill();
        Menu.menuorder2();

        Scanner ac = new Scanner(System.in);
        int b = ac.nextInt();
        happymill.happymill(b);

    }


}


