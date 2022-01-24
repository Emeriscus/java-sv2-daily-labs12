package day04;

import java.util.Objects;

public class SubjectBlock {

    private String name;
    private String course;
    private String nameOfClass;
    private int hours;

    public SubjectBlock(String name, String course, String nameOfClass, int hours) {
        this.name = name;
        this.course = course;
        this.nameOfClass = nameOfClass;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectBlock that = (SubjectBlock) o;
        return hours == that.hours
                && name.equals(that.name)
                && course.equals(that.course)
                && nameOfClass.equals(that.nameOfClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, nameOfClass, hours);
    }

    @Override
    public String toString() {
        return "SubjectBlock{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", nameOfClass='" + nameOfClass + '\'' +
                ", hours=" + hours +
                '}';
    }
}
