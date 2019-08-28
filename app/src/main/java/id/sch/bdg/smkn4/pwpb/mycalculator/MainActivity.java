package id.sch.bdg.smkn4.pwpb.mycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn0, btn1,btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnResult, btnDot ,
            btnMin, btnPlus, btnClear, btnDivider, btnMultiplier;
    private TextView tvResultSmall, tvResultLarge;
    String number = "";
    Double num1, num2, result;
    int choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnResult.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnMin.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnDivider.setOnClickListener(this);
        btnMultiplier.setOnClickListener(this);
    }

    private void initialize() {
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnResult = (Button) findViewById(R.id.btnResult);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnMin = (Button) findViewById(R.id.btnMin);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnDivider = (Button) findViewById(R.id.btnDivider);
        btnMultiplier = (Button) findViewById(R.id.btnMultiplier);
        tvResultLarge = (TextView) findViewById(R.id.tvResultLarge);
        tvResultSmall = (TextView) findViewById(R.id.tvResultSmall);
    }

    @Override
    public void onClick(View v) {
//        String codeOperation = tvResultLarge.getText().toString();
        switch (v.getId()) {
            case R.id.btn0:
                number += 0;
                tvResultLarge.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation).toString());
                break;
            case R.id.btn1:
                number += 1;
                tvResultLarge.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btn2:
                number += 2;
                tvResultLarge.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btn3:
                number += 3;
                tvResultLarge.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btn4:
                number += 4;
                tvResultLarge.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btn5:
                number += 5;
                tvResultLarge.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btn6:
                number += 6;
                tvResultLarge.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btn7:
                number += 7;
                tvResultLarge.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btn8:
                number += 8;
                tvResultLarge.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btn9:
                number += 9;
                tvResultLarge.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btnPlus:
                num1 =Double.parseDouble(number);
                tvResultLarge.setText(num1 + "+");
                number="";
                choice = 1;
                break;
            case R.id.btnMin:
                num1 =Double.parseDouble(number);
                tvResultLarge.setText(num1 + "-");
                number="";
                choice = 2;
                break;
            case R.id.btnDivider:
                num1 =Double.parseDouble(number);
                tvResultLarge.setText(num1 + "/");
                number="";
                choice = 4;
                break;
            case R.id.btnMultiplier:
                num1 =Double.parseDouble(number);
                tvResultLarge.setText(num1 + "*");
                number="";
                choice = 3;
                break;
            case R.id.btnDot:
                number += ".";
                tvResultLarge.setText(number);
//                tvResultSmall.setText(executeOperation(codeOperation));
                break;
            case R.id.btnClear:
                number = "";
                num1 = 0.0;
                num2 = 0.0;
                result = 0.0;
                tvResultLarge.setText(number);
                tvResultSmall.setText(number);
                break;
            case R.id.btnResult:
//                tvResultLarge.setText(executeOperation(codeOperation));
//                tvResultSmall.setText("");
                switch (choice) {
                    case 1:
                        num2 = Double.parseDouble(String.valueOf(tvResultLarge.getText()));
                        result = num1+num2;
                        tvResultSmall.setText(num1 + " + " + num2);
                        number = Double.toString(result);
                        break;
                    case 2:
                        num2 = Double.parseDouble(String.valueOf(tvResultLarge.getText()));
                        result = num1-num2;
                        tvResultSmall.setText(num1 + " - " + num2);
                        number = Double.toString(result);
                        break;
                    case 3:
                        num2 = Double.parseDouble(String.valueOf(tvResultLarge.getText()));
                        result = num1*num2;
                        tvResultSmall.setText(num1 + " x " + num2);
                        number = Double.toString(result);
                        break;
                    case 4:
                        num2 = Double.parseDouble(String.valueOf(tvResultLarge.getText()));
                        result = num1/num2;
                        tvResultSmall.setText(num1 + " / " + num2);
                        number = Double.toString(result);
                        break;
                }
                tvResultLarge.setText(number);
                break;
        }
    }

    private Double executeOperation(String code) {
        Double value;
        value = Double.parseDouble(code);
        return value;
    }
}
