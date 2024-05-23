package xuan.homework2;

public class Book {
    private String category;
    private String name;
    private String author;
    private int year;
    private double price;

    public Book() {
    }

    public Book(String category, String name, String author, int year, double price) {
        this.category = category;
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
