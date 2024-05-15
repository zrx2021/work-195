package xuan.extendhomework4;

public class Test1 {
    public static void main(String[] args) {
        BenChiCar bc = new BenChiCar("奔驰s60-定制版", 650);
        bc.run();
        BaoMaCar bm = new BaoMaCar("华晨宝马", 32);
        bm.run();
        bm.locate();
        YaMaHaMotor ym = new YaMaHaMotor("雅马哈趴赛", 15);
        ym.run();
        BaoMaMotor bmt = new BaoMaMotor("宝马巡航车", 150);
        bmt.run();
        bmt.locate();
    }
}
