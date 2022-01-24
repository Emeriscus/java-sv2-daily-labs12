package day02;

import day01.Run;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        MyGenericClass<String> myobject = new MyGenericClass<>("alma");

        System.out.println(myobject.getElement());
        System.out.println();

        MyGenericClass<Run> myobject2 = new MyGenericClass<>(new Run(23.3, LocalDate.now()));

        System.out.println(myobject2.getElement().getDate());
        System.out.println(myobject2.getElement().getDistance());
    }
}
