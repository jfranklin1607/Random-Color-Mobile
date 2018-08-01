package com.joshuafranklinjava.trymeoriginal.trymeoriginal;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

  private View windowView;
  private Button tryMeButton;
  private int[]colors;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    colors = new int[]{Color.CYAN, Color.GREEN, Color.RED, Color.BLUE, Color.BLACK, Color.DKGRAY,
                    Color.LTGRAY, Color.YELLOW, Color.MAGENTA};

    windowView = findViewById(R.id.windowViewid);



    tryMeButton = (Button)findViewById(R.id.tryMeButton);
    tryMeButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        int colorArrayLength = colors.length;
        Random random = new Random();
        int randomNum = random.nextInt( colorArrayLength);

        windowView.setBackgroundColor(colors[randomNum]);

        Log.d("Random", String.valueOf(randomNum));
      }
    });
  }
}
