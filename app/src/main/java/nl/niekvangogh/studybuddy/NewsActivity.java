package nl.niekvangogh.studybuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.LinkAddress;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.webkit.WebView;

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

        adapter = new NewsCardAdapter(newsCardList, this, this);
        recyclerView.setAdapter(adapter);


        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie", "https://www.google.com/");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie", "https://www.google.com/");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie", "");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie", "");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie", "");
        addNewsItem("lol im retard", "fontys explosie in r1 door te veel koffie", "");

    }

    public void addNewsItem(String title, String description, String link){
        newsCardList.add(new NewsCard(title, description, link));
    }

    public void openWebsite(String link){
        WebView webView = new WebView(this );
        setContentView(webView);
        webView.loadUrl(link);
    }
}
