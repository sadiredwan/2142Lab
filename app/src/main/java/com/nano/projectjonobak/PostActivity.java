package com.nano.projectjonobak;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import java.util.Random;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class PostActivity extends AppCompatActivity {

    private ImageButton selectImage;
    private static final int Gallery_Request = 1;
    private EditText postTitle;
    private EditText postDescription;
    private Button submitButton;
    private Uri imageUri = null;

    private StorageReference storage;
    private ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        storage = FirebaseStorage.getInstance().getReference();
        progress = new ProgressDialog(this);

        selectImage = (ImageButton) findViewById(R.id.imageSelect);
        postTitle = (EditText) findViewById(R.id.titleField);
        postDescription = (EditText) findViewById(R.id.descField);
        submitButton = (Button) findViewById(R.id.submitBtn);

        selectImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent galleryIntent = new Intent(Intent.ACTION_GET_CONTENT);
                galleryIntent.setType("image/*");
                startActivityForResult(galleryIntent, Gallery_Request);
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPosting();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == Gallery_Request && resultCode == RESULT_OK) {
            imageUri = data.getData();
            selectImage.setImageURI(imageUri);
        }
    }

    public static String random() {
        Random generator = new Random();
        StringBuilder randomStringBuilder = new StringBuilder();
        int randomLength = generator.nextInt(30);
        char tempChar;
        for(int i = 0; i < randomLength; i++){
            tempChar = (char) (generator.nextInt(96) + 32);
            randomStringBuilder.append(tempChar);
        }
        return randomStringBuilder.toString();
    }

    private void startPosting() {
        progress.setMessage("Posting ...");
        progress.show();
        String titleVal = postTitle.getText().toString().trim();
        String descriptionVal = postDescription.getText().toString().trim();

        if(!TextUtils.isEmpty(titleVal) && !TextUtils.isEmpty(descriptionVal) && imageUri != null){
            //StorageReference filepath = storage.child("Posted_Images").child(imageUri.getLastPathSegment());
            StorageReference filepath = storage.child("Posted_Images").child(random());
            filepath.putFile(imageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    Uri downloadUrl = taskSnapshot.getDownloadUrl();
                    progress.dismiss();
                }
            });
        }
    }
}
