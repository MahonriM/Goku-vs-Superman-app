package com.example.gokuvsuperman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton imggoku,imgsuper;
    int vidagoku=100,vidasuper=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imggoku=findViewById(R.id.goku);
        imgsuper=findViewById(R.id.sup);
        imggoku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt1 =(TextView) findViewById(R.id.vidasuper);
                vidasuper=vidasuper-10;
                txt1.setText(""+ vidasuper);
                if(vidasuper<=0){
                    //TextView txt =(TextView) findViewById(R.id.vidagoku);
                    TextView txtres =(TextView) findViewById(R.id.resul);
                    txtres.setText("Goku ha ganado");
                }
            }
        });
        imgsuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vidagoku=vidagoku-10;
                TextView txt =(TextView) findViewById(R.id.vidagoku);
                txt.setText(""+vidagoku);
                if(vidagoku<=0){

                    TextView txtres =(TextView) findViewById(R.id.resul);
                    txtres.setText("Superman ha ganado");
                }

            }
        });
    }

}