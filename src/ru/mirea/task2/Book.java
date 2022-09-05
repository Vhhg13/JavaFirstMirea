package ru.mirea.task2;

public class Book {
    private String name;
    private String author;
    enum BookState {OPEN, CLOSED}
    private BookState state;


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }

    public boolean isOpen(){
        return state==BookState.OPEN;
    }
    public void open(){
        if(state==BookState.OPEN)
            System.out.println("Книга уже открыта");
        else {
            state = BookState.OPEN;
            System.out.println("Книга открыта");
        }

    }
    public void close(){
        if(state==BookState.CLOSED)
            System.out.println("Книга уже закрыта");
        else {
            state = BookState.CLOSED;
            System.out.println("Книга закрыта");
        }
    }
}
