package HW1_Object;

import java.util.Arrays;

public class Course {
    private int cross;
    private int wall;
    private int water;
    private String result;

    public Course(int cross, int wall, int water) {
        this.cross = cross;
        this.wall = wall;
        this.water = water;
    }
    // Вывод информации, кто прошел дистанцию

    public String doIt(Team team) {
        for (Person person : team.getPeople()) {
            result = "Athlete " + person.getName() + " " + '\n';
            int valueCross = person.getRun();
            if (valueCross > cross) result += "Run cross " + '\n';
            int valueWall = person.getJump();
            if (valueWall > wall) result += "Сlimb over the wall " + '\n';
            int valueWater = person.getSwim();
            if (valueWater > water) result += "Swim the pool" + '\n';
            System.out.println(result);
        }
        return result;
    }
}