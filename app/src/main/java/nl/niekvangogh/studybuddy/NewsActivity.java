package nl.niekvangogh.studybuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<NewsCard> newsCardList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        recyclerView = findViewById(R.id.recyclerview_newsitems);
        newsCardList = new ArrayList<>();

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new NewsCardAdapter(newsCardList, this);
        recyclerView.setAdapter(adapter);

        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie");

    }

    public void addNewsItem(String title, String description){
        newsCardList.add(new NewsCard(title, description));
    }
}
