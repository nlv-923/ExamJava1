package bai3;

public class Main3 {
    public static void main(String[] args) {
        VanBan v1 = new VanBan("xin    chao   cac ban");
        v1.standardSt();
        System.out.println(v1.st);
        System.out.println(v1.countSt());
        v1.upperSt();
        System.out.println(v1.getSt());
        v1.lowerSt();
        System.out.println(v1.getSt());
        v1.pasalCaseSt();
        System.out.println(v1.getSt());
    }
}
