package VadimsTask;

public class User {
    int age;
    String name;
    int weight;
    boolean sex;
    String speciality;

    public User(int age, String name, int weight, boolean sex, String speciality) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.speciality = speciality;
    }
    @Override
    public String toString(){
        return "This is " + name + ", he is a " + speciality + " and he is " + sex +
                " men. He " + age + " ears old and has weight " + weight +".";
    }
}
