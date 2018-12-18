package nl.niekvangogh.studybuddy;

public class Card {

    private int imageId;
    private String title,description;
    private boolean priority;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public Card(int imageId, String title, String description, Boolean priority){
        this.setImageId(imageId);
        this.setTitle(title);
        this.setDescription(description);
        this.setPriority(priority);



    }





}
