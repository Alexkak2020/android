package com.googleauthentication.androidfirebasedemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

import static java.security.AccessController.getContext;

public class Retrieve extends AppCompatActivity {

    ListView listView;
    FirebaseDatabase database;
    DatabaseReference ref;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    Images image;
    //ImageView imageView;
    //TextView textView;

    //using firebase UI
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);

        listView = findViewById(R.id.listView);
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("Images");
        image = new Images();
        //imageView = findViewById(R.id.imageView);
        //textView = findViewById(R.id.imageInfo);


        list = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this, R.layout.image_info, R.id.imageInfo, list);

        //glide
//        RequestOptions myOptions = new RequestOptions()
//                .fitCenter()
//                .override(40, 40);
//        Glide.with(this)
//                .load(image.getImageURL())
//                .apply(myOptions)
//                .into(imageView);


        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot ds: dataSnapshot.getChildren())
                {
                    image = ds.getValue(Images.class);

                    //Picasso.get().load("http://via.placeholder.com/300.png").into(imageView);
                    //Picasso.get().load("http://via.placeholder.com/300.png").into(imageView);
                    //Picasso.get().load("http://via.placeholder.com/300.png").fit().into(imageView);
                    list.add(image.getImageName() + " " + image.getImageURL());//  +An ImageView instance; //


                }

                //listView.setAdapter(adapter);

                   // String message = dataSnapshot.child("imageURL").getValue(String.class);
                    //textView.setText("http://via.placeholder.com/300.png");
                    //Picasso.get().load(message).into(imageView);
                    //String link =  dataSnapshot.getValue(String.class);
                    //String link = dataSnapshot.child("Images").getValue(String.class);
                    //Picasso.get().load(link).into(imageView);

                //Images data = dataSnapshot.getValue(Images.class);



            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}
