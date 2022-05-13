package HW1_Object;

public class Team {
    public String name;
    private Person[] people;

    public Team (String name, Person[] people) {
        this.name = name;
        this.people = people;
    }
    public Person[] getPeople() {
    return people;
    }

}
