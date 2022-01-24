package day04;

public class SubjectController {

    public static void main(String[] args) {
        SubjectService subjectService = new SubjectService("src/main/resources/beosztas.txt");

        System.out.println(subjectService.getSubjectBlocks());

        System.out.println(subjectService.getHoursOfTrainer("Albatrosz Aladin"));

        System.out.println(subjectService.getSubjectBlocks().contains(
                new SubjectBlock("Albatrosz Aladin", "biologia", "9.a", 3)));

        System.out.println(subjectService.containsSubjectBlock(
                new SubjectBlock("Albatrosz Aladin", "biologia", "9.a", 3)));
    }
}
