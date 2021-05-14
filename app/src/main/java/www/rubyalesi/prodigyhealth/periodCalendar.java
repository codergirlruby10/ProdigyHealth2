package www.rubyalesi.prodigyhealth;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class periodCalendar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_period_calendar);
        setupHyperLink();


    }

    private void setupHyperLink() {
        TextView linkTextView = findViewById(R.id.periodCalendar_main_link);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}