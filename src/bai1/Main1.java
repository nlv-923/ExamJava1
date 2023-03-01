package bai1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.print("Nhap vao so r: ");
        double r = in.nextDouble();
        in.close();
        c1.setRadius(r);
        System.out.println(c1.toString());
        System.out.printf("Chu vi hinh tron: %f\n",c1.getCircumference());
        System.out.printf("Dien tich hinh tron: %f", c1.getArea());
    }
}
