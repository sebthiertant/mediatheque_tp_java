package fr.mediatheque;

import fr.medias.Book;
import fr.medias.Cd;
import fr.medias.Dvd;
import fr.medias.Media;
import java.util.ArrayList;

public class Mediatheque {
    public ArrayList<Media> mediaDataBase;

    // CONSTRUCTORS

    public Mediatheque() {
        this.mediaDataBase = new ArrayList<Media>();
    }

    // GETTERS & SETTERS
    public ArrayList<Media> getMediaDataBase() {
        return mediaDataBase;
    }

    // METHODS
    public void addMedia(Media media){
        this.mediaDataBase.add(media);
    }

    public ArrayList<Media> filterMedias(String criteria, String value) {
        ArrayList<Media> returnList = new ArrayList<>();

        switch (criteria) {
            case "title":
                 for (Media media : mediaDataBase) {
                     if (media.getTitle().toLowerCase().contains(value.toLowerCase())) {
                         returnList.add(media);
                     }
                }
                break;
            case "author":
                for (Media media : mediaDataBase) {
                    if (media.getAuthor().toLowerCase().contains(value.toLowerCase())) {
                        returnList.add(media);
                    }
                }
                break;
            case "type" :
                switch (value.toLowerCase()) {
                    case "cd" :
                        for (Media media : mediaDataBase) {
                            if (media instanceof Cd) {
                                returnList.add(media);
                            }
                        }
                        break;
                    case "dvd" :
                        for (Media media : mediaDataBase) {
                            if (media instanceof Dvd) {
                                returnList.add(media);
                            }
                        }
                        break;
                    case "book" :
                        for (Media media : mediaDataBase) {
                            if (media instanceof Book) {
                                returnList.add(media);
                            }
                        }
                        break;
                    default:
                        System.out.println("Please select a valid input : cd, dvd, or book.");
                        return new ArrayList<>();
                }
                break;
            default:
                System.out.println("Please select a valid input : title, author, or type.");
                return new ArrayList<>();
        }
            return returnList;
    }
}

