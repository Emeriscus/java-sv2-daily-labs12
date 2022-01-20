package day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class RunManager {

    private List<Run> runs = new ArrayList<>();

    public List<Run> getRuns() {
        return runs;
    }
    //    public List<String> readLines(Path path){
//        try {
//            return Files.readAllLines(path);
//        } catch (IOException ioe){
//            throw new IllegalArgumentException("File doesn't exist");
//        }
//    }

    public void readLines(String filename) {

        // try (BufferedReader br = new BufferedReader(new FileReader(filename))) { //vagy
        try (BufferedReader br = Files.newBufferedReader(Path.of(filename))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                Run run = createRunFromLine(line);
                runs.add(run);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot reach file", ioe);
        }
    }

    private Run createRunFromLine(String line) {
        String[] temp = line.split(";");
        return new Run(Double.parseDouble(temp[0].split(" ")[0]), LocalDate.parse(temp[1]));
    }

    public double sumOfMonthAndYear(int year, Month month) {
        double sum = 0;
        for (Run actual : runs) {
            if (actual.getDate().getYear() == year && actual.getDate().getMonth() == month) {
                sum += actual.getDistance();
            }
        }
        return sum;
    }
}
