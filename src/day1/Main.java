package day1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("프로그램을 시작합니다!");

        while (true){

            System.out.println("해당 번호를 입력하세요. :");

            if (!sc.hasNextInt()){
                System.out.println("잘못된 입력입니다!");
                sc.next();
                continue;
            }

            int num = sc.nextInt();

            if (num == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if (num < 0 || num > 7) {
                System.out.println("잘못된 입력입니다!");
                continue;
            }

            switch (num) {
                case 1:
                    System.out.println("월요일");
                    break;
                case 2:
                    System.out.println("화요일");
                    break;
                case 3:
                    System.out.println("수요일");
                    break;
                case 4:
                    System.out.println("목요일");
                    break;
                case 5:
                    System.out.println("금요일");
                    break;
                case 6:
                    System.out.println("토요일");
                    break;
                case 7:
                    System.out.println("일요일");
                    break;
            }
            break;
        }
        sc.close();
    }
}
