package CreationalPatterns.Prototype;

/**
 * Created by dvsta on 05.12.2017.
 */
public class Human implements Copyable {
    int age;
    String name;
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public Object copy() {
        return new Human(age, name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
