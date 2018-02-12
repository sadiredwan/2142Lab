package com.nano.projectjonobak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nano.projectjonobak.divisions.BarisalDistrict;
import com.nano.projectjonobak.divisions.ChittagongDistrict;
import com.nano.projectjonobak.divisions.ChittagongDistrict;
import com.nano.projectjonobak.divisions.DhakaDistrict;
import com.nano.projectjonobak.divisions.MymensinghDistrict;
import com.nano.projectjonobak.divisions.RajshahiDistrict;
import com.nano.projectjonobak.divisions.RangpurDistrict;
import com.nano.projectjonobak.divisions.RangpurDistrict;
import com.nano.projectjonobak.divisions.SylhetDistrict;
import com.nano.projectjonobak.divisions.BarisalDistrict;
import com.nano.projectjonobak.divisions.KhulnaDistrict;

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

            Intent intent = new Intent ( DivisionList.this,RajshahiDistrict.class );
            startActivity ( intent );
        }

        else if (v.getId () == R.id.ChittagongDivisionId)
        {

            Intent intent = new Intent ( DivisionList.this, ChittagongDistrict.class );
            startActivity ( intent );
        }

        else if (v.getId () == R.id.DhakaDivisionId)
        {

            Intent intent = new Intent ( DivisionList.this,DhakaDistrict.class );
            startActivity ( intent );
        }

        else if (v.getId () == R.id.SylhetDivisionId)
        {

            Intent intent = new Intent ( DivisionList.this,SylhetDistrict.class );
            startActivity ( intent );
        }

        else if (v.getId () == R.id.BarisalDivisionId)
        {

            Intent intent = new Intent ( DivisionList.this,BarisalDistrict.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.RangpurDivisionId)
        {

            Intent intent = new Intent ( DivisionList.this, RangpurDistrict.class );
            startActivity ( intent );
        }

        else if (v.getId () == R.id.KhulnaDivisionId)
        {

            Intent intent = new Intent ( DivisionList.this, KhulnaDistrict.class );
            startActivity ( intent );
        }

        else if (v.getId () == R.id.MymensinghDivisionId)
        {

            Intent intent = new Intent ( DivisionList.this, MymensinghDistrict.class );
            startActivity ( intent );
        }


    }
}
