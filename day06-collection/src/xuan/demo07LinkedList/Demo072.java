package xuan.demo07LinkedList;

import java.util.LinkedList;

public class Demo072 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        // 队列，先进先出
        queue.addLast("第一个人");
        queue.addLast("第二个人");
        queue.addLast("第三个人");
        queue.addLast("第四个人");

        System.out.println(queue.removeFirst());// 1
        System.out.println(queue.removeFirst());// 2
        System.out.println(queue.removeFirst());// 3
        System.out.println(queue.removeFirst());// 4

        LinkedList<String> stack = new LinkedList<>();

        // 栈，先进后出
        stack.push("第一个人");
        stack.push("第二个人");
        stack.push("第三个人");
        stack.push("第四个人");

        System.out.println(stack.pop());// 4
        System.out.println(stack.pop());// 3
        System.out.println(stack.pop());// 2
        System.out.println(stack.pop());// 1
    }
}
