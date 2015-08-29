package com.example.amd.fragmenttutorial;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getFragmentManager();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addA(View view) {
        FragmentA fragmentA = new FragmentA();
        if(fragmentManager.findFragmentByTag("Fragment A")!=null &&
                fragmentManager.findFragmentByTag("Fragment A").isVisible() ){
            Toast.makeText(this, "A is already added ", Toast.LENGTH_SHORT).show();
        }else {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.add(R.id.group, fragmentA, "Fragment A");
            transaction.commit();
        }
    }

    public void removeA(View view) {
        FragmentA fragmentA= (FragmentA) fragmentManager.findFragmentByTag("Fragment A");
        if(fragmentA!=null) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.remove(fragmentA);
            transaction.commit();
        }
        else {
            Toast.makeText(this, "A is not yet Added to be removed", Toast.LENGTH_SHORT).show();
        }
    }

    public void replaceAwithB(View view) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.group, fragmentB, "Fragment B");
        transaction.commit();
    }

    public void addB(View view) {
        FragmentB fragmentB = new FragmentB();
        if(fragmentManager.findFragmentByTag("Fragment B")!=null && fragmentManager.findFragmentByTag("Fragment B").isVisible()){
            Toast.makeText(this, "B is already added ", Toast.LENGTH_SHORT).show();
        }else {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.add(R.id.group, fragmentB, "Fragment B");
            transaction.commit();
        }

    }

    public void removeB(View view) {
        FragmentB fragmentB= (FragmentB) fragmentManager.findFragmentByTag("Fragment B");
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if(fragmentB!=null) {
            transaction.remove(fragmentB);
            transaction.commit();
        }
        else {
            Toast.makeText(this, "B is not yet Added to be removed", Toast.LENGTH_SHORT).show();
        }
    }

    public void replceBwithA(View view) {
    }

    public void attachA(View view) {
    }

    public void detachB(View view) {
    }
}
