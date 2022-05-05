/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.Color;

/**
 *
 * @author sonix
 */
public class Libro {
    private String author;
    private String text;
    private Color coverColor;
    private int page;
    private int totalPages;

    public Libro() {
    }

    public Libro(String author, String text, Color coverColor, int page, int totalPages) {
        this.author = author;
        this.text = text;
        this.coverColor = coverColor;
        this.page = page;
        this.totalPages = totalPages;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Color getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(Color coverColor) {
        this.coverColor = coverColor;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    
    public void changePage(int newPage){
        page = newPage;
        System.out.println("Te moviste hasta la página " + newPage + " del libro.");
    }
    
    public void publish(String name){
        System.out.println("Publicaste tu nuevo libro con el nombre: " + name + "!");
    }
}
