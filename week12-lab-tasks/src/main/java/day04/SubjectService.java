package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectService {

    private List<SubjectBlock> subjectBlocks = new ArrayList<>();

    public List<SubjectBlock> getSubjectBlocks() {
        return subjectBlocks;
    }

    public SubjectService() {
    }

    public SubjectService(List<SubjectBlock> subjectBlocks) {
        this.subjectBlocks = subjectBlocks;
    }

    public SubjectService(String filename) {
        readFromFile(filename);
    }

    public int getHoursOfTrainer(String name) {
        int sum = 0;
        for (SubjectBlock actual : subjectBlocks) {
            if (name.equals(actual.getName())) {
                sum += actual.getHours();
            }
        }
        return sum;
    }

    public List<SubjectBlock> fileReader(Path path) {
        return getTrainerFromLines(readLines(path));
    }

    private List<String> readLines(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file");
        }
    }

    private List<SubjectBlock> getTrainerFromLines(List<String> lines) {
        List<SubjectBlock> result = new ArrayList<>();
        for (int i = 0; i < lines.size(); i += 4) {
            subjectBlocks.add(new SubjectBlock(lines.get(i), lines.get(i + 1), lines.get(i + 2), Integer.parseInt(lines.get(i + 3))));
        }
        return result;
    }

    public boolean containsSubjectBlock(SubjectBlock subjectBlock) {
        return subjectBlocks.contains(subjectBlock);
    }

    // BufferedReader-rel:
    private void readFromFile(String filename) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                subjectBlocks.add(new SubjectBlock(line, br.readLine(), br.readLine(), Integer.parseInt(br.readLine())));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }
}
