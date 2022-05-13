package HW1_Object;

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

    public String doIt(Team team) {
        for (Person person : team.getPeople()){
            result = "Команда "+ team.name + " Спортсмен " + person.getName() + " " + '\n';
            int valueCross = person.getRun();
            testCross(valueCross);
            int valueWall = person.getJump();
            testWall(valueWall);
            int valueWater = person.getSwim();
            testSwim(valueWater);
        }
        return result;
    }
    private void testCross(int valueCross){
        if (valueCross>cross) result +="Пробежал кросс " + '\n';
    }
    private void testWall(int valueJump){
        if (valueJump>wall) result +="Стену перелез " + '\n';
    }
    private void  testSwim(int valueWater){
        if (valueWater>water) result +="Бассйен проплыл" + '\n';
    }



}
