package com.nano.projectjonobak;

/**
 * Created by User on 05-Feb-18.
 */


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.os.Bundle;

public class Home  extends AppCompatActivity implements View.OnClickListener
{
    private Button categoriesButton, helpButton, accountSettingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        categoriesButton = (Button ) findViewById ( R.id.CategoriesHomeId );
        helpButton = (Button ) findViewById ( R.id.HelpHomeId );
        accountSettingButton = ( Button ) findViewById ( R.id.AccountSettingHomeId);

        categoriesButton.setOnClickListener ( this );
        helpButton.setOnClickListener ( this );
        accountSettingButton.setOnClickListener ( this );

    }


    @Override
    public void onClick(View v) {

        if(v.getId () == R.id.CategoriesHomeId)
        {

            Intent intent = new Intent ( Home.this,CategoriesActivity.class );
            startActivity ( intent );

        }

        else if(v.getId () == R.id.CategoriesHomeId)
        {


        }
        else if(v.getId () == R.id.CategoriesHomeId)
        {


        }
    }
}
