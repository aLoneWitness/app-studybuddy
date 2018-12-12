package nl.niekvangogh.studybuddy;

public class Card {
    private int imageId, cardLocation, index;
    private String title,description;
    private boolean priority;

    public Card(int index, int imageId, String title, String description, Boolean priority){
        this.imageId = imageId;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.index = index;



    }
}
