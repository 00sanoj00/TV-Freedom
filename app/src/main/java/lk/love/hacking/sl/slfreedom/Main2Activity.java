package lk.love.hacking.sl.slfreedom;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.shadowfax.proswipebutton.ProSwipeButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        final ProSwipeButton proSwipeBtn1 = (ProSwipeButton) findViewById(R.id.awesome_btn1);
        proSwipeBtn1.setOnSwipeListener(new ProSwipeButton.OnSwipeListener() {
            @Override
            public void onSwipeConfirm() {
                // user has swiped the btn. Perform your async operation now
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // task success! show TICK icon in ProSwipeButton
                        Intent mainIntent = new Intent(Main2Activity.this, CHanelView.class);
                        Main2Activity.this.startActivity(mainIntent);
                        //Main2Activity.this.finish();


                    }
                }, 50);
            }
        });

        ProSwipeButton proSwipeBtn2 = (ProSwipeButton) findViewById(R.id.awesome_btn2);
        proSwipeBtn2.setOnSwipeListener(new ProSwipeButton.OnSwipeListener() {
            @Override
            public void onSwipeConfirm() {
                // user has swiped the btn. Perform your async operation now
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // task success! show TICK icon in ProSwipeButton

                    }
                }, 50);
            }
        });



        ProSwipeButton proSwipeBtn3 = (ProSwipeButton) findViewById(R.id.awesome_btn3);
        proSwipeBtn3.setOnSwipeListener(new ProSwipeButton.OnSwipeListener() {
            @Override
            public void onSwipeConfirm() {
                // user has swiped the btn. Perform your async operation now
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // task success! show TICK icon in ProSwipeButton

                    }
                }, 50);
            }
        });


    }
}
