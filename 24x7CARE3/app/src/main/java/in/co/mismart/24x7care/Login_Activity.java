package in.co.mismart.azim24x7care;

import android.content.Intent;
import android.support.annotation.NonNull;
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

import java.util.Objects;

public class Login_Activity extends AppCompatActivity {

    //Toolbar toolbar;
    //ProgressBar progressBar;
    EditText userEmail;
    EditText userPass;
    ImageButton userLogin;
    TextView forgotPass;


    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        //toolbar=findViewById(R.id.toolbar2);
        //progressBar=findViewById(R.id.progressBar);
        userEmail=findViewById(R.id.etUserEmail);
        userPass=findViewById(R.id.etUserPass);
        userLogin=findViewById(R.id.btnUserLogin);
        forgotPass=findViewById(R.id.btnForgotPassword);


        firebaseAuth= FirebaseAuth.getInstance();

        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //progressBar.setVisibility(View.VISIBLE);
                firebaseAuth.signInWithEmailAndPassword(userEmail.getText().toString(), userPass.getText().toString()).
                        addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                //progressBar.setVisibility(View.GONE);
                                if(task.isSuccessful()){
                                    if(Objects.requireNonNull(firebaseAuth.getCurrentUser()).isEmailVerified()){
                                        Intent i=new Intent(Login_Activity.this,Home_Activity.class);
                                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                        startActivity(i);
                                        //startActivity(new Intent(Login_Activity.this,Home_Activity.class));

                                    }else {
                                        Toast.makeText(Login_Activity.this, "Please verify your email address"
                                                , Toast.LENGTH_LONG).show();

                                          }
                                }
                                else{
                                    Toast.makeText(Login_Activity.this, Objects.requireNonNull(task.getException()).getMessage()
                                            , Toast.LENGTH_LONG).show();
                                }

                            }
                        });

            }
        });

        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_Activity.this,ForgotPassword_Activity.class));
            }
        });
    }
}
