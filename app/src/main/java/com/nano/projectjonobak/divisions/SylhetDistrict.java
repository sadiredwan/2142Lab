package com.nano.projectjonobak.divisions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nano.projectjonobak.divisions.districts.HabiganjDistrict;
import com.nano.projectjonobak.divisions.districts.MoulviBazarDistrict;
import com.nano.projectjonobak.R;
import com.nano.projectjonobak.divisions.districts.SunamganjDistrict;
import com.nano.projectjonobak.divisions.districts.Sylhet;

public class SylhetDistrict extends AppCompatActivity implements View.OnClickListener {

    private Button habigongButton, moulvibazarButton, sunamganjButton, sylhetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_sylhet_district );

        habigongButton = ( Button ) findViewById ( R.id.HabiganjDistrictId );
        moulvibazarButton = ( Button ) findViewById ( R.id.MoulvibazarDistrictId );
        sunamganjButton = ( Button ) findViewById ( R.id.SunamganjDistrictId );
        sylhetButton = ( Button ) findViewById ( R.id.SylhetDistrictId );


        habigongButton.setOnClickListener ( this );
        moulvibazarButton.setOnClickListener ( this );
        sunamganjButton.setOnClickListener ( this );
        sylhetButton.setOnClickListener ( this );


    }

    @Override
    public void onClick(View v) {

        if (v.getId () == R.id.HabiganjDistrictId)
        {

            startActivity ( new Intent ( SylhetDistrict.this, HabiganjDistrict.class ) );
        }

      else if (v.getId () == R.id.MoulvibazarDistrictId)
        {

            startActivity ( new Intent ( SylhetDistrict.this, MoulviBazarDistrict.class  ) );
        }

        else if (v.getId () == R.id.SunamganjDistrictId)
        {

            startActivity ( new Intent ( SylhetDistrict.this, SunamganjDistrict.class  ) );
        }

        else if (v.getId () == R.id.SylhetDistrictId)
        {

            startActivity ( new Intent ( SylhetDistrict.this, Sylhet.class  ) );
        }

    }
}
