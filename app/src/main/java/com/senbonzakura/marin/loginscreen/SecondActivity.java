package com.senbonzakura.marin.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
   private TextView nom;
   private  TextView ape;
    private TextView ema;
    private TextView pas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nom = (TextView) findViewById(R.id.editText);
        ape =  (TextView) findViewById(R.id.editText2);
       ema= (TextView) findViewById(R.id.editText3);
        pas = (TextView) findViewById(R.id.editText4);
        Intent i = getIntent();
        Bundle bundle = i.getExtras();
        if(bundle !=null){
            String name = (String)  bundle.get("Nombre");
            String lastname = (String)  bundle.get("Apel");
            String emailto = (String)bundle.get("Mail");
            String passw = (String) bundle.get("Passtl");
            nom.setText(name);
            ape.setText(lastname);
            ema.setText(emailto);
            pas.setText(passw);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
}
