package com.twu.biblioteca;

public class Book {
    private String title;
    private int year;
    private String author;
    private boolean checkedOut;

    public Book(String title, String author, int year){
        this.title = title;
        this.year = year;
        this.author = author;
        this.checkedOut = false;
    }

    public String toString(){
        return String.format("%s | %s | %d", this.title, this.author, this.year);
    }

    public void checkOut() {
        this.checkedOut = true;
    }

    public void returnBook(){
        this.checkedOut = false;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object book2){
        if(this.title.equalsIgnoreCase(((Book) book2).title)){
            return true;
        }
        return false;
    }
}
