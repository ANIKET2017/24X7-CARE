package in.co.mismart.azim24x7care;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    Toolbar toolbar2;
    Button next3;
    Button edit;
    Toolbar et;

    ImageView showImageUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        toolbar2=findViewById(R.id.toolbar2);
        et=findViewById(R.id.etoolbar);
        next3=findViewById(R.id.bnext2);
        edit=findViewById(R.id.edit_profile);
        showImageUpload=findViewById(R.id.show_image_upload);



        toolbar2.setTitle(R.string.profile);

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this,Video_Activity.class));
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this,EditProfile.class));
            }
        });

        Intent intent = getIntent();
        String text = intent.getStringExtra(EditProfile.EXTRA_TEXT);
        int number = intent.getIntExtra(EditProfile.EXTRA_NUMER, 0);
        int number1 = intent.getIntExtra(EditProfile.EXTRA_NUMER, 0);

        TextView textView1 =(TextView)findViewById(R.id.show_toddler_name);
        TextView textView2 =(TextView)findViewById(R.id.show_toddler_age);
        TextView textView3 =(TextView)findViewById(R.id.show_toddler_batch_no);

        textView1.setText(text);
        textView2.setText("" + number);
        textView3.setText("" + number1);


        //setSupportActionBar(et);


    }
}
