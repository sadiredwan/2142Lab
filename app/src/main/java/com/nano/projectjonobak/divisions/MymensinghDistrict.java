package com.nano.projectjonobak.divisions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nano.projectjonobak.R;
import com.nano.projectjonobak.divisions.districts.Jamalpur;
import com.nano.projectjonobak.divisions.districts.Kishoreganj;
import com.nano.projectjonobak.divisions.districts.Mymensingh;
import com.nano.projectjonobak.divisions.districts.Netrokona;
import com.nano.projectjonobak.divisions.districts.Sherpur;
import com.nano.projectjonobak.divisions.districts.Tangail;

public class MymensinghDistrict extends AppCompatActivity implements View.OnClickListener {
    private Button SherpurButton, JamalpurButton, TangailButton, NetrokonaButton, KishoreganjButton, MymensinghButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensingh_district);
        SherpurButton = (Button) findViewById(R.id.SherpurDistrictId);
        JamalpurButton = (Button) findViewById(R.id.JamalpurDistrictId);
        TangailButton = (Button) findViewById(R.id.TangailDistrictId);
        NetrokonaButton = (Button) findViewById(R.id.NetrokonaDistrictId);
        KishoreganjButton = (Button) findViewById(R.id.KishoreganjDistrictId);
        MymensinghButton = (Button) findViewById(R.id.MymensinghDistrictId);

        SherpurButton.setOnClickListener(this);
        JamalpurButton.setOnClickListener(this);
        TangailButton.setOnClickListener(this);
        NetrokonaButton.setOnClickListener(this);
        KishoreganjButton.setOnClickListener(this);
        MymensinghButton.setOnClickListener(this);
    }
        @Override
        public void onClick(View v) {

            if (v.getId () == R.id.SherpurDistrictId)
            {

                Intent intent = new Intent ( MymensinghDistrict.this,Sherpur.class );
                startActivity ( intent );
            }

            else if (v.getId () == R.id.JamalpurDistrictId)
            {

                Intent intent = new Intent ( MymensinghDistrict.this,Jamalpur.class );
                startActivity ( intent );
            }
            else if (v.getId () == R.id.TangailDistrictId)
            {

                Intent intent = new Intent ( MymensinghDistrict.this,Tangail.class );
                startActivity ( intent );
            }
            else if (v.getId () == R.id.NetrokonaDistrictId)
            {

                Intent intent = new Intent ( MymensinghDistrict.this,Netrokona.class );
                startActivity ( intent );
            }
            else if (v.getId () == R.id.KishoreganjDistrictId)
            {

                Intent intent = new Intent ( MymensinghDistrict.this,Kishoreganj.class );
                startActivity ( intent );
            }
            else if (v.getId () == R.id.MymensinghDistrictId)
            {

                Intent intent = new Intent ( MymensinghDistrict.this,Mymensingh.class );
                startActivity ( intent );
            }

        }
}
