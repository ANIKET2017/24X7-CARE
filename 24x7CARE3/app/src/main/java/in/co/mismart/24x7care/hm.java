package in.co.mismart.azim24x7care;

import android.app.Application;
import android.content.Intent;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class hm extends Application {
    public void onCreate() {
        super.onCreate();

        FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
        FirebaseUser firebaseUser=firebaseAuth.getCurrentUser();

        if(firebaseUser != null && firebaseUser.isEmailVerified()){
            startActivity(new Intent(hm.this,Home_Activity.class));
        }
    }
}
