package fr.medias;

import java.util.ArrayList;

public class Media {
    private String author;
    private String title;
    private ArrayList<Float> notesArrayList;

    // CONSTRUCTORS
    public Media(String author) {
        this.author = author;
    }

    public Media(String author, String title) {
        this.author = author;
        this.title = title;
    }

    // GETTERS AND SETTERS
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //METHODS
    @Override
    public String toString() {
        return "Title : '" + title +
                "' by " + author;
    }

    public void addNote(float note){
        if (note >= 0 && note <= 5){
            this.notesArrayList.add(note);
        }
        else {
            System.out.println("Invalid note, it should be between 0 and 5.");
        }
    }

    public float averageNotes(){
        int average = 0;
        if(this.notesArrayList.size() > 0) {
            for (float note : this.notesArrayList) {
                average += note;
            }
            average = average / this.notesArrayList.size();
        }
        return average;
    }
}
