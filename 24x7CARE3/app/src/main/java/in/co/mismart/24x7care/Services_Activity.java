package in.co.mismart.azim24x7care;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Services_Activity extends AppCompatActivity {

    Toolbar toolbar4;
    Button next5;

    Button five,eight,twelve,twenty,forty,night,sunday,toddler,infant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_);

        toolbar4=findViewById(R.id.tbServices);
        next5=findViewById(R.id.bnext5);

        five = findViewById(R.id.five);
        eight = findViewById(R.id.eight);
        twelve = findViewById(R.id.twelve);
        twenty = findViewById(R.id.twenty);
        forty = findViewById(R.id.forty);
        night = findViewById(R.id.night);
        sunday = findViewById(R.id.sunday);
        toddler = findViewById(R.id.toddler);
        infant = findViewById(R.id.infant);

        toolbar4.setTitle(R.string.plans);

        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Services_Activity.this,Logout_Activity.class));
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(Services_Activity.this);
                mbuilder.setTitle("5 hours");
                mbuilder.setMessage("service");
                mbuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = mbuilder.create();
                alertDialog.show();

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(Services_Activity.this);
                mbuilder.setTitle("8 hours");
                mbuilder.setMessage("service");
                mbuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = mbuilder.create();
                alertDialog.show();

            }
        });

        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(Services_Activity.this);
                mbuilder.setTitle("12 hours");
                mbuilder.setMessage("service");
                mbuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = mbuilder.create();
                alertDialog.show();

            }
        });

        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(Services_Activity.this);
                mbuilder.setTitle("20 hours");
                mbuilder.setMessage("service");
                mbuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = mbuilder.create();
                alertDialog.show();

            }
        });

        forty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(Services_Activity.this);
                mbuilder.setTitle("40 hours");
                mbuilder.setMessage("service");
                mbuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = mbuilder.create();
                alertDialog.show();

            }
        });

        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(Services_Activity.this);
                mbuilder.setTitle("Night Care");
                mbuilder.setMessage("service");
                mbuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = mbuilder.create();
                alertDialog.show();

            }
        });

        sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(Services_Activity.this);
                mbuilder.setTitle("Sunday");
                mbuilder.setMessage("service");
                mbuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = mbuilder.create();
                alertDialog.show();

            }
        });

        toddler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(Services_Activity.this);
                mbuilder.setTitle("Toddler");
                mbuilder.setMessage("service");
                mbuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = mbuilder.create();
                alertDialog.show();

            }
        });

        infant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(Services_Activity.this);
                mbuilder.setTitle("Infant Package");
                mbuilder.setMessage("service");
                mbuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = mbuilder.create();
                alertDialog.show();

            }
        });
    }
}
