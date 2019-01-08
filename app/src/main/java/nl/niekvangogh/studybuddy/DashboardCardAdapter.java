package nl.niekvangogh.studybuddy;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class DashboardCardAdapter extends RecyclerView.Adapter<DashboardCardAdapter.CardViewHolder> {

    private ArrayList<DashboardCard> dashboardCards = new ArrayList<DashboardCard>();
    private final Activity parentInstance;

    public DashboardCardAdapter(ArrayList<DashboardCard> dashboardCards, Activity instance) {
        this.dashboardCards = dashboardCards;
        this.parentInstance = instance;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dashboard_carditem, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {


        DashboardCard dashboardCard = dashboardCards.get(position);
        holder.card_image.setImageResource(dashboardCard.getImageId());
        holder.card_text.setText(dashboardCard.getDescription());
        holder.card_title.setText(dashboardCard.getTitle());

        holder.card_close_button.setOnClickListener(click -> {
            if(this.parentInstance instanceof MainActivity) {
                ((MainActivity)this.parentInstance).removeCard(holder.getAdapterPosition());
            }
        });

        if(dashboardCard.getOpenActivityId() == 0){
            holder.card_open_button.setVisibility(View.INVISIBLE);
        }
        else{
            holder.card_open_button.setVisibility(View.VISIBLE);
            holder.card_open_button.setOnClickListener(click -> {
                if(this.parentInstance instanceof MainActivity) {
                    ((MainActivity)this.parentInstance).switchActivity(dashboardCard.getOpenActivityId());
                }
            });
        }







    }

    @Override
    public int getItemCount() {
        return dashboardCards.size();
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {
        private ImageView card_image;
        private TextView card_text;
        private MaterialButton card_close_button;
        private TextView card_title;
        private MaterialButton card_open_button;

        public CardViewHolder(View view) {
            super(view);
            this.card_image = (ImageView) view.findViewById(R.id.cardImage);
            this.card_text = (TextView) view.findViewById(R.id.cardText);
            this.card_close_button = (MaterialButton) view.findViewById(R.id.cardCloseButton);
            this.card_title = (TextView) view.findViewById(R.id.cardTitle);
            this.card_open_button = (MaterialButton) view.findViewById(R.id.cardOpenButton);

        }
    }

}
