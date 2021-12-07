package fr.medias;


import java.util.Arrays;

public class Dvd extends Media {

    private int zone;

    // CONSTRUCTORS
    public Dvd(String author) {
        super(author);
    }

    public Dvd(String author, String title) {
        super(author, title);
    }

    public Dvd(String author, String title, int zone) {
        super(author, title);
        this.zone = zone;
    }

    // GETTERS & SETTERS
    public int getZone(){
        return this.zone;
    }

    // METHODS
    public boolean readable(int[] zones){
        if (this.zone == 0){
            return true;
        }
        else {
            int getIndex = Arrays.asList(zones).indexOf(this.zone);
            return getIndex == -1 ? false : true;
        }
    }
}
