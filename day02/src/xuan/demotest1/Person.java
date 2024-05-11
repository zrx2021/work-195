package xuan.demotest1;

class Person {
    private String name;
    private int age;
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private void eat(){
        System.out.println(name+"在吃饭");
    }
}