package be.kuleuven.gt.TutorialZYW;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btnPlus;
    private Button btnMinus;
    private TextView lblQty;
    private int quantity;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        lblQty = (TextView) findViewById(R.id.lblQty);
        quantity = Integer.parseInt(lblQty.getText().toString());
    }
    public void onBtnPlus_Clicked(View Caller) {
        quantity = quantity + 1;
        lblQty.setText(Integer.toString(quantity)); }

    public void onBtnMinus_Clicked(View Caller) {

        if(Integer.parseInt(lblQty.getText().toString())>0){
            quantity -= 1;}

        lblQty.setText(Integer.toString(quantity)); }
}