package HW5_Output_Input;

public class Main {
    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.readFile("oldfile.csv");
        appData.writeNew("newfile.csv");
    }
}
