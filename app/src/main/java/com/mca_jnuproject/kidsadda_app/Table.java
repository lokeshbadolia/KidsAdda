package com.mca_jnuproject.kidsadda_app;

import android.support.v7.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Table extends AppCompatActivity {

    private Context context = this;
    private EditText TableVal;
    private Button TableBtn;

    private ImageView Table_backBtn;

    private TextView Val1, Val2, Val3, Val4, Val5, Val6, Val7, Val8, Val9, Val10;
    private TextView Res1, Res2, Res3, Res4, Res5, Res6, Res7, Res8, Res9, Res10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        TableVal = (EditText) findViewById(R.id.table_val);
        TableBtn = (Button) findViewById(R.id.tablebtn);

        Table_backBtn = (ImageView) findViewById(R.id.table_backBtn);

        Val1 = (TextView) findViewById(R.id.val1);
        Val2 = (TextView) findViewById(R.id.val2);
        Val3 = (TextView) findViewById(R.id.val3);
        Val4 = (TextView) findViewById(R.id.val4);
        Val5 = (TextView) findViewById(R.id.val5);
        Val6 = (TextView) findViewById(R.id.val6);
        Val7 = (TextView) findViewById(R.id.val7);
        Val8 = (TextView) findViewById(R.id.val8);
        Val9 = (TextView) findViewById(R.id.val9);
        Val10 = (TextView) findViewById(R.id.val10);

        Res1 = (TextView) findViewById(R.id.res1);
        Res2 = (TextView) findViewById(R.id.res2);
        Res3 = (TextView) findViewById(R.id.res3);
        Res4 = (TextView) findViewById(R.id.res4);
        Res5 = (TextView) findViewById(R.id.res5);
        Res6 = (TextView) findViewById(R.id.res6);
        Res7 = (TextView) findViewById(R.id.res7);
        Res8 = (TextView) findViewById(R.id.res8);
        Res9 = (TextView) findViewById(R.id.res9);
        Res10 = (TextView) findViewById(R.id.res10);

        TableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                String tableval = TableVal.getText().toString().trim();
                if(!TextUtils.isEmpty(tableval)){
                    int v = Integer.valueOf(tableval);

                    String conText = String.valueOf(v);
                    Val1.setText(conText);
                    Val2.setText(conText);
                    Val3.setText(conText);
                    Val4.setText(conText);
                    Val5.setText(conText);
                    Val6.setText(conText);
                    Val7.setText(conText);
                    Val8.setText(conText);
                    Val9.setText(conText);
                    Val10.setText(conText);

                    Res1.setText(String.valueOf(v));
                    Res2.setText(String.valueOf(v*2));
                    Res3.setText(String.valueOf(v*3));
                    Res4.setText(String.valueOf(v*4));
                    Res5.setText(String.valueOf(v*5));
                    Res6.setText(String.valueOf(v*6));
                    Res7.setText(String.valueOf(v*7));
                    Res8.setText(String.valueOf(v*8));
                    Res9.setText(String.valueOf(v*9));
                    Res10.setText(String.valueOf(v*10));

                }else{
                    Toast.makeText(context,"Please enter a value",Toast.LENGTH_LONG).show();
                }
            }
        });

        Table_backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        this.finish();
        super.onBackPressed();
    }
}
