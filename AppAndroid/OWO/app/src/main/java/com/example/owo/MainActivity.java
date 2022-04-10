package com.example.owo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.sql.SQLException;

import javax.xml.parsers.ParserConfigurationException;

public class MainActivity extends AppCompatActivity {

    Button submit;
    ProgressBar round;
    TextView sito,reg;
    Condivisa c;
    WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = Condivisa.getInstance();

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        sito = findViewById(R.id.txtSito);
        reg = findViewById(R.id.txtRegistrati);
        round = findViewById(R.id.progressBar3);
        submit = findViewById(R.id.submit);

        username.setText(c.username);
        password.setText(c.password);
        round.setVisibility(View.INVISIBLE);

        sito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //redirect al sito
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check testo textbox
                round.setVisibility(View.VISIBLE);
                try {
                    boolean ok = checkLogIn();
                    if (ok){

                        openSubmitActivity();
                    }
                    else {
                        round.setVisibility(View.INVISIBLE);
                        createAlert("ERROR!", "Credenziali errate");
                    }
                } catch (
                        IOException e) {
                    createAlert("ERROR!", e.toString());
                } catch (
                        ParserConfigurationException e) {
                    createAlert("ERROR!", e.toString());
                } catch (
                        SAXException e) {
                    createAlert("ERROR!", e.toString());
                } catch (InterruptedException e) {
                    createAlert("ERROR!", e.toString());
                }
            }

        });
    }


    public void createAlert(String title, String message) {
        AlertDialog.Builder builder
                = new AlertDialog
                .Builder(MainActivity.this);
        builder.setMessage(message);
        builder.setTitle(title);
        builder.setCancelable(true);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public boolean checkLogIn() throws ParserConfigurationException, IOException, SAXException, InterruptedException {
        boolean check = true;
        EditText u = findViewById(R.id.username);
        EditText p = findViewById(R.id.password);
        c.username = u.getText().toString();
        c.password = p.getText().toString();
        XMLParser xml = new XMLParser();
        String path = Condivisa.path + "login.php?email=" + c.username + "&password=" + c.password;
        String result = xml.Parse_Login(path);
        if(!result.equals("OK"))
        {
            check = false;
        }
        return check;
    }

    public void openSubmitActivity() {
        Intent intent = new Intent(this, SubmitActivity.class);
        startActivity(intent);

    }
    public void openRegisterActivity() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

}