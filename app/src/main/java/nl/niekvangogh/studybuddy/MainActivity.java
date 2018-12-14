package nl.niekvangogh.studybuddy;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static java.security.AccessController.getContext;

public class MainActivity extends Activity {

    private Button closeCardButton;
    public int cardCount;
    RecyclerView dashboardView;
    RecyclerView.Adapter dashboardAdapter;
    RecyclerView.LayoutManager dashboardLayoutManager;
    ArrayList<Card> list = new ArrayList<Card>();

    int[] image_id = {
            R.drawable.cardplaceholder,
            R.drawable.cardplaceholder2,
            R.drawable.cardplaceholder3
    };

    String[] description, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        description = getResources().getStringArray(R.array.card_desc);
        title = getResources().getStringArray(R.array.card_title);
        int count = 0;
        for(String Description : description)
        {
            Card card = new Card(image_id[count],title[count],description[count], false);

            list.add(card);
            count++;
        }
        dashboardView = (RecyclerView)findViewById(R.id.dashboard_view);
        dashboardLayoutManager = new LinearLayoutManager(this);
        dashboardView.setLayoutManager(dashboardLayoutManager);
        dashboardView.setHasFixedSize(true);
        dashboardAdapter = new CardAdapter(list);
        dashboardView.setAdapter(dashboardAdapter);

    }





}
