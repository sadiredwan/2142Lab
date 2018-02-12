package com.nano.projectjonobak.divisions.districts;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.nano.projectjonobak.Post;
import com.nano.projectjonobak.PostActivity;
import com.nano.projectjonobak.R;
import com.squareup.picasso.Picasso;

public class Rajshahi extends AppCompatActivity {

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_add) {
            startActivity(new Intent(Rajshahi.this, PostActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }*/

    private RecyclerView postList;
    private DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_rajshahi );
        database = FirebaseDatabase.getInstance().getReference().child("projectjonobak").child("posts").child("rajshahi");
        postList = (RecyclerView) findViewById(R.id.post_list);
        postList.setHasFixedSize(true);
        postList.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Post, Rajshahi.PostViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Post, Rajshahi.PostViewHolder>(
                Post.class, R.layout.post_row, Rajshahi.PostViewHolder.class, database
        ) {
            @Override
            protected void populateViewHolder(Rajshahi.PostViewHolder viewHolder, Post model, int position) {
                viewHolder.setTitle(model.getTitle());
                viewHolder.setDescription(model.getDescription());
                viewHolder.setImage(getApplicationContext(), model.getImage());
            }
        };
        postList.setAdapter(firebaseRecyclerAdapter);
    }

    public static class PostViewHolder extends RecyclerView.ViewHolder {

        View view;
        public PostViewHolder(View itemView) {
            super(itemView);
            view = itemView;
        }

        public void setTitle(String title){
            TextView post_title = (TextView) view.findViewById(R.id.post_title);
            post_title.setText(title);
        }

        public void setDescription(String description){
            TextView post_desc = (TextView) view.findViewById(R.id.post_description);
            post_desc.setText(description);
        }

        public void setImage(Context ctx, String image){
            ImageView post_image = (ImageView) view.findViewById(R.id.post_image);
            Picasso.with(ctx).load(image).into(post_image);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_add) {
            Intent intent = new Intent(Rajshahi.this, PostActivity.class);
            intent.putExtra("PARENT_ACTIVITY", "rajshahi");
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
