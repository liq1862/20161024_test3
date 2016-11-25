package com.example.user.a20161024_test3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView tv,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);         //spinner  :  下拉選單
        tv = (TextView) findViewById(R.id.textView2);
        tv2 = (TextView) findViewById(R.id.textView3);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //兩種方式

                //TextView itemTV = (TextView) view;
                //String str = itemTV.getText().toString();

                String[] f = getResources().getStringArray(R.array.fruits);
                String str = f[position];       //position為被選取元素的索引值

                tv.setText(str);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void Click1(View v)              //按下button後決定輸出內容
    {
        int p = spinner.getSelectedItemPosition();
        String[] f = getResources().getStringArray(R.array.fruits);
        String str = f[p];

        tv2.setText(str);
    }
}
