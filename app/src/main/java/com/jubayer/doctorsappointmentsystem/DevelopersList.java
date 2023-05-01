package com.jubayer.doctorsappointmentsystem;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class DevelopersList extends AppCompatActivity {
    private LinearLayout facebook, github, linkedin, gmail;
    private ImageView tanim_facebook, tanim_github, tanim_linkedin, tanim_gmail ;
    private LinearLayout purnima_facebook, purnima_github, purnima_linkedin, purnima_gmail ;
    private ImageView proma_facebook, proma_github, proma_linkedin, proma_gmail ;
    private ImageView sojib_facebook, sojib_github, sojib_linkedin, sojib_gmail ;

    public DevelopersList() {
        // Required empty public constructor
    }
    @SuppressLint("MissingInflatedId")
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_developers_list, container, false);

        facebook = view.findViewById(R.id.facebook);
        github = view.findViewById(R.id.github);
        linkedin = view.findViewById(R.id.linkedin);
        gmail = view.findViewById(R.id.gmail);

        //Torikul Islam Tanim
        tanim_facebook = view.findViewById(R.id.tanim_facebook);
        tanim_github = view.findViewById(R.id.tanim_github);
        tanim_linkedin = view.findViewById(R.id.tanim_linkedin);
        tanim_gmail = view.findViewById(R.id.tanim_gmail);

        //Suraiya Rahman Purnima
        purnima_facebook = view.findViewById(R.id.purnima_facebook);
        purnima_github = view.findViewById(R.id.purnima_github);
        purnima_gmail = view.findViewById(R.id.purnima_gmail);
        purnima_linkedin = view.findViewById(R.id.purnima_linkedin);

        //Sharmila Rahman Proma
        proma_facebook = view.findViewById(R.id.proma_facebook);
        proma_github = view.findViewById(R.id.proma_github);
        proma_gmail = view.findViewById(R.id.proma_gmail);
       proma_linkedin = view.findViewById(R.id.proma_linkedin);


        //facebook Jubayer
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntent());
            }
        });

        github.setOnClickListener(new View.OnClickListener() {
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

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://you"));
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/jubayer-hossain-760b7623b/"));
                startActivity(intent);
            }
        });

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "jubayer.trodev@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "your_subject");
                    intent.putExtra(Intent.EXTRA_TEXT, "your_text");
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(DevelopersList.this, "Failed to due " + e.getMessage(), Toast.LENGTH_SHORT).show();

                }
            }
        });


        tanim_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntenttanim());
            }
        });

        tanim_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Intent appIntent = new Intent(Intent.ACTION_VIEW);
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/taneemahmed786"));
                try {
                    startActivity(webIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });

        tanim_linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://you"));
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/torikul-islam-tanim-9217a2274/"));
                startActivity(intent);
            }
        });

        tanim_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "tanimtt210@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "your_subject");
                    intent.putExtra(Intent.EXTRA_TEXT, "your_text");
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(DevelopersList.this, "Failed to due " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Suraiya Aktery Purnima

       purnima_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntentpurnima());
            }
        });

        purnima_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Intent appIntent = new Intent(Intent.ACTION_VIEW);
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/Suraiyapurnima"));
                try {
                    startActivity(webIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });

        purnima_linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://you"));
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/rubayet-islam-ifti-63073319a/"));
                startActivity(intent);
            }
        });

        purnima_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "suraiyapurnima@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "your_subject");
                    intent.putExtra(Intent.EXTRA_TEXT, "your_text");
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(DevelopersList.this, "Failed to due " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

       //Sharmila Rahman Proma

        proma_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntentproma());
            }
        });

        proma_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Intent appIntent = new Intent(Intent.ACTION_VIEW);
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/sharmilaproma56"));
                try {
                    startActivity(webIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });

        proma_linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://you"));
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/piasmiah/"));
                startActivity(intent);
            }
        });

        proma_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "sharmilaproma41@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "your_subject");
                    intent.putExtra(Intent.EXTRA_TEXT, "your_text");
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(DevelopersList.this, "Failed to due " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        //sharriar Kabir Sojib

        sojib_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntentsojib());
            }
        });

        sojib_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Intent appIntent = new Intent(Intent.ACTION_VIEW);
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("shahriarkabir202@gmail.com"));
                try {
                    startActivity(webIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });

        sojib_linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://you"));
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/shahriar-kabir-56a187207/"));
                startActivity(intent);
            }
        });

        sojib_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "sharmilaproma41@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "your_subject");
                    intent.putExtra(Intent.EXTRA_TEXT, "your_text");
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(DevelopersList.this, "Failed to due " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }



    /*here Jubayer Hossain activity*/
    public PackageManager getPackageManager() {

        return null;
    }
    public Intent getOpenFacebookIntent() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/https://www.facebook.com/mdjubayer.hossain.98434?mibextid=ZbWKwL/"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mdjubayer.hossain.98434?mibextid=ZbWKwL/"));
        }
    }

    // Torikul Islam Tanim
    private Intent getOpenFacebookIntenttanim() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/https://www.facebook.com/ifratahmed.tamim?mibextid=ZbWKwL/"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ifratahmed.tamim?mibextid=ZbWKwL/"));
        }
    }

    // Suraiya Aktery Purnima
    private Intent getOpenFacebookIntentpurnima() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/https:https://www.facebook.com/profile.php?id=100080431145249&mibextid=Zb\n" +
                    "WKwL/"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https:https://www.facebook.com/profile.php?id=100080431145249&mibextid=Zb\n" +
                    "WKwL/"));
        }
    }

    //Sharmila Rahman Proma
    private Intent getOpenFacebookIntentproma() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/https://www.facebook.com/sharmila.proma.1?mibextid=ZbWKwL/"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sharmila.proma.1?mibextid=ZbWKwL/"));
        }
    }

    //Sharmila Rahman Proma
    private Intent getOpenFacebookIntentsojib() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/https://www.facebook.com/shahriar.kabirsojib?mibextid=ZbWKwL/"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/shahriar.kabirsojib?mibextid=ZbWKwL/"));
        }
    }


}
