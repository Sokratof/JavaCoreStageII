package HW1_Object;

public class Main {

    public static void main(String[] args) {


        Person[] person= new Person[4];
        person[0] = new Person("John", 200, 2, 500);
        person[1] = new Person("Nik",200, 2, 600);
        person[2] = new Person("Tom",300, 3, 700);
        person[3] = new Person("Kris",400, 3, 8400);

        Course course = new Course(100,1,200);
        Team team = new Team("BAGS", person);
        String result = course.doIt(Team);
        System.out.println("Команда - " + team.getName());
        System.out.println(result);
    }
}
