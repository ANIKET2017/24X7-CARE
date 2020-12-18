package in.co.mismart.azim24x7care;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Video_Activity extends AppCompatActivity {

    ImageView click;

    Toolbar toolbar3;
    Button next4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_);

        toolbar3 = findViewById(R.id.toolbar3);
        next4 = findViewById(R.id.bnext4);
        click = findViewById(R.id.click);

        toolbar3.setTitle(R.string.video);

        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Video_Activity.this, Data_Activity.class));
            }
        });


    }

    public void onClick(View view) {
        String url = "http://mismart.co.in";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}