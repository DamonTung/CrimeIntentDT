package com.damontung.crimeintent;


import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v4.app.FragmentActivity;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {
    /**
     * 无用，已用viewpager 代替
     * @return
     */
    @Override
    protected Fragment createFragment() {
        //return new CrimeFragment();
        UUID crimeId = (UUID)getIntent().getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);

        return CrimeFragment.newInstance(crimeId);
    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        if(fragment == null){
            fragment = new CrimeFragment();
            fm.beginTransaction().add(R.id.fragmentContainer,fragment).commit();
        }
    }*/


}
