package com.example.iag19_000.inhershoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class situation extends AppCompatActivity {

    TextView sitTextView;
    MyApp application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation);

        application = (MyApp) this.getApplication();
        sitTextView = findViewById(R.id.myText);

        application.sitCount++;

        if (application.droppingNow) {
            sitTextView.setText(MyApp.dropoutSit);
            return;
        }

        if (application.sitCount == 1) {
            switch (application.field) {
                case "A":
                    sitTextView.setText(MyApp.med1);
                    break;
                case "B":
                    sitTextView.setText(MyApp.tech1);
                    break;
                case "C":
                    sitTextView.setText(MyApp.ed1);
                    break;
                case "D":
                    sitTextView.setText(MyApp.ent1);
                    break;
                default:
                    sitTextView.setText("Oopsie daisy...");
                    break;
            }
        }

        if (application.sitCount == 2) {
            switch (application.field) {
                case "A":
                    sitTextView.setText(MyApp.med2);
                    break;
                case "B":
                    sitTextView.setText(MyApp.tech2);
                    break;
                case "C":
                    sitTextView.setText(MyApp.ed2);
                    break;
                case "D":
                    sitTextView.setText(MyApp.ent2);
                    break;
                default:
                    sitTextView.setText("Oopsie daisy...");
                    break;
            }
        }

        if (application.sitCount == 3) {
            switch (application.field) {
                case "A":
                    sitTextView.setText(MyApp.med3);
                    break;
                case "B":
                    sitTextView.setText(MyApp.tech3);
                    break;
                case "C":
                    sitTextView.setText(MyApp.ed3);
                    break;
                case "D":
                    sitTextView.setText(MyApp.ent3);
                    break;
                default:
                    sitTextView.setText("Oopsie daisy...");
                    break;
            }
        }

        if (application.sitCount == 4) {
            switch (application.field) {
                case "A":
                    sitTextView.setText(MyApp.med4);
                    break;
                case "B":
                    sitTextView.setText(MyApp.tech4);
                    break;
                case "C":
                    sitTextView.setText(MyApp.ed4);
                    break;
                case "D":
                    sitTextView.setText(MyApp.ent4);
                    break;
                default:
                    sitTextView.setText("Oopsie daisy...");
                    break;
            }
        }

        if (application.sitCount == 5) {
            switch (application.field) {
                case "A":
                    sitTextView.setText(MyApp.med5);
                    break;
                case "B":
                    sitTextView.setText(MyApp.tech5);
                    break;
                case "C":
                    sitTextView.setText(MyApp.ed5);
                    break;
                case "D":
                    sitTextView.setText(MyApp.ent5);
                    break;
                default:
                    sitTextView.setText("Oopsie daisy...");
                    break;
            }
        }

        if (application.sitCount == 6) {
            switch (application.field) {
                case "A":
                    sitTextView.setText(MyApp.med6);
                    break;
                case "B":
                    sitTextView.setText(MyApp.tech6);
                    break;
                case "C":
                    sitTextView.setText(MyApp.ed6);
                    break;
                case "D":
                    sitTextView.setText(MyApp.ent6);
                    break;
                default:
                    sitTextView.setText("Oopsie daisy...");
                    break;
            }
        }

    }

    public void aPressed(View view) {

        //dropping out
        if (application.droppingNow) {
            //right, continue game
            application.currentStatus = "good";
            application.dropCount = 0;
            application.droppingNow = false;
            application.sitCount--;
            application.dontWannaDrop = true;
        } else {

            if (application.sitCount == 1) {
                switch (application.field) {
                    case "A":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "B":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "C":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "D":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    default:
                        sitTextView.setText("Oopsie daisy...");
                        break;
                }
            }

            if (application.sitCount == 2) {
                switch (application.field) {
                    case "A":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "B":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "C":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "D":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    default:
                        sitTextView.setText("Oopsie daisy...");
                        break;
                }
            }

            if (application.sitCount == 3) {
                switch (application.field) {
                    case "A":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "B":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "C":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "D":
                        //right
                        application.currentStatus = "good";
                        break;
                    default:
                        sitTextView.setText("Oopsie daisy...");
                        break;
                }
            }

            if (application.sitCount == 4) {
                switch (application.field) {
                    case "A":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "B":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "C":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "D":
                        //right
                        application.currentStatus = "good";
                        break;
                    default:
                        sitTextView.setText("Oopsie daisy...");
                        break;
                }
            }

            if (application.sitCount == 5) {
                switch (application.field) {
                    case "A":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "B":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "C":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "D":
                        //right
                        application.currentStatus = "good";
                        break;
                    default:
                        sitTextView.setText("Oopsie daisy...");
                        break;
                }
            }

            if (application.sitCount == 6) {
                switch (application.field) {
                    case "A":
                        //wrong
                        //application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "B":
                        //wrong
                        //application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "C":
                        //wrong
                        //application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "D":
                        //wrong
                        //application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    default:
                        sitTextView.setText("Oopsie daisy...");
                        break;
                }
            }
//            if (application.dropCount == 2) {
//                application.droppingNow = true;
//            }
        }


        Intent intent = new Intent(this, result.class);
        startActivity(intent);
    }

    public void bPressed(View view) {
        //dropping out
        if (application.droppingNow) {
            //wrong, finish game
            application.currentStatus = "bad";
        } else {

            if (application.sitCount == 1) {
                switch (application.field) {
                    case "A":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "B":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "C":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "D":
                        //right
                        application.currentStatus = "good";
                        break;
                    default:
                        sitTextView.setText("Oopsie daisy...");
                        break;
                }
            }

            if (application.sitCount == 2) {
                switch (application.field) {
                    case "A":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "B":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "C":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "D":
                        //right
                        application.currentStatus = "good";
                        break;
                    default:
                        sitTextView.setText("Oopsie daisy...");
                        break;
                }
            }

            if (application.sitCount == 3) {
                switch (application.field) {
                    case "A":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "B":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "C":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "D":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    default:
                        sitTextView.setText("Oopsie daisy...");
                        break;
                }
            }

            if (application.sitCount == 4) {
                switch (application.field) {
                    case "A":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "B":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "C":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "D":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    default:
                        sitTextView.setText("Oopsie daisy...");
                        break;
                }
            }

            if (application.sitCount == 5) {
                switch (application.field) {
                    case "A":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "B":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    case "C":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "D":
                        //wrong
                        application.dropCount++;
                        application.currentStatus = "bad";
                        break;
                    default:
                        sitTextView.setText("Oopsie daisy...");
                        break;
                }
            }

            if (application.sitCount == 6) {
                switch (application.field) {
                    case "A":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "B":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "C":
                        //right
                        application.currentStatus = "good";
                        break;
                    case "D":
                        //right
                        application.currentStatus = "good";
                        break;
                    default:
                        sitTextView.setText("Oopsie daisy...");
                        break;
                }
            }
            /*if (application.dropCount == 2) {
                application.droppingNow = true;
            }*/
        }

        Intent intent = new Intent(this, result.class);
        startActivity(intent);
    }
}
