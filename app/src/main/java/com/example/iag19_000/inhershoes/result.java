package com.example.iag19_000.inhershoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class result extends AppCompatActivity {

    TextView resultTextView;
    MyApp application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        application = (MyApp) this.getApplication();
        resultTextView = findViewById(R.id.result);

        //check if dropping out
        if ((application.droppingNow) && (application.currentStatus == "bad")) {
            resultTextView.setText(MyApp.dropoutResBad);
            return;
        } else if ((application.dontWannaDrop)) {
            resultTextView.setText(MyApp.dropoutResGood);
            application.dontWannaDrop = false;
            return;
        }

        //field choice result
        if (application.sitCount == 0) {
            switch (application.field) {
                case "A":
                    resultTextView.setText(MyApp.medChoice);
                    break;
                case "B":
                    resultTextView.setText(MyApp.techChoice);
                    break;
                case "C":
                    resultTextView.setText(MyApp.edChoice);
                    break;
                case "D":
                    resultTextView.setText(MyApp.entChoice);
                    break;
                default:
                    resultTextView.setText("Oopsie daisy...");
                    break;
            }
        }

        //stage 1 result
        if (application.sitCount == 1) {
            switch (application.field) {
                case "A":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.med1bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.med1good);
                    }
                    break;
                case "B":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.tech1bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.tech1good);
                    }
                    break;
                case "C":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.ed1bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.ed1good);
                    }
                    break;
                case "D":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.ent1bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.ent1good);
                    }
                    break;
                default:
                    resultTextView.setText("Oopsie daisy...");
                    break;
            }
        }

        //stage 2 result
        if (application.sitCount == 2) {
            switch (application.field) {
                case "A":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.med2bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.med2good);
                    }
                    break;
                case "B":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.tech2bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.tech2good);
                    }
                    break;
                case "C":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.ed2bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.ed2good);
                    }
                    break;
                case "D":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.ent2bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.ent2good);
                    }
                    break;
                default:
                    resultTextView.setText("Oopsie daisy...");
                    break;
            }
        }

        //stage 3 results
        if (application.sitCount == 3) {
            switch (application.field) {
                case "A":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.med3bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.med3good);
                    }
                    break;
                case "B":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.tech3bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.tech3good);
                    }
                    break;
                case "C":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.ed3bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.ed3good);
                    }
                    break;
                case "D":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.ent3bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.ent3good);
                    }
                    break;
                default:
                    resultTextView.setText("Oopsie daisy...");
                    break;
            }
        }

        //stage 4 results
        if (application.sitCount == 4) {
            switch (application.field) {
                case "A":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.med4bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.med4good);
                    }
                    break;
                case "B":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.tech4bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.tech4good);
                    }
                    break;
                case "C":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.ed4bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.ed4good);
                    }
                    break;
                case "D":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.ent4bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.ent4good);
                    }
                    break;
                default:
                    resultTextView.setText("Oopsie daisy...");
                    break;
            }
        }

        //stage 5 results
        if (application.sitCount == 5) {
            switch (application.field) {
                case "A":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.med5bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.med5good);
                    }
                    break;
                case "B":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.tech5bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.tech5good);
                    }
                    break;
                case "C":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.ed5bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.ed5good);
                    }
                    break;
                case "D":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.ent5bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.ent5good);
                    }
                    break;
                default:
                    resultTextView.setText("Oopsie daisy...");
                    break;
            }
        }

        //stage 6 results
        if (application.sitCount == 6) {
            switch (application.field) {
                case "A":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.med6bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.med6good);
                    }
                    break;
                case "B":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.tech6bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.tech6good);
                    }
                    break;
                case "C":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.ed6bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.ed6good);
                    }
                    break;
                case "D":
                    if (application.currentStatus == "bad") {
                        resultTextView.setText(MyApp.ent6bad);
                    } else if (application.currentStatus == "good") {
                        resultTextView.setText(MyApp.ent6good);
                    }
                    break;
                default:
                    resultTextView.setText("Oopsie daisy...");
                    break;
            }
        }

        if (application.sitCount == 6) {
            application.sitCount++;
        }else if (application.sitCount == 8) {
            //check if game is over
            resultTextView.setText("Thank you for playing 'In Her Shoes'! We hope you enjoyed playing as much as we enjoyed making it :) Wanna play again?");
        }
    }

    public void okPressed(View view) {



        if ((application.droppingNow) && (application.currentStatus == "bad")) {
            Intent intent = new Intent(this, chooseField.class);
            startActivity(intent);
        } else if(application.sitCount == 7){
            //say thank you
            application.sitCount++;
            Intent intent = new Intent(this, result.class);
            startActivity(intent);
        }else if (application.sitCount == 8) {
            //restart
            Intent intent = new Intent(this, chooseField.class);
            startActivity(intent);
        } else {

            //check if about to drop out
            if (application.dropCount == 2) {
                application.droppingNow = true;
            }

            Intent intent = new Intent(this, situation.class);
            startActivity(intent);
        }


    }
}
