package day;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Day day = new Day(); // 객체 생성

        System.out.println("해당 번호를 입력하세요: ");
        int num = sc.nextInt();

        day.printNum(num); // 메서드 종료
        sc.close();
    }
}
