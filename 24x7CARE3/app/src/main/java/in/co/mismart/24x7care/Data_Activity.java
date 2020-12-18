package in.co.mismart.azim24x7care;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Data_Activity extends AppCompatActivity {



    Toolbar tbdata;
    Button bnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_);

        tbdata=findViewById(R.id.tbdata);
        bnext=findViewById(R.id.bnext3);

        tbdata.setTitle("Data");

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Data_Activity.this,Services_Activity.class));
            }
        });
    }
}
