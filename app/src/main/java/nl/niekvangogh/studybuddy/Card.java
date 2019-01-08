package nl.niekvangogh.studybuddy;

public class Card {

    private int imageId;
    private String title, description;
    private boolean priority;
    private int openActivityId;

    public int getImageId() {
        return imageId;
    }

    private void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public boolean isPriority() {
        return priority;
    }

    private void setPriority(boolean priority) {
        this.priority = priority;
    }

    public int getOpenActivityId() {
        return openActivityId;
    }

    private void setOpenActivityId(int openActivityId) {
        this.openActivityId = openActivityId;
    }

    public Card(int imageId, String title, String description, Boolean priority, int openActivityId) {
        this.setImageId(imageId);
        this.setTitle(title);
        this.setDescription(description);
        this.setPriority(priority);
        this.setOpenActivityId(openActivityId);


    }


}



