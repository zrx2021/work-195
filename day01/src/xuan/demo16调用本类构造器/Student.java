package xuan.demo16调用本类构造器;

public class Student {
    private String name;
    private String schoolName;

    public Student() {

    }

    public Student(String name) {
        // this.name = name
        // this.schoolName = "黑马程序员"
        this(name, "黑马程序员");
    }

    public Student(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
