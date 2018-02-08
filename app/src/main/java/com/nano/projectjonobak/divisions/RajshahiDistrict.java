package com.nano.projectjonobak.divisions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nano.projectjonobak.divisions.districts.Bogra;
import com.nano.projectjonobak.R;

public class RajshahiDistrict extends AppCompatActivity implements View.OnClickListener {

    private Button BograButton, ChapaiButton, JoypurhatButton, NaogaonButton, NatoreButton, PabnaButton, RajshahiButton, SirajgongButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_rajshahi_district);

        BograButton = (Button) findViewById ( R.id.BograDistrictId );
        ChapaiButton = (Button) findViewById ( R.id.ChapaiDistrictId );
        JoypurhatButton = (Button) findViewById ( R.id.JoypurhatDistrictId );
        NaogaonButton = (Button) findViewById ( R.id.BograDistrictId );
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

        else if (v.getId () == R.id.PabnaDistrictId)
        {

            Intent intent = new Intent ( RajshahiDistrict.this,RajshahiDistrict.class );
            startActivity ( intent );
        }


    }
}
