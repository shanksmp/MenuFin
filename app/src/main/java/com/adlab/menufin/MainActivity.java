package com.adlab.menufin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public boolean onCreateOptionsMenu(Menu menu){
//        super.onCreateOptionsMenu(menu);
//        MenuItem m1=menu.add(0,0,0,"NEW");
//        MenuItem m2=menu.add(0,1,1,"SAVE");
//        MenuItem m3=menu.add(0,2,2,"SAVE AS");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected(item);
        switch (item.getItemId())
        {
            case R.id.i1:
                Toast.makeText(getApplicationContext(),"Item1",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.i2:
                Toast.makeText(getApplicationContext(),"Item2",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.i21:
                Toast.makeText(getApplicationContext(),"Item2 Item1",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.i3:
                Toast.makeText(getApplicationContext(),"Item 3",Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}