package com.nano.projectjonobak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DivisionList extends AppCompatActivity implements View.OnClickListener{

    private Button rajshahiDivision, dhakaDivision, rangpurDivision, sylhetDivision, mymensinghDivison, khulnaDivision, barisalDivision, chittagongDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_division_list );

        rajshahiDivision = (Button) findViewById ( R.id.RajshahiDivisionId );
        dhakaDivision = (Button) findViewById ( R.id.DhakaDivisionId );
        rangpurDivision = (Button) findViewById ( R.id.RangpurDivisionId);
        sylhetDivision = (Button) findViewById ( R.id.SylhetDivisionId);
        mymensinghDivison = (Button) findViewById ( R.id.MymensinghDivisionId );
        khulnaDivision = (Button) findViewById ( R.id.KhulnaDivisionId );
        barisalDivision = (Button) findViewById ( R.id.BarisalDivisionId );
        chittagongDivision = (Button) findViewById ( R.id.ChittagongDivisionId);

        rajshahiDivision.setOnClickListener ( this );
        dhakaDivision.setOnClickListener ( this );
        rangpurDivision.setOnClickListener ( this );
        sylhetDivision.setOnClickListener ( this );
        mymensinghDivison.setOnClickListener ( this );
        khulnaDivision.setOnClickListener ( this );
        barisalDivision.setOnClickListener ( this );
        chittagongDivision.setOnClickListener ( this );


    }

    @Override
    public void onClick(View v) {

        if (v.getId () == R.id.RajshahiDivisionId)
        {

            Intent intent = new Intent ( DivisionList.this,RajshaiDistrict.class );
            startActivity ( intent );
        }


    }
}
