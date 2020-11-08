package com.project.stardictionary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class buttonActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        btn1=(Button) findViewById(R.id.mercury);
        btn2=(Button) findViewById(R.id.venus);
        btn3=(Button) findViewById(R.id.mars);
        btn4=(Button) findViewById(R.id.earth);
        btn5=(Button) findViewById(R.id.jupiter);
        btn6=(Button) findViewById(R.id.saturn);
        btn7=(Button) findViewById(R.id.neptune);
        btn8=(Button) findViewById(R.id.moon);
        btn9=(Button) findViewById(R.id.sun);
        btn10=(Button) findViewById(R.id.uranus);
        btn11=(Button) findViewById(R.id.pluto);
        btn12=(Button) findViewById(R.id.comet);
        btn13=(Button) findViewById(R.id.blackhole);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt=new Intent(Intent.ACTION_VIEW);
                iNt.setData(Uri.parse("https://www.youtube.com/watch?v=m3ZUhpisWeQ&t=1s"));
                startActivity(iNt);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt2=new Intent(Intent.ACTION_VIEW);
                iNt2.setData(Uri.parse("https://www.youtube.com/watch?v=B2e-UQge8B8"));
                startActivity(iNt2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt2=new Intent(Intent.ACTION_VIEW);
                iNt2.setData(Uri.parse("https://www.youtube.com/watch?v=XRCIzZHpFtY"));
                startActivity(iNt2);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt2=new Intent(Intent.ACTION_VIEW);
                iNt2.setData(Uri.parse("https://www.youtube.com/watch?v=P5_GlAOCHyE"));
                startActivity(iNt2);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt2=new Intent(Intent.ACTION_VIEW);
                iNt2.setData(Uri.parse("https://www.youtube.com/watch?v=s56pxa9lpvo"));
                startActivity(iNt2);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt2=new Intent(Intent.ACTION_VIEW);
                iNt2.setData(Uri.parse("https://www.youtube.com/watch?v=AyFMPdHU1n0"));
                startActivity(iNt2);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt2=new Intent(Intent.ACTION_VIEW);
                iNt2.setData(Uri.parse("https://www.youtube.com/watch?v=faKnto4Pb6c"));
                startActivity(iNt2);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt2=new Intent(Intent.ACTION_VIEW);
                iNt2.setData(Uri.parse("https://www.youtube.com/watch?v=WGTBJHFNywI"));
                startActivity(iNt2);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt2=new Intent(Intent.ACTION_VIEW);
                iNt2.setData(Uri.parse("https://www.youtube.com/watch?v=inuCAqj8UgQ"));
                startActivity(iNt2);

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt2=new Intent(Intent.ACTION_VIEW);
                iNt2.setData(Uri.parse("https://www.youtube.com/watch?v=_aRAoM1i0D4"));
                startActivity(iNt2);

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt2=new Intent(Intent.ACTION_VIEW);
                iNt2.setData(Uri.parse("https://www.youtube.com/watch?v=-iZio70bd-M"));
                startActivity(iNt2);

            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt2=new Intent(Intent.ACTION_VIEW);
                iNt2.setData(Uri.parse("https://www.youtube.com/watch?v=fGTq14qCwJk"));
                startActivity(iNt2);

            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNt2=new Intent(Intent.ACTION_VIEW);
                iNt2.setData(Uri.parse("https://www.youtube.com/watch?v=FoExPq04OQQ"));
                startActivity(iNt2);

            }
        });


    }
}
