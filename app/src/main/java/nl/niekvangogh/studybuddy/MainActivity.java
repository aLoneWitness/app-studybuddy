package nl.niekvangogh.studybuddy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Debug;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static java.security.AccessController.getContext;

public class MainActivity extends Activity {

    private Button closeCardButton;

    public int cardCount;
    private int cardIndex;

    RecyclerView dashboardView;
    RecyclerView.Adapter dashboardAdapter;
    RecyclerView.LayoutManager dashboardLayoutManager;

    ArrayList<Card> list = new ArrayList<Card>();

    private Button button1;

    int[] image_id = {
            R.drawable.cardplaceholder,
            R.drawable.cardplaceholder2,
            R.drawable.cardplaceholder3
    };

    String[] description, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        cardIndex = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        description = getResources().getStringArray(R.array.card_desc);
        title = getResources().getStringArray(R.array.card_title);

        /*
        ID LIST:
        0 - No open button
        1 - DeadlineWidget
        2 -
         */

        createCard("wow im a announcement", "General Announcement", 1, 1 );
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 1);
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 1);
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 1);
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 0);
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 0);
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 0);
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 0);
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 0);
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 0);
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 0);
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 0);
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 0);
        createCard("Door een storing zijn tijdelijk alle FHICT api's niet beschikbaar.", "Priority Message", 0, 0);





        //int count = 0;
        //for(String Description : description)
        //{
        //    Card card = new Card(image_id[count],title[count],description[count], false);
//
        //    list.add(card);
        //    count++;
        //}
        //dashboardView = (RecyclerView)findViewById(R.id.dashboard_view);
        //dashboardLayoutManager = new LinearLayoutManager(this);
        //dashboardView.setLayoutManager(dashboardLayoutManager);
        //dashboardView.setHasFixedSize(true);
        //dashboardAdapter = new CardAdapter(list);
        //dashboardView.setAdapter(dashboardAdapter);
        button1 = (Button) findViewById(R.id.buttonW);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeCard(0);



            }
        });
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

    public void removeCard(int index) {
        if(list.isEmpty()){
            showSnackbar("You cant delete nothing, silly.");
        }
        else {
            Context context = dashboardView.getContext();
            LayoutAnimationController controller = null;
            controller = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_swipe_right);
            dashboardView.setLayoutAnimation(controller);
            list.remove(index);
            dashboardAdapter.notifyDataSetChanged();
        }
    }
    public void removeAllCards(){
        if(list.isEmpty()){
            showSnackbar("You can't delete nothing, silly.");
        }
        else{
            while(list.isEmpty() == false){
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
