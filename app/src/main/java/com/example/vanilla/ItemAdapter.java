package com.example.vanilla;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private String[] names;
    private int[] imageIds;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }
    }

    public ItemAdapter(String[] names, int[] imageIds) {
        this.names = names;
        this.imageIds = imageIds;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_img, parent, false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CardView cardView = (CardView) holder.itemView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);

        imageView.setImageDrawable(drawable);
        TextView txt = (TextView) cardView.findViewById(R.id.txtname);
        txt.setText(names[position]);
        cardView.setId(imageIds[position]);

    }

    @Override
    public int getItemCount() {
       return names.length;
    }
}
