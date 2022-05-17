package HW1_Object;

public class Main {


        public static void main(String[] args) {

        String NameTeam = "Name Team is Dream Team";
        Person[] person= new Person[4];
        person[0] = new Person("John", 200, 3, 500);
        person[1] = new Person("Nik",50, 2, 600);
        person[2] = new Person("Tom",30, 3, 12);
        person[3] = new Person("Kris",400, 3, 1100);



        Course course = new Course(100,2,200);
        Team team = new Team(person);
        System.out.println();
        System.out.println(NameTeam);
        System.out.println();
        String result = course.doIt(team);
    }
}
