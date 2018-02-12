package com.nano.projectjonobak.divisions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nano.projectjonobak.divisions.districts.Bogra;
import com.nano.projectjonobak.R;
import com.nano.projectjonobak.divisions.districts.Chapainawabganj;
//import com.nano.projectjonobak.divisions.districts.Joypurhat;
//import com.nano.projectjonobak.divisions.districts.Naogon;
import com.nano.projectjonobak.divisions.districts.Joypurhat;
import com.nano.projectjonobak.divisions.districts.Naogon;
import com.nano.projectjonobak.divisions.districts.Natore;
import com.nano.projectjonobak.divisions.districts.Pabna;
import com.nano.projectjonobak.divisions.districts.Rajshahi;
import com.nano.projectjonobak.divisions.districts.Sirajgang;

public class RajshahiDistrict extends AppCompatActivity implements View.OnClickListener {

    private Button BograButton, ChapaiButton, JoypurhatButton, NaogaonButton, NatoreButton, PabnaButton, RajshahiButton, SirajgongButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_rajshahi_district);

        BograButton = (Button) findViewById ( R.id.BograDistrictId );
        ChapaiButton = (Button) findViewById ( R.id.ChapaiDistrictId );
        JoypurhatButton = (Button) findViewById ( R.id.JoypurhatDistrictId );
        NaogaonButton = (Button) findViewById ( R.id.NaogaonDistrictId);
        NatoreButton = (Button) findViewById ( R.id.NatorDistrictId);
        PabnaButton = (Button) findViewById ( R.id.PabnaDistrictId );
        RajshahiButton = (Button) findViewById ( R.id.RajshahiDistrictId);
        SirajgongButton= (Button) findViewById ( R.id.SirajgangDistrictId );

        BograButton.setOnClickListener ( this );
        ChapaiButton.setOnClickListener ( this );
        JoypurhatButton.setOnClickListener ( this );
        NaogaonButton.setOnClickListener ( this );
        NatoreButton.setOnClickListener ( this );
        PabnaButton.setOnClickListener ( this );
        RajshahiButton.setOnClickListener ( this );
        SirajgongButton.setOnClickListener ( this );


    }

    @Override
    public void onClick(View v) {

        if (v.getId () == R.id.BograDistrictId)
        {

            Intent intent = new Intent ( RajshahiDistrict.this,Bogra.class );
            startActivity ( intent );
        }

       else if (v.getId () == R.id.ChapaiDistrictId)
       {

            Intent intent = new Intent ( RajshahiDistrict.this,Chapainawabganj.class );
            startActivity ( intent );
       }

        else if (v.getId () == R.id.JoypurhatDistrictId)
        {

            Intent intent = new Intent ( RajshahiDistrict.this,Joypurhat.class );
            startActivity ( intent );
        }


        else if (v.getId () == R.id.NaogaonDistrictId)
        {

            Intent intent = new Intent ( RajshahiDistrict.this,Naogon.class );
            startActivity ( intent );
        }

        else if (v.getId () == R.id.NatorDistrictId)
        {

            Intent intent = new Intent ( RajshahiDistrict.this,Natore.class );
            startActivity ( intent );
        }

        else if (v.getId () == R.id.PabnaDistrictId)
        {

            Intent intent = new Intent ( RajshahiDistrict.this,Pabna.class );
            startActivity ( intent );
        }

        else if (v.getId () == R.id.RajshahiDistrictId)
        {

            Intent intent = new Intent ( RajshahiDistrict.this,Rajshahi.class );
            startActivity ( intent );
        }


        else if (v.getId () == R.id.SirajgangDistrictId)
        {

            Intent intent = new Intent ( RajshahiDistrict.this,Sirajgang.class );
            startActivity ( intent );
        }




    }
}
