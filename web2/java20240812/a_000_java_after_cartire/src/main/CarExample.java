package main;

import car.Car;
import tire.HankookTire;
import tire.KumhoTire;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car(); // 인스턴스 생성

        for (int i = 1; i <= 5; i++) {
            int problemLocation = car.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 Hankook Tire로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 Kumho Tire로 교체");
                    car.frontRightTire = new KumhoTire("앞오른쪽", 13);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 Hankook Tire로 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽", 14);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 Kumho Tire로 교체");
                    car.backRightTire = new KumhoTire("뒤오른쪽", 17);
                    break;
                default:
                    System.out.println("문제 없음");
            }
            System.out.println("-----------------------");
        }
    }
}
