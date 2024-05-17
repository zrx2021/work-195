package xuan.demo04集合存储对象并遍历;

// 电影类
public class Movie {
    // 电影名称
    private String name;
    // 评分
    private double score;
    // 导演
    private String director;

    public Movie() {
    }

    public Movie(String name, double score, String director) {
        this.name = name;
        this.score = score;
        this.director = director;
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
     * @return director
     */
    public String getDirector() {
        return director;
    }

    /**
     * 设置
     * @param director
     */
    public void setDirector(String director) {
        this.director = director;
    }
}
