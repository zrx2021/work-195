package xuan.demo07LinkedList;

import java.util.LinkedList;

/*
目标:了解LinkedList的原理

    LinkedList底层是双向链表
 */
public class Demo071 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("aa");
        linkedList.add("bb");
        linkedList.add("cc");

        // 操作首尾的方法
        linkedList.addFirst("11");
        linkedList.addLast("66");
        System.out.println("添加后 linkedList = " + linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("删除后 linkedList = " + linkedList);
    }
}
