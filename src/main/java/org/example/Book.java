package org.example;

public class Book {
    private int Id;
    private String title;
    private String author;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }
    @Override
    public String toString() {
        return "Book{id=" + Id + ", title='" + title + "', author='" + author + "'}";
    }

}
