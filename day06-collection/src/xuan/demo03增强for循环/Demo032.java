package xuan.demo03增强for循环;

import java.util.ArrayList;
import java.util.Collection;

public class Demo032 {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();

        movies.add(new Movie("肖生克的救赎", 9.8, "费兰克"));
        movies.add(new Movie("霸王别姬", 9.6, "陈凯歌"));
        movies.add(new Movie("阿甘正传", 9.5, "罗伯特"));

        for (Movie movie : movies) {
            System.out.println("电影名称：" + movie.getName());
            System.out.println("评分：" + movie.getScore());
            System.out.println("导演：" + movie.getAuthor());
            System.out.println("--------------------");
        }
    }
}
