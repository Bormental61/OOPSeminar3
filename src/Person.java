import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private boolean male;
    private int age;
    private Person mom;
    private Person dad;
    List<Person> children;

    public Person(String name, boolean male, int age, Person mom, Person dad) {
        this.name = name;
        this.male = male;
        this.age = age;
        this.mom = mom;
        this.dad = dad;
        children = new ArrayList<>();
    }

    public void addChild(Person child){
        children.add(child);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", male =" + male +
                ", age =" + age +
                '}';
    }
}
