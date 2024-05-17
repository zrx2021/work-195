package xuan.demo03增强for循环;

public class Movie {
    private String name;
    private double score;
    private String author;

    public Movie() {
    }

    public Movie(String name, double score, String author) {
        this.name = name;
        this.score = score;
        this.author = author;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return score
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * 获取
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "Movie{name = " + name + ", score = " + score + ", author = " + author + "}";
    }
}
