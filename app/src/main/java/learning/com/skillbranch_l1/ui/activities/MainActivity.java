package learning.com.skillbranch_l1.ui.activities;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import learning.com.skillbranch_l1.R;

public class MainActivity extends AppCompatActivity {

    Button btnChangeColor;
    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChangeColor = (Button) findViewById(R.id.btnChangeColor);
        tvText = (TextView) findViewById(R.id.tvText);

        btnChangeColor.setOnClickListener(onClickListener);

    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvText.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        }
    };
}
