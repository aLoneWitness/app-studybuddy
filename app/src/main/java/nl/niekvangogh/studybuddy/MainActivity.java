package nl.niekvangogh.studybuddy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends Activity {

    private RecyclerView dashboardView;
    private RecyclerView.Adapter dashboardAdapter;
    private RecyclerView.LayoutManager dashboardLayoutManager;

    private ArrayList<Card> list = new ArrayList<>();

    private Button tempTestButton;

    int[] image_id = {
            R.drawable.cardplaceholder,
            R.drawable.cardplaceholder2,
            R.drawable.cardplaceholder3,
            R.drawable.fhictlogo
    };

    String[] description, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        description = getResources().getStringArray(R.array.card_desc);
        title = getResources().getStringArray(R.array.card_title);

        /*
        ID LIST:
        0 - No open button
        1 - DeadlineWidget
        2 - NewsWidget (Awaiting merge, is not usable yet)
         */

        createCard("Nieuw nieuwsartikel gepost op de Fontys.nl website. Fontys heeft nieuw gebouw R7 aangekondigt. ", "Nieuws", 3, 1 );

        /*
        tempTestButton = (Button) findViewById(R.id.buttonW);
        tempTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeCard(0);
            }
        });
        */
    }

    public void createCard(String message, String title, int imageId, int reference) {
        Card card = new Card(image_id[imageId], title, message, false, reference);

        this.list.add(card);
        this.dashboardAdapter = new CardAdapter(list, this);
        this.dashboardLayoutManager = new LinearLayoutManager(this);

        this.dashboardView = findViewById(R.id.dashboard_view);
        this.dashboardView.setAdapter(dashboardAdapter);
        this.dashboardView.setLayoutManager(dashboardLayoutManager);
        this.dashboardView.setHasFixedSize(true);

        //this.dashboardView

    }

    public void removeCard(int position) {
        if(list.isEmpty()){
            showSnackbar("You cant delete nothing, silly.");
        }
        else {
            try {
                showSnackbar(Integer.toString(position));
                this.list.remove(position);
                this.dashboardAdapter.notifyItemRemoved(position);
            }
            catch(ArrayIndexOutOfBoundsException e){
                showSnackbar("This card is already dismissed.");
            }

        }
    }
    public void removeAllCards(){
        if(list.isEmpty()){
            showSnackbar("You can't delete nothing, silly.");
        }
        else{
            while(!list.isEmpty()){
                list.remove(0);
            }

        }
    }
    public void showSnackbar(String message){
        View contextView = findViewById(R.id.dashboard_view);

        Snackbar.make(contextView, message, Snackbar.LENGTH_SHORT)
                .show();
    }

    public void switchActivity(int openActivityId){

        if(openActivityId == 1){
            Intent intent = new Intent(this, DeadlineActivity.class);
            startActivity(intent);
        }
    }

}
