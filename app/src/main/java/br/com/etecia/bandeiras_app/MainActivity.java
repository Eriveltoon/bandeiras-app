package br.com.etecia.bandeiras_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Model.State;

public class MainActivity extends AppCompatActivity {

    State[] states = {
            new State ("São Paulo", "São Paulo é um estado gigante", "500.50 mil metro de área territorial", "50 milhões de abitantes"),
            new State ("Rio de Janeiro", "Rio de Janeiro é muito perigoso", "300.00 mil metro de área territorial", "30 milhões de abitantes")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
