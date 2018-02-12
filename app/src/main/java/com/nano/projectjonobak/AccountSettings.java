package com.nano.projectjonobak;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.nano.projectjonobak.divisions.districts.Bogra;

public class AccountSettings extends AppCompatActivity {

    private EditText nameField;
    private EditText emailField;
    private EditText passwordField;
    private Button registerBtn;

    private FirebaseAuth auth;
    private DatabaseReference database;
    private ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);

//        progress = new ProgressDialog(this);
//        database = FirebaseDatabase.getInstance().getReference().child("projectjonobak").child("users");
//        auth = FirebaseAuth.getInstance();
//        nameField = (EditText) findViewById(R.id.nameField);
//        emailField = (EditText) findViewById(R.id.emailField);
//        passwordField = (EditText) findViewById(R.id.passwordField);
//        registerBtn = (Button) findViewById(R.id.registerBtn);
//
//        registerBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startRegister();
//            }
//        });
//    }

//    public String parentName(){
//        Bundle bundle = getIntent().getExtras();
//        String name = bundle.getString("PARENT_ACTIVITY");
//        return name;
//    }

//    private void startRegister(){
//        final String name = nameField.getText().toString().trim();
//        String email = emailField.getText().toString().trim();
//        String password = passwordField.getText().toString().trim();
//
//        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)){
//            progress.setMessage("Signing Up ...");
//            progress.show();
//            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task) {
//                    if(task.isSuccessful()){
//                        String user_id = auth.getCurrentUser().getUid();
//                        DatabaseReference current_user = database.child(user_id);
//                        current_user.child("name").setValue(name);
//                        current_user.child("image").setValue("default");
//                        progress.dismiss();
//                        Intent parentIntent = new Intent(AccountSettings.this, parentName().getClass());
//                        parentIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                        startActivity(parentIntent);
//                    }
//                }
//            });
//        }
    }
}
