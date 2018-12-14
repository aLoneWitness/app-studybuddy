package nl.niekvangogh.studybuddy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {
    ArrayList<Card> cards = new ArrayList<Card>();

    public CardAdapter(ArrayList<Card> cards){
        this.cards = cards;

    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dashboard_carditem, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {


        Card card = cards.get(position);
        holder.card_image.setImageResource(card.getImageId());
        holder.card_text.setText(card.getDescription());

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder
    {
        ImageView card_image;
        TextView card_text;
        MaterialButton card_close_button;

        public CardViewHolder(View view){
            super(view);
            card_image = (ImageView)view.findViewById(R.id.cardImage);
            card_text = (TextView)view.findViewById(R.id.cardText);
            card_close_button = (MaterialButton)view.findViewById(R.id.cardCloseButton);
        }
    }
}
