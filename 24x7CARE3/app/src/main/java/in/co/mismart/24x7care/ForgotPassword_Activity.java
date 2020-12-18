package in.co.mismart.azim24x7care;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword_Activity extends AppCompatActivity {

    Toolbar toolbar;
    ProgressBar progressBar;
    EditText userEmail;
    Button userPass;

    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_);

        toolbar = findViewById(R.id.toolbar3);
        progressBar=findViewById(R.id.progressBar);
        userEmail=findViewById(R.id.etUserEmail);
        userPass=findViewById(R.id.btnUserForgottPass);

        toolbar.setTitle("Forgot Password");

        firebaseAuth = FirebaseAuth.getInstance();
        userPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                firebaseAuth.sendPasswordResetEmail(userEmail.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                progressBar.setVisibility(View.GONE);
                                if(task.isSuccessful()){
                                    Toast.makeText(ForgotPassword_Activity.this,
                                            "Password sent to your email", Toast.LENGTH_LONG).show();
                                }else{
                                    Toast.makeText(ForgotPassword_Activity.this,
                                            task.getException().getMessage(), Toast.LENGTH_LONG).show();
                                }
                            }
                        });
            }
        });
    }
}
