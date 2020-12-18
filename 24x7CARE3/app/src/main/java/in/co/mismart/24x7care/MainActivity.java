package in.co.mismart.azim24x7care;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {


    //Toolbar toolbar;
    //ProgressBar progressBar;
    EditText email;
    EditText password;
    ImageButton signup;
    ImageButton login;
    TextView tnc;
    DataBaseHelper helper = new DataBaseHelper(this);
    boolean ans;

    EditText fname,lname,phno,cnfpass;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toolbar =findViewById(R.id.);
       // progressBar=findViewById(R.id.progressBar);
        email=findViewById(R.id.etEmail);
        password=findViewById(R.id.etPassword);
        signup=findViewById(R.id.btSignup);
        login=findViewById(R.id.btLogin);
        tnc=findViewById(R.id.terms_and_condition);
        cnfpass=findViewById(R.id.etConfirm_password);
        fname=findViewById(R.id.etName);
        lname=findViewById(R.id.etSur_name);
        phno=findViewById(R.id.etPhone_number);

        String t1=fname.getText().toString();
        String t2=lname.getText().toString();
        String t3=phno.getText().toString();
        String t4=email.getText().toString();
        String t5=password.getText().toString();

        ans = helper.insertData(t1, t2, t3, t4 , t5);

        tnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder= new AlertDialog.Builder(MainActivity.this);
                mBuilder.setTitle("Terms & Conditions");
                mBuilder.setMessage("hey");
                mBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                AlertDialog alertDialog= mBuilder.create();
                alertDialog.show();
            }
        });

        firebaseAuth=FirebaseAuth.getInstance();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //progressBar.setVisibility(View.VISIBLE);
                    firebaseAuth.createUserWithEmailAndPassword(email.getText().toString(),
                            password.getText().toString())
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    //progressBar.setVisibility(View.GONE);

                                    if (task.isSuccessful()) {
                                        firebaseAuth.getCurrentUser().sendEmailVerification()
                                                .addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {

                                                        if (task.isSuccessful()) {
                                                            Toast.makeText(MainActivity.this, "Registered Successfully. Please check your email for verification",
                                                                    Toast.LENGTH_LONG).show();
                                                            email.setText("");
                                                            password.setText("");

                                                            Toast.makeText(getApplicationContext(),"Main data inserted"+ans,Toast.LENGTH_SHORT).show();
                                                        } else {
                                                            Toast.makeText(MainActivity.this, task.getException().getMessage(),
                                                                    Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                });
                                    } else {
                                        Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                                    }
                                }
                            });
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Login_Activity.class));
            }
        });
    }

}
