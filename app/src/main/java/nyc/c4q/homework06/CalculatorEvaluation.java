package nyc.c4q.homework06;

import android.widget.TextView;

import com.fathzer.soft.javaluator.Constant;
import com.fathzer.soft.javaluator.DoubleEvaluator;
import com.fathzer.soft.javaluator.Function;
import com.fathzer.soft.javaluator.Operator;
import com.fathzer.soft.javaluator.Parameters;


/**
 * Created by amirahoxendine on 10/24/17.
 */

public class CalculatorEvaluation extends Factorial{
    private String equation;
    ExtendedDoubleEvaluator evaluator = new ExtendedDoubleEvaluator();
    Double result;
    public void evaluateEquation(String s, TextView textView){

        //TODO: currently % is for modulo, not percentage, need to catch %, run percent function, then replace.
        //TODO: need to check functions format for some functions


       try {
           result = evaluator.evaluate(s);
           textView.setText(String.valueOf(result));
       }catch (IllegalArgumentException i){
           textView.setText(String.valueOf(s));
       }

    }


    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }



}






















