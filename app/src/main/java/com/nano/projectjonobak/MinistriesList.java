package com.nano.projectjonobak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nano.projectjonobak.ministries.Agriculture;
import com.nano.projectjonobak.ministries.CivilAviation;
import com.nano.projectjonobak.ministries.Commerce;
import com.nano.projectjonobak.ministries.Education;
import com.nano.projectjonobak.ministries.Enviroment;
import com.nano.projectjonobak.ministries.Finance;
import com.nano.projectjonobak.ministries.Fisheries;
import com.nano.projectjonobak.ministries.Health;
import com.nano.projectjonobak.ministries.Industries;
import com.nano.projectjonobak.ministries.Liberation;
import com.nano.projectjonobak.ministries.Power;
import com.nano.projectjonobak.ministries.PublicAdministration;
import com.nano.projectjonobak.ministries.RailWays;
import com.nano.projectjonobak.ministries.Textile;
import com.nano.projectjonobak.ministries.WomenandChildren;
import com.nano.projectjonobak.ministries.YouthandSports;

public class MinistriesList extends AppCompatActivity implements View.OnClickListener {

    private Button agriculture, commerce, civil, education, environment, finance, fisheries, health, industries, liberation, publicadministration, power, railways, textiles, women,  youth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_ministries_list );

        agriculture = (Button) findViewById ( R.id.AgricultureMinistryId );
        commerce = (Button) findViewById ( R.id.CommerceMinistryId );
        civil = (Button) findViewById ( R.id.CivilAviationandourismMinistryId );
        education = (Button) findViewById ( R.id.EducationMinistryId );
        environment = (Button) findViewById ( R.id.EnvironmentandForestMinistryId );
        finance = (Button) findViewById ( R.id.FinanceMinistryId );
        fisheries = (Button) findViewById ( R.id.FisheriesandLivestockMinistryId );
        health = (Button) findViewById ( R.id.HealthandFamilyWelfareMinistryId );
        industries = (Button) findViewById ( R.id.IndustriesMinistryId );
        liberation = (Button) findViewById ( R.id.LiberationWarAffairsMinistryId );
        publicadministration = (Button) findViewById ( R.id.PublicAdministrationMinistryId );
        power = (Button) findViewById ( R.id.PowerEnergyandMineralResourcesMinistryId);
        railways = (Button) findViewById ( R.id.RailwaysMinistryId );
        textiles = (Button) findViewById ( R.id.TextilesandJuteMinistryId );
        women = (Button) findViewById ( R.id.WomenandChildrenAffairsMinistryId );
        youth = (Button) findViewById ( R.id.YouthandSportsMinistryId );

        agriculture.setOnClickListener ( this );
        commerce.setOnClickListener ( this );
        civil.setOnClickListener ( this );
        education.setOnClickListener ( this );
        environment.setOnClickListener ( this );
        finance.setOnClickListener ( this );
        fisheries.setOnClickListener ( this );
        health.setOnClickListener ( this );
        industries.setOnClickListener ( this );
        liberation.setOnClickListener ( this );
        publicadministration.setOnClickListener ( this );
        power.setOnClickListener ( this );
        railways.setOnClickListener ( this );
        textiles.setOnClickListener ( this );
        women.setOnClickListener ( this );
        youth.setOnClickListener ( this );


    }

    @Override
    public void onClick(View v) {

        if (v.getId () == R.id.AgricultureMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,Agriculture.class );
            startActivity ( intent );
        }

       else if (v.getId () == R.id.CommerceMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,Commerce.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.CivilAviationandourismMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,CivilAviation.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.EducationMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,Education.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.EnvironmentandForestMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,Enviroment.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.FinanceMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,Finance.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.FisheriesandLivestockMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,Fisheries.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.HealthandFamilyWelfareMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,Health.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.IndustriesMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,Industries.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.LiberationWarAffairsMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,Liberation.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.PublicAdministrationMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,PublicAdministration.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.PowerEnergyandMineralResourcesMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,Power.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.RailwaysMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,RailWays.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.TextilesandJuteMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,Textile.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.WomenandChildrenAffairsMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,WomenandChildren.class );
            startActivity ( intent );
        }
        else if (v.getId () == R.id.YouthandSportsMinistryId)
        {
            Intent intent = new Intent ( MinistriesList.this,YouthandSports.class );
            startActivity ( intent );
        }

    }
}
