package day02;

public class MyGenericClass<E> {

    private E element;

    public MyGenericClass(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }
}
