package HW1_Object;

public class Person {
    protected String name;
    protected int run;
    protected int jump;
    protected int swim;

    public Person(String name, int run, int jump, int swim) {
        this.name = name;
        this.jump = jump;
        this.run = run;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }

    public int getSwim() {
        return swim;
    }
}
