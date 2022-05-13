package HW1_Object;

public class Team {
    private String name;
    private Person[] people;

    public Team (String name, Person[] people) {
        this.name = name;
        this.people = people;
    }
public String getName() {
    return name;
}
    public Person[] getPeople() {
    return people;
    }

}
