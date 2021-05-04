package www.rubyalesi.prodigyhealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class userProfile extends AppCompatActivity {
    private Button logPeriod;
    private Button vaginalHealth;
    private Button health_and_fitness;
    private Button reproductiveHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        logPeriod = findViewById(R.id.button_Log_Period);
        vaginalHealth = findViewById(R.id.button_Vaginal_Health);
        health_and_fitness = findViewById(R.id.button_health_and_fitness);
        reproductiveHealth = findViewById(R.id.button_Reproductive_health);


        logPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logPeriod = new Intent(userProfile.this, periodLog.class);
                startActivity(logPeriod);
            }

        });

        vaginalHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaginalHealth = new Intent(userProfile.this, vaginalHealth.class);
                startActivity(vaginalHealth);
            }
        });

        health_and_fitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent healthAndFitness = new Intent(userProfile.this, healthAndFitness.class);
                startActivity(healthAndFitness);
            }
        });

        reproductiveHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reproductiveHealth = new Intent(userProfile.this, reproductiveHealth.class);
                startActivity(reproductiveHealth);
            }
        });
    }
}