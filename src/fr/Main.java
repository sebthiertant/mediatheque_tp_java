package fr;

import fr.medias.Book;
import fr.medias.Cd;
import fr.medias.Dvd;
import fr.medias.Media;
import fr.mediatheque.Mediatheque;

public class Main {
    public static void main(String[] args) {

        Book test = new Book("Victor Hugo", "Les misérables");

        Dvd dvd = new Dvd("JR Tolkien", "Le seigneur des anneaux", 0);
//        System.out.println(dvd.readable(new int[]{2, 4}));

        Cd cd = new Cd("Evanescence", "Bring me to life", "CD Musical");
//        System.out.println(cd.toString());

        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addMedia(test);
        mediatheque.addMedia(cd);
        mediatheque.addMedia(dvd);
        System.out.println(mediatheque.filterMedias("type", "book"));
    }
}
