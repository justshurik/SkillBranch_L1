package learning.com.skillbranch_l1.ui.activities;

import android.content.SharedPreferences;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import learning.com.skillbranch_l1.R;

public class MainActivity extends AppCompatActivity {

    SharedPreferences save;
    boolean ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       if(savedInstanceState==null) Log.d("TAG","Активити создано впервые");
       else Log.d("TAG","Активити уже было создано");

    }

   


}
