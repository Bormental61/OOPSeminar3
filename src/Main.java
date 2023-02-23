public class Main {
    public static void main(String[] args) {
        Person sid = new Person("Sid", true, 42, null, null);
        Person nancy = new Person("Nancy", false, 28, null,null);
        Person dean = new Person("Dean", true, 3, nancy, sid);
        System.out.println(sid.toString());
    }
}