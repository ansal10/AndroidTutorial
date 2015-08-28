package com.example.amd.fragmenttutorial;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AnotherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);

        FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        if(fragmentB!=null)
            fragmentB.changeData(index);
    }

}
