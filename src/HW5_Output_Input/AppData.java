package HW5_Output_Input;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class AppData {

    private static final String DELIMETER = ";";

    private String[] header;
    private Integer[][] data;

    public void readFile(String oldfile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(oldfile))) {
            ArrayList<Integer[]> row = new ArrayList<>();
            header = (reader.readLine().split(DELIMETER));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] strArr = line.split(DELIMETER);
                Integer[] intArr = new Integer[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    intArr[i] = Integer.parseInt(strArr[i]);
                }
                row.add(intArr);
            }
            data = row.toArray(new Integer[][]{});
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void writeNew(String newfile) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newfile), StandardCharsets.UTF_8));
            StringBuffer  oneLine = new StringBuffer();
            for (int i = 0; i < header.length; i++) {
                oneLine.append(header[i]);
                oneLine.append(DELIMETER);
            }
            bw.write(oneLine.toString());
            bw.newLine();

            for (int i = 0; i < data.length; i++) {
                Integer[] rowData = data[i];
                oneLine.delete(0, oneLine.length());
                for (int j = 0; j < rowData.length; j++) {
                    oneLine.append(rowData[j]);
                    oneLine.append(DELIMETER);
                }
                bw.write(oneLine.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}