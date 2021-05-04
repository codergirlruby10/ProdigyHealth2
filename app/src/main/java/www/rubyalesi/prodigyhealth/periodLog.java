package www.rubyalesi.prodigyhealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class periodLog extends AppCompatActivity {
    private Button periodCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_period_log);

        periodCalendar = findViewById(R.id.button_Period_Calendar);

        periodCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent periodCalendar = new Intent(periodLog.this, periodCalendar.class);
                startActivity(periodCalendar);
            }
        });
    }
}