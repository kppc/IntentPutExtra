package kr.hs.namyangju.testintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText result1;
    Intent intent;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = result1.getText().toString();
                boolean data1 = aSwitch.isChecked();
                intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("data", data);
                intent.putExtra("data1", data1);
                // getApplicationContext = MainActivity.this
                startActivity(intent);
            }
        });
    }

    void init() {
        btn = (Button) findViewById(R.id.btn);
        result1 = (EditText) findViewById(R.id.result1);
        aSwitch = (Switch) findViewById(R.id.switch_);
    }
}
