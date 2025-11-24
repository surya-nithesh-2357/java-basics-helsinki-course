import java.util.ArrayList;

public class Room {
    private ArrayList<Person>persons;
    public Room(){
        this.persons = new ArrayList<Person>();
    }

    public void add(Person person){
        this.persons.add(person);
    }

    public boolean isEmpty(){
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){
        int height = 999999;
        if (this.persons.size()>0){
            for (Person buddy:this.persons){
                if (height >= buddy.getHeight()){
                    height = buddy.getHeight();
                }
            }
            for(Person buddy:this.persons){
                if (buddy.getHeight()== height){
                    return buddy;
                }
            }
        }
        return null;
    }

    public Person take(){
        Person shortest = this.shortest();
        this.persons.remove(shortest);
        return shortest;
    }
}
