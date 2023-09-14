package Lessons.L7.Theory;

import java.io.Serializable;

public class Book implements Readable, Searchable, Serializable {

    @Override
    public void read() {
        System.out.println("Book is being read");
    }

    @Override
    public void printSmth() {

    }

    @Override
    public void search() {

    }
}
