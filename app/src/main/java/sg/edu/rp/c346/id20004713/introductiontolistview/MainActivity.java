package sg.edu.rp.c346.id20004713.introductiontolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    String[] fruits;

    ArrayList<String> fruits2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        tv = findViewById(R.id.tv);

        tv.setText("Fruits \n================= \n" + fruits[0] + "\n" + fruits[1] + "\n" + fruits[2]);

        fruits2 = new ArrayList<>();
        fruits2.add("Apple_l");
        fruits2.add("Banana_l");
        fruits2.add("Cherry_l");
        fruits2.add(fruits2.size(), "Durian");  //part 1 Qb

        String theFruit = fruits2.get(1);  //PArt1 Qc

        fruits2.remove(0);  //part 1 Qd

        fruits2.set(fruits2.size() - 1, "dragon fruit");  //part 1 Qe

        String list = "";
        for (int i = 0; i < fruits2.size() ; i++){
            list += fruits2.get(i) + "\n";
        }

        tv.setText(list);
    }
}