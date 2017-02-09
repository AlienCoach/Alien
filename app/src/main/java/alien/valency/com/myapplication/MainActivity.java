package alien.valency.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b_boo;
    private Button bt_para;
    private Button bt_play;
    private String spacing1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_boo = (Button) findViewById(R.id.b_boo);
        b_boo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Boo 2222", Toast.LENGTH_LONG).show();

            }
        });


        bt_play = (Button) findViewById(R.id.bt_play);
        bt_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Switche to game 1st screen", Toast.LENGTH_LONG).show();
            }
        });

        bt_para = (Button) findViewById(R.id.bt_para);
//        bt_para.setTextColor(000000);
        bt_para.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"go to Parameters screen", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"kuku", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"kuku kuku kuku", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"kuku", Toast.LENGTH_LONG).show();

            }
        });


    }
}
