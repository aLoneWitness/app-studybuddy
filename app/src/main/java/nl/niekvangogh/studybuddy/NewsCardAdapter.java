package nl.niekvangogh.studybuddy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsCardAdapter extends RecyclerView.Adapter<NewsCardAdapter.NewsViewHolder> {

    private List<NewsCard> newsCardList;
    private Context mContext;

    public static class NewsViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public TextView descriptionTextView;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.card_title);
            descriptionTextView = itemView.findViewById(R.id.card_description);
        }

        public void bindData(NewsCard newsCard, Context context) {
            titleTextView.setText(newsCard.getTitle());
            descriptionTextView.setText(newsCard.getDescription());
        }
    }

    public NewsCardAdapter(List<NewsCard> cardList, Context context){
        newsCardList = cardList;
        mContext = context;
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
        holder.bindData(newsCardList.get(position), mContext);

    }

    @Override
    public int getItemCount() {
        return newsCardList.size();
    }
}


