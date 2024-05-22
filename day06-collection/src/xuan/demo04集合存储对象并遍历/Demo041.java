package xuan.demo04集合存储对象并遍历;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo041 {
    public static void main(String[] args) {
        // 1.创建集合
        Collection<Movie> movies = new ArrayList<>();

        // 2.保存3部电影到集合中
        Movie m1 = new Movie("肖生克的救赎", 9.8, "费兰克"); // 6d311334
        Movie m2 = new Movie("霸王别姬", 9.6, "陈凯歌"); // 3d075dc0
        Movie m3 = new Movie("阿甘正传", 9.5, "罗伯特"); // 214c265e

        // m1变量保存对象的地址, 打印对象的地址
        System.out.println("m1 = " + m1); // 6d311334

        movies.add(m1); // 6d311334
        movies.add(m2); // 3d075dc0
        movies.add(m3); // 214c265e

        // 打印集合, 打印集合中保存的对象的地址
        System.out.println("集合: " + movies);

        // 3.遍历集合,打印每个电影对象的信息
        for (Movie movie : movies) {
            System.out.println("movie = " + movie); // 6d311334
            System.out.println("电影名称: " + movie.getName());
            System.out.println("评分: " + movie.getScore());
            System.out.println("导演: " + movie.getDirector());
            System.out.println("----------------");
        }

        System.out.println("----------------迭代器遍历----------------");
        Iterator<Movie> itr = movies.iterator();
        while (itr.hasNext()) {
            Movie movie = itr.next();
            System.out.println("电影名称: " + movie.getName());
            System.out.println("评分: " + movie.getScore());
            System.out.println("导演: " + movie.getDirector());
            System.out.println("----------------");
        }

        System.out.println("----------------foreach遍历----------------");
        movies.forEach(movie -> {
            System.out.println("电影名称: " + movie.getName());
            System.out.println("评分: " + movie.getScore());
            System.out.println("导演: " + movie.getDirector());
        });
    }
}
