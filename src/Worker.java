public class Worker extends Person {

    String job;
    public Worker(String name, boolean gender, int age, Person mom, Person dad, String job) {
        super(name, gender, age, mom, dad);
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString() + job;
    }
}
