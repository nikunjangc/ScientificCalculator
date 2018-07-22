package nyc.c4q.homework06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import java.lang.Math;


public class MainActivity extends AppCompatActivity {


    public int inv_counter = 1;

    private TextView text_equation;
    private Switch simpleSwitch;
    private Button rad_degree_togle;
    private Button factorial;
    private Button open_parens;
    private Button closed_parens;
    private Button percent;
    private Button clear;
    private Button inverse;
    private Button sin;
    private Button sin_inverse;
    private Button ln;
    private Button ln_inverse;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button divide;
    private Button pi;
    private Button cos;
    private Button cos_inverse;
    private Button log;
    private Button log_inverse;
    private Button four;
    private Button five;
    private Button six;
    private Button multiply;
    private Button eulers_number;
    private Button tangent;
    private Button tangent_inverse;
    private Button square;
    private Button square_root;
    private Button one;
    private Button two;
    private Button three;
    private Button subtract;
    private Button answer;
    private Button random_number;
    private Button exponent;
    private Button x_square_y;
    private Button x_root_y;
    private Button zero;
    private Button decimal;
    private Button equals;
    private Button add;
    boolean evaluated= false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Switch simpleSwitch = (Switch) findViewById(R.id.simpleSwitch);
        text_equation = (TextView) findViewById(R.id.text_equation);
        rad_degree_togle = (ToggleButton) findViewById(R.id.rad_degree_togle);
        factorial = (Button) findViewById(R.id.factorial);
        open_parens = (Button) findViewById(R.id.open_parens);
        closed_parens = (Button) findViewById(R.id.closed_parens);
        percent = (Button) findViewById(R.id.percent);
        clear = (Button) findViewById(R.id.clear);
        inverse = (Button) findViewById(R.id.inverse);
        sin = (Button) findViewById(R.id.sin);
        sin_inverse = (Button) findViewById(R.id.sin_inverse);
        ln = (Button) findViewById(R.id.ln);
        ln_inverse = (Button) findViewById(R.id.ln_inverse);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        divide = (Button) findViewById(R.id.divide);
        pi = (Button) findViewById(R.id.pi);
        cos = (Button) findViewById(R.id.cos);
        cos_inverse = (Button) findViewById(R.id.cos_inverse);
        log = (Button) findViewById(R.id.log);
        log_inverse = (Button) findViewById(R.id.log_inverse);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        multiply = (Button) findViewById(R.id.multiply);
        eulers_number = (Button) findViewById(R.id.eulers_number);
        tangent = (Button) findViewById(R.id.tangent);
        tangent_inverse = (Button) findViewById(R.id.tangent_inverse);
        square_root = (Button) findViewById(R.id.square_root);
        square = (Button) findViewById(R.id.square);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        subtract = (Button) findViewById(R.id.subtract);
        answer = (Button) findViewById(R.id.answer);
        random_number = (Button) findViewById(R.id.random_number);
        exponent = (Button) findViewById(R.id.exponent);
        x_root_y = (Button) findViewById(R.id.x_root_y);
        x_square_y = (Button) findViewById(R.id.x_square_y);
        zero = (Button) findViewById(R.id.zero);
        decimal = (Button) findViewById(R.id.decimal);
        equals = (Button) findViewById(R.id.equals);
        add = (Button) findViewById(R.id.add);
        //TODO: saved instance state for switching screen orientation layouts.
        Boolean switchState = simpleSwitch.isChecked();
    }

    public void calculateEquation(View v) {

        //TODO: create and use resource values for button tags and text
        //TODO: create resource values for xml styles.
        //TODO: design the UI styles
        // TODO: radians vs degrees toggle button.


        CalculatorEvaluation calc = new CalculatorEvaluation();
        String thisEquation = text_equation.getText().toString();
        String expression;
        if (v.getTag().toString().equals("inv")) {
            inv_counter = inv_counter + 1;
            if (inv_counter % 2 == 0) {
                sin_inverse.setVisibility(View.VISIBLE);
                sin.setVisibility(View.GONE);
                ln_inverse.setVisibility(View.VISIBLE);
                ln.setVisibility(View.GONE);
                cos_inverse.setVisibility(View.VISIBLE);
                cos.setVisibility(View.GONE);
                log_inverse.setVisibility(View.VISIBLE);
                log.setVisibility(View.GONE);
                tangent_inverse.setVisibility(View.VISIBLE);
                tangent.setVisibility(View.GONE);
                square.setVisibility(View.VISIBLE);
                square_root.setVisibility(View.GONE);
                random_number.setVisibility(View.VISIBLE);
                answer.setVisibility(View.GONE);
                x_root_y.setVisibility(View.VISIBLE);
                x_square_y.setVisibility(View.GONE);

            } else if (inv_counter % 2 != 0) {

                sin_inverse.setVisibility(View.GONE);
                sin.setVisibility(View.VISIBLE);
                ln_inverse.setVisibility(View.GONE);
                ln.setVisibility(View.VISIBLE);
                cos_inverse.setVisibility(View.GONE);
                cos.setVisibility(View.VISIBLE);
                log_inverse.setVisibility(View.GONE);
                log.setVisibility(View.VISIBLE);
                tangent_inverse.setVisibility(View.GONE);
                tangent.setVisibility(View.VISIBLE);
                square.setVisibility(View.GONE);
                square_root.setVisibility(View.VISIBLE);
                random_number.setVisibility(View.GONE);
                answer.setVisibility(View.VISIBLE);
                x_root_y.setVisibility(View.GONE);
                x_square_y.setVisibility(View.VISIBLE);

            }
        }
        if (v.getTag().toString().equals("=")) {
            calc.setEquation(text_equation.getText().toString());
            expression = calc.getEquation();
           calc.evaluateEquation(expression, text_equation);
            evaluated = true;
        } else if (evaluated){
            text_equation.setText(v.getTag().toString());
            evaluated= false;
        } else if (v.getTag().toString().equals("delete")) {
            text_equation.setText(thisEquation.substring(thisEquation.length()));

        } else if (!v.getTag().toString().equals("inv") && !v.getTag().toString().equals("delete")) {
            thisEquation = thisEquation.concat(v.getTag().toString());
            text_equation.setText(thisEquation);
        }


//        if (v.getTag().toString().equals("=")) {
//            calc.setEquation(equation.getText().toString());
//            expression = calc.getEquation();
//            calc.evaluateEquation(expression, equation);
//        } else if (v.getTag().toString().equals("delete")) {
//            if (thisEquation.length() != 0) {
//                equation.setText(thisEquation.substring(thisEquation.length()));
//            }
//            else if (!v.getTag().toString().equals("inv") && !v.getTag().toString().equals("delete")) {
//                thisEquation = thisEquation.concat(v.getTag().toString());
//                equation.setText(thisEquation);
//            }
//        }
    }
}

