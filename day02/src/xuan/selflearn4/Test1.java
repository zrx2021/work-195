package xuan.selflearn4;

public class Test1 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("马云", 45);
        SportTeacher t2 = new SportTeacher("大桃", 35);

        Student s1 = new Student("小王", 20);
        SportStudent s2 = new SportStudent("王中王", 22);

        // goToSport(t1);
        goToSport(t2);

        // goToSport(s1);
        goToSport(s2);
    }

    private static void goToSport(Sport sport) {
        sport.playBasketball();
    }
}
