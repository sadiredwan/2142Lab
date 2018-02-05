package com.nano.projectjonobak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class CategoriesActivity extends AppCompatActivity implements View.OnClickListener {

         private Button divisionButton, ministerButton, secretariatsButton;
        @Override
         protected void onCreate(Bundle savedInstanceState) {

            super.onCreate ( savedInstanceState );
            setContentView ( R.layout.activity_categories);
            divisionButton = ( Button ) findViewById ( R.id.divisionCategoriesButtonId );
            ministerButton = ( Button ) findViewById ( R.id.ministerCategoriesButtonId );
            secretariatsButton = ( Button ) findViewById ( R.id.secretariatsCategoriesButtonId);
            divisionButton.setOnClickListener ( this );
            ministerButton.setOnClickListener ( this );
            secretariatsButton .setOnClickListener ( this );

        }

    @Override
    public void onClick(View v) {

        if(v.getId () == R.id.divisionCategoriesButtonId)
        {
            //Intent intent = new Intent ( CategoriesActivity.this,DivisionList.class );
            //startActivity ( intent );
        }


        else if(v.getId () == R.id.ministerCategoriesButtonId)
        {


        }

        else if(v.getId () == R.id.secretariatsCategoriesButtonId)
        {


        }

    }
}







}
