package ir.niknesh.trading.myActivity;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;


import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

import ir.niknesh.trading.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(getApplicationContext()));
        }


        Python py  = Python.getInstance();
        PyObject pyObject = py.getModule("mycoinexapi");
        PyObject p = pyObject.callAttr("get_market_list");


        System.out.println(p.toString());


        p = pyObject.callAttr("get_order_limit" , "SHIBUSDT" , "BUY" , 1000 , 0.1);

        System.out.println(p.toString());







    }
}