import java.text.NumberFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double number = 0.1;
        String result = NumberFormat.getPercentInstance().format(number);
        System.out.println(result);
    }
}


//For example we can use like max,ceil,float,
// double result = Math.random();
//

