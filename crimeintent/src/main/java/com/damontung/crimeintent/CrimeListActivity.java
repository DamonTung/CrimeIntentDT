package com.damontung.crimeintent;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2016/3/18.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
