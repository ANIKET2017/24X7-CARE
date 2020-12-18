package in.co.mismart.azim24x7care;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Home_Activity extends AppCompatActivity {
    Toolbar toolbar1;
    Toolbar toolbar;
    Button bnext;

    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        toolbar1=findViewById(R.id.tbHome);
        toolbar=findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        bnext=findViewById(R.id.bnext1);

        toolbar1.setTitle(R.string.home);

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_Activity.this,ProfileActivity.class));
            }
        });

        firebaseAuth= FirebaseAuth.getInstance();
        firebaseUser= firebaseAuth.getCurrentUser();




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();

        if ( id== R.id.home){
            startActivity(new Intent(Home_Activity.this,Home_Activity.class));
        }

        if ( id== R.id.profile){
            startActivity(new Intent(Home_Activity.this,ProfileActivity.class));
        }

        if ( id== R.id.data){
            startActivity(new Intent(Home_Activity.this,Data_Activity.class));
        }

        if ( id== R.id.video){
            startActivity(new Intent(Home_Activity.this,Video_Activity.class));
        }

        if ( id== R.id.plans){
            startActivity(new Intent(Home_Activity.this,Services_Activity.class));
        }

        if ( id== R.id.logout){
            startActivity(new Intent(Home_Activity.this,Logout_Activity.class));
        }
        return false;
    }
}

