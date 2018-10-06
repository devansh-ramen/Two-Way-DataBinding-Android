package devanshapps.databindingexampleapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import devanshapps.databindingexampleapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    User data = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setData(data);

        setViews();
    }

    private void setViews() {
        data.setFirstName("Bob");
        data.setSurname("Dylan");

    }

    public void printData(View view) {
        Log.i(MainActivity.class.toString(),
                "User data: "  + data.getFirstName() + " " + data.getSurname()
                        + " works as " + data.getJobTitle() + " and likes to " + data.getHobbits());

    }
}
