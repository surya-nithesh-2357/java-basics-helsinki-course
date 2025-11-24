
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared){

        if (this == compared) {
            return true;
        }
        // if the compared object is not of type Song, the objects are not equal
        if (!(compared instanceof Person)) {
            return false;
        }
        Person comparedBoy = (Person) compared;
        if (this.name != comparedBoy.name){
            return false;
        }
        if (this.birthday.equals(comparedBoy.birthday) && this.height == (comparedBoy.height) && this.weight == (comparedBoy.weight)){
            return true;
        }
        return false;
    }
}
