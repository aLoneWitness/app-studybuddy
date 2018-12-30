package nl.niekvangogh.studybuddy;

public class NewsCard {

    private String title;
    private String description;

    public NewsCard(String title, String description) {
        this.description = description;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}

