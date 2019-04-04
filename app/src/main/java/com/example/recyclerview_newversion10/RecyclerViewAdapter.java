package com.example.recyclerview_newversion10;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;




public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    private Context mContext ;
    private List<District> mData ;


   public RecyclerViewAdapter(Context mContext, List<District> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_district,parent,false);
        return new MyViewHolder(view);
    }


   @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int i) {

       holder.tv_title.setText(mData.get(i).getTitle());
       holder.img_thumbnail.setImageResource(mData.get(i).getThumbnail());
       holder.img_attraction.setImageResource(mData.get(i).getImageabout());
       holder.cardView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent = new Intent(mContext, District_Activity.class);


               intent.putExtra("Title", mData.get(i).getTitle());
               intent.putExtra("Description", mData.get(i).getDescription());
               intent.putExtra("Thumbnail", mData.get(i).getThumbnail());
               intent.putExtra("Imageabout", mData.get(i).getImageabout());

               mContext.startActivity(intent);

           }
       });


   }

       public class MyViewHolder extends RecyclerView.ViewHolder {

           TextView tv_title;
           ImageView img_thumbnail;
           ImageView img_attraction;
           CardView cardView;

           public MyViewHolder(View itemView) {
               super(itemView);

               tv_title = (TextView) itemView.findViewById(R.id.title_id);
               img_thumbnail = (ImageView) itemView.findViewById(R.id.img_id);
               img_attraction = (ImageView) itemView.findViewById(R.id.atimage_id);
               cardView = (CardView) itemView.findViewById(R.id.cardview_id);
           }
       }


    @Override
    public int getItemCount() {
        return mData.size();
    }
}