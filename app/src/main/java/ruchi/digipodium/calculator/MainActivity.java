package ruchi.digipodium.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText p, r, t;
        TextView interest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p=(EditText)findViewById(R.id.p);
        t=(EditText)findViewById(R.id.t);
        r=(EditText)findViewById(R.id.r);
        interest=(TextView)findViewById(R.id.interest);
    }
    public void siCalc(View view)
    {
        double fp,fr,ft, si;
        fp=Double.parseDouble(p.getText().toString());
        fr=Double.parseDouble(r.getText().toString());
        ft=Double.parseDouble(t.getText().toString());
        si=(fp*fr*ft/100);
        interest.setText("Interest Amount="+si);
    }
    public void ciCalc(View view)
    {
        double fp,fr,ft, ci;
        fp=Double.parseDouble(p.getText().toString());
        fr=Double.parseDouble(r.getText().toString());
        ft=Double.parseDouble(t.getText().toString());
        ci=fp*Math.pow((1+fr/100),ft)-fp;
        interest.setText("Interest Amount="+ci);
    }

}
