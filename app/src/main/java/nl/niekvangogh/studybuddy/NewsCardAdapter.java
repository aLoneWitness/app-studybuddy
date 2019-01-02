package nl.niekvangogh.studybuddy;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsCardAdapter extends RecyclerView.Adapter<NewsCardAdapter.NewsViewHolder> {

    private List<NewsCard> newsCardList;
    private Context mContext;
    private Activity parentInstance;

    public static class NewsViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public TextView descriptionTextView;
        public Button openButton;



        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.card_title);
            descriptionTextView = itemView.findViewById(R.id.card_description);
            openButton = itemView.findViewById(R.id.cardOpenButton);


        }

        public void bindData(NewsCard newsCard, Context context, Activity parentInstance) {
            titleTextView.setText(newsCard.getTitle());
            descriptionTextView.setText(newsCard.getDescription());

            openButton.setOnClickListener(click -> {
                if(parentInstance instanceof NewsActivity){
                    ((NewsActivity)parentInstance).openWebsite(newsCard.getLink());
                }
                else{

                    openButton.setText("owo");
                }

            });





        }
    }

    public NewsCardAdapter(List<NewsCard> cardList, Context context, Activity instance){
        this.newsCardList = cardList;
        this.mContext = context;
        this.parentInstance = instance;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_carditem, parent, false);

        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        holder.bindData(newsCardList.get(position), mContext, parentInstance);
    }

    @Override
    public int getItemCount() {
        return newsCardList.size();
    }
}


