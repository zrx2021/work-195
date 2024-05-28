package demo09动态代理;

public class WangBaoQiang implements Star {
    @Override
    public String sing(String name) {
        System.out.println("王宝强唱: " + name);
        return "ok";
    }

    @Override
    public void dance() {
        System.out.println("王宝强跳钢管舞");
    }
}
