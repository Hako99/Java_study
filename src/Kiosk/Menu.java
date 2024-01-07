package Kiosk;

public class Menu {
    static  String[] burger = new String[]{"행운버거 골드","행운버거 골드 스페셜","빅맥","더블 쿼터 파운더 치즈","쿼터 파운더 치즈","맥크리스피 디럭스 버거"};
    static String[] setmenu = new String[]{"빅맥 세트","맥크리스피 디럭스 버거 세트","맥스파이시 상하이 버거 세트","1955 버거 세트","더블 불고기 버거 세트","베이컨 토마토 디럭스 세트"};
    static  String[] happysnack = new String[]{"아이스 아메리카노","카페 라떼","코카 콜라","골든 모짜렐라 치즈스틱","맥스파이시 치킨 텐더"};
    static  String[] side = new String[]{"컬리 후라이","토마토 치킨 스낵랩","후렌치 후라이","라즈베리 크림치즈 파이","베리 스트로베리 맥플러리","딸기 오레오 맥플러리"};
    static  String[] happymill = new String[]{"에그 맥머핀","핫케익","딸기 코코넛 푸딩","해쉬 브라운","생수","오렌지 주스"};
    static void bar(){
        System.out.println("---------------------------------------------------------------------------");
    }
    static void mainmenu (){
        System.out.println("[ M BURGER MENU ]");
        System.out.println("1. 햄버거          | 참깨빵위에 순쇠고기패티를 넣은 버거" );
        System.out.println("2. 세트메뉴        | 오전 10시30분 부터 오후2시까지 점심만의 특별메뉴");
        System.out.println("3. 해피스낵        | 시즌 별 인기 스낵을 할인가격으로 만나보세요 ");
        System.out.println("4. 사이드 & 디저트  | 가볍게 즐겨도, 버거와 함께 푸짐하게 즐겨도, 언제나 맛있는 사이드와 디저트메뉴 ");
        System.out.println("5. 해피밀          | 맛과 즐거움 모두 해피밀을 통해 느껴보세요 ");
        System.out.println();

    }
    static void menuorder1 (){
        System.out.println("[ ORDER MENU ]");
        System.out.println("6. Order          | 장바구니 확인하기");
        System.out.println("7. Cancle         | 진행중인 주문을 취소");
        System.out.println();
    }
    static void menuorder2 (){
        System.out.println("[ ORDER MENU ]");
        System.out.println("7. Order          | 장바구니 확인하기");
        System.out.println("8. Cancle         | 메인화면으로 돌아가기");
        System.out.println();
    }

    static void burgermenu (){
        System.out.println("햄버거 메뉴");
        System.out.println("1. 행운버거 골드             | W 6.8 | 쫀득한 패티에 리치한 갈릭소스의 조화가 환상적인 진한 맛");
        System.out.println("2. 행운버거 골드 스페셜       | W 7.8 | 행운버거 골드에 바삭한 해쉬브라운이 더해져 기분 좋은 풍부한 맛");
        System.out.println("3. 빅맥                     | W 4.8 | 100% 순 쇠고기 패티 두 장에 특별한 소스, 입안에서 살살 녹는 치즈와 신선한 양상추, 양파, 그리고 피클까지.");
        System.out.println("4. 더블 쿼터 파운더 치즈      | W 5.8 | 좋아하는건 더 많이 즐기시라고, 두 배 이상 커진 1/4 파운드 비프 패티가 두 장 (226그램)!");
        System.out.println("5. 쿼터 파운더 치즈          | W 5.3 | 쿼터파운더라는 이름에서 알 수 있듯이 두 배 이상 커진 1/4파운드(113그램) 비프와 부드러운 치즈 두 장의 환상궁합!");
        System.out.println("6. 맥크리스피 디럭스 버거     | W 5.8 | 100% 통닭다리살 겉바속촉 케이준 치킨 패티, 촉촉한 포테이토 브리오쉬 번, 스페셜 스모키 소스가 선사하는 놀랍도록 새로운 맛의 치킨 버거!");
        System.out.println();
    }
    static void setmenu () {
        System.out.println("햄버거 세트 메뉴");
        System.out.println("1. 빅맥 세트                | W 5.8 | 100% 순 쇠고기 패티 두 장에 특별한 소스, 입안에서 살살 녹는 치즈와 신선한 양상추, 양파, 그리고 피클까지.");
        System.out.println("2. 맥크리스피 디럭스 버거 세트 | W 6.8 | 100% 통닭다리살 겉바속촉 케이준 치킨 패티, 촉촉한 포테이토 브리오쉬 번, 스페셜 스모키 소스가 선사하는 놀랍도록 새로운 맛의 치킨 버거!");
        System.out.println("3. 맥스파이시 상하이 버거 세트 | W 5.8 | 매콤한 시즈닝을 입힌 100% 닭가슴 통살 위에 아삭아삭한 양상추와 신선한 토마토~ 겉은 바삭, 속은 부드러운 치킨 패티의 매콤함으로 입맛도 기분도 화끈하게!");
        System.out.println("4. 1955 버거 세트            | W 5.8 | 113g 두툼한 순 쇠고기 패티 더 풍성해진 신선한 양상추 깊은 풍미의 그릴드 어니언까지!");
        System.out.println("5. 더블 불고기 버거 세트      | W 4.8 | 진한 불고기 소스의 패티가 두 장! 여기에 고소한 치즈와 마요네즈, 신선한 양상추를 곁들인 깊고 풍부한 맛.");
        System.out.println("6. 베이컨 토마토 디럭스 세트   | W 5.8 | 두 장의 100% 순 쇠고기 패티에 그릴에 구워 더욱 고소한 1장의 베이컨을 얹고, 신선한 토마토와 양상추, 매콤달콤한 스위트 칠리 소스, 치즈, 마요네즈를 더해 더욱 풍부하고 신선한 맛의 프리미엄 버거");
        System.out.println();

    }
    static void happysnack () {
        System.out.println("해피 스낵");
        System.out.println("1. 아이스 아메리카노          | W 1.5 | 바로 내린 100% 친환경 커피로 더 신선하게! 더 풍부하게!");
        System.out.println("2. 카페 라떼                 | W 3.5 | 바로 내린 100% 친환경 커피가 신선한 우유를 만나 더 신선하고 부드럽게!");
        System.out.println("3. 코카 콜라                 | W 1.8 | 갈증해소 뿐만이 아니라 기분까지 상쾌하게! 코카-콜라");
        System.out.println("4. 골든 모짜렐라 치즈스틱      | W 2.5 | 속이 꽉 찬 황금빛 바삭함! 자연 모짜렐라 치즈로 빈틈 없이 고소한 맥도날드 치즈스틱을 즐겨보세요!");
        System.out.println("5. 맥스파이시 치킨 텐더       | W 1.9 | 부드러운 100% 닭안심살을 스파이시 시즈닝으로 매콤 바삭하게 튀겨낸 치킨 텐더!");
        System.out.println();
    }
    static void side () {
        System.out.println("사이드 & 디저트");
        System.out.println("1. 컬리 후라이               | W 2.4 | 돌돌 말려있는 형태가 특징인 통 감자 후라이");
        System.out.println("2. 토마토 치킨 스낵랩         | W 2.8 | 상큼한 토마토와 바삭한 치킨의 조합! 매콤한 스파이시 어니언 소스로 더 맛있게!");
        System.out.println("3. 후렌치 후라이             | W 1.8 | 통으로 썰어낸 감자를 맥도날드만의 노하우로 튀겨낸 남다른 맛과 바삭함! 맥도날드의 역사가 담긴 월드 클래스 후렌치 후라이");
        System.out.println("4. 라즈베리 크림치즈 파이     | W 2.3 | 상큼한 라즈베리와 부드러운 크림치즈의 만남! 맥도날드 라즈베리 크림치즈 파이");
        System.out.println("5. 베리 스트로베리 맥플러리   | W 3.3 | 신선한 1등급 원유에 국내산 딸기 과즙이 들어간 스트로베리 아이스크림");
        System.out.println("6. 딸기 오레오 맥플러리       | W 3.3 | 상큼한 딸기와 달콤한 오레오 쿠키가 신선한 우유 아이스크림에 퐁당!");
        System.out.println();
    }
    static void happymill () {
        System.out.println("해피밀");
        System.out.println("1. 에그 맥머핀               | W 2.5 | 캐나디안 스타일 베이컨과 계란의 클래식한 만남, 맥도날드의 아침을 탄생하게 한 바로 그 메뉴.");
        System.out.println("2. 핫케익                   | W 2.8 | 부드럽게 구워낸 핫케이크에 향긋한 버터와 달콤한 시럽을 살며시 부어 오늘 하루도 기분 좋게 시작하세요.");
        System.out.println("3. 딸기 코코넛 푸딩          | W 1.8 | 새콤 달콤 딸기 퓨레와 코코넛 젤리를 한 입에 먹을 수 있는 부드러운 딸기 코코넛 푸딩");
        System.out.println("4. 해쉬 브라운               | W 1.5 | 씹으면 바삭바삭, 속은 부드러운 감자의 고소함.");
        System.out.println("5. 생수                     | W 1.2 | 활력을 되찾아주는 깔끔한 미네랄 생수.");
        System.out.println("6. 오렌지 주스               | W 1.4 | 비타민 C를 함유한 4년 연속 세계 판매 1위 100% 오렌지 주스.");
        System.out.println();
    }

}
