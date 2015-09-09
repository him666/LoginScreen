package com.senbonzakura.marin.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   private EditText name;
    private EditText lname;
    private EditText email;
    private EditText pass;
    private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.edt0);
        lname = (EditText)findViewById(R.id.edt1);
        email = (EditText)findViewById(R.id.edt2);
        pass  = (EditText)findViewById(R.id.edt3);
        send = (Button) findViewById(R.id.btn);
        send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                String nombre = name.getText().toString();
                String apelle = lname.getText().toString();
                String mairu = email.getText().toString();
                String val = pass.getText().toString();
                i.putExtra("Nombre",nombre);
                i.putExtra("Apel",apelle);
                i.putExtra("Mail",mairu);
                i.putExtra("Passtl",val);
                System.out.println("prueba"+nombre+" "+apelle+" "+mairu+" "+val);
                startActivity(i);

            }
        });
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
}
