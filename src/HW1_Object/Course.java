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
    // Вывод информации, кто прошел дистанцию
    // Для Андрея Звездина.
    // Раньше проверка прохождения была вынесена за цикл.
    // Добавил проверку внутрь цикла. Но почему sout выводит только последнего?

    public String doIt(Team team) {
        for (Person person : team.getPeople()){
            result = "Спортсмен " + person.getName() + " " + '\n';
            int valueCross = person.getRun();
            if (valueCross>cross) result +="Пробежал кросс " + '\n';
            int valueWall = person.getJump();
            if (valueWall>wall) result +="Стену перелез " + '\n';
            int valueWater = person.getSwim();
            if (valueWater>water) result +="Бассейн проплыл" + '\n';
            }
        return result;
    }
}
