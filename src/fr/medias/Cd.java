package fr.medias;

public class Cd extends Media{

    private String description;

    // CONSTRUCTORS
    public Cd(String author, String title, String description) {
        super(author, title);
        this.description = description;
    }

    // METHODS
    @Override
    public String toString() {
        return "Title : '" + getTitle() +
                "' by " + getAuthor() + " [" + this.description + "]";
    }
}
