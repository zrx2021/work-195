package xuan.demo03斗地主案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<Poker> list = new ArrayList<>();

        // 花色数组
        String[] colors = new String[] {"♠", "♥", "♣", "♦"};
        // 数字数组
        String[] numbers = new String[] {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        list.add(new Poker("", "小王"));
        list.add(new Poker("", "大王"));

        for (String number : numbers) {
            for (String color : colors) {
                list.add(new Poker(color, number));
            }
        }

        System.out.println("创建后：" + list);

        Collections.shuffle(list);
        System.out.println("打乱后：" + list);

        ArrayList<Poker> player1 = new ArrayList<>();
        ArrayList<Poker> player2 = new ArrayList<>();
        ArrayList<Poker> player3 = new ArrayList<>();
        ArrayList<Poker> covered = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Poker poker = list.get(i);
            if (i >= 51) {
                covered.add(poker);
            } else if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else if (i % 3 == 2) {
                player3.add(poker);
            }
        }

        Collections.sort(player1, (o1, o2) -> {
            int compare = o1.getNumber().compareToIgnoreCase(o2.getNumber());
            if (compare == 0) {
                compare = o1.getNumber().compareToIgnoreCase(o2.getNumber());
            }
            return compare;
        });

        System.out.println("玩家一的牌：" + player1);
        System.out.println("玩家二的牌：" + player2);
        System.out.println("玩家三的牌：" + player3);
        System.out.println("底牌：" + covered);
    }
}
