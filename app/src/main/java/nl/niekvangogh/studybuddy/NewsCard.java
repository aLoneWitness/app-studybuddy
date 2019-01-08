package nl.niekvangogh.studybuddy;

public class NewsCard {

    private String title;
    private String description;
    private String link;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public NewsCard(String title, String description, String link) {
        this.description = description;
        this.title = title;
        this.link = link;
    }
}



