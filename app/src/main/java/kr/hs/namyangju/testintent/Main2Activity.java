package kr.hs.namyangju.testintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textResult;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        String data = getIntent().getStringExtra("data");
        boolean data1 = getIntent().getBooleanExtra("data1", true);
        if (data1){
            textResult.setText("1");
        }else {
            textResult.setText("2");
        }


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });



    }

    void init(){
        back = (Button) findViewById(R.id.back);
        textResult = (TextView) findViewById(R.id.dataResult);

    }
}
