package com.example.androidme.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.androidme.R;
import com.example.androidme.data.AndroidImageAssets;

public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);


        BodyPartFragment headFragment =new BodyPartFragment();

        headFragment.setImageIds(AndroidImageAssets.getHeads());
        int headIndex=getIntent().getIntExtra("head Index",0);
        headFragment.setListIndex(headIndex);

        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.head_container,headFragment).commit();



        BodyPartFragment bodyFragment = new BodyPartFragment();
        bodyFragment.setImageIds(AndroidImageAssets.getBodies());
        int bodyIndex = getIntent().getIntExtra("bodyIndex", 0);
        bodyFragment.setListIndex(bodyIndex);

        fragmentManager.beginTransaction().add(R.id.body_container, bodyFragment).commit();



        BodyPartFragment legFragment = new BodyPartFragment();
        legFragment.setImageIds(AndroidImageAssets.getLegs());
        int legIndex = getIntent().getIntExtra("legIndex", 0);
        legFragment.setListIndex(legIndex);

        fragmentManager.beginTransaction().add(R.id.leg_container, legFragment).commit();
    }
}
