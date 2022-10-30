package Classes;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        person.setId(1);
        person.setName("Abena Pokua");

        System.out.println("[PERSON DETAILS] -->" + person.getId() + " : " + person.getName());
    }
}
