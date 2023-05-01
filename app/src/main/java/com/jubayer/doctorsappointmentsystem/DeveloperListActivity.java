package com.jubayer.doctorsappointmentsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DeveloperListActivity extends AppCompatActivity {

    private TextView facebookTV, githubTV, linkedinTV, mailTV;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers_list);

        /*Set action bar Title */
        getSupportActionBar().setTitle("Developer List");


        /*init view*/
        facebookTV = findViewById(R.id.facebookTV);
        githubTV = findViewById(R.id.githubTV);
        linkedinTV = findViewById(R.id.linkedinTV);
        mailTV = findViewById(R.id.mailTV);

        //facebook zobayer
        facebookTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntent());
            }
        });

        githubTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Intent appIntent = new Intent(Intent.ACTION_VIEW);
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/jubayer282"));
                try {
                    startActivity(webIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });

        linkedinTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://you"));
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/jubayer-hossain-760b7623b/"));
                startActivity(intent);
            }
        });

        mailTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "zobayer.dev@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "your_subject");
                    intent.putExtra(Intent.EXTRA_TEXT, "your_text");
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(DeveloperListActivity.this, "Failed to due " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public Intent getOpenFacebookIntent() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/https://www.facebook.com/mdjubayer.hossain.98434?mibextid=ZbWKwL/"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/https://www.facebook.com/mdjubayer.hossain.98434?mibextid=ZbWKwL/"));
        }
    }

}