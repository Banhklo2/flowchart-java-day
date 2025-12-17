package day;

public class Day {

    // 메서드
    public boolean printNum(int num) {
        switch (num) {
            case 1:
                System.out.println("월요일");
                return true;
            case 2:
                System.out.println("화요일");
                return true;
            case 3:
                System.out.println("수요일");
                return true;
            case 4:
                System.out.println("목요일");
                return true;
            case 5:
                System.out.println("금요일");
                return true;
            case 6:
                System.out.println("토요일");
                return true;
            case 7:
                System.out.println("일요일");
                return true;
            default:
                System.out.println("잘못된 입력입니다!");
                return false;
        }
    }
}
