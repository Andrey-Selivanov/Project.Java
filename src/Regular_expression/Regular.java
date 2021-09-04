package Regular_expression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    public static void main(String[] args) {
        String str = "11 - 10";
        String [] numbers = str.split("\\+|-|\\*|/");

        int[] numbers1 = new int[numbers.length];

        for(int i = 0; i < numbers.length; i ++) {
            try {
                numbers1[i] = Integer.parseInt(numbers[i].trim());
            }catch (NumberFormatException nfe) {};
        }
        int sum = 0;
        double sum1 = 1;
        Pattern pattern1 = Pattern.compile("\\+");
        Matcher matcher1 = pattern1.matcher(str);

        Pattern pattern2 = Pattern.compile("\\-");
        Matcher matcher2 = pattern2.matcher(str);

        Pattern pattern3 = Pattern.compile("\\*");
        Matcher matcher3 = pattern3.matcher(str);

        Pattern pattern4 = Pattern.compile("\\/");
        Matcher matcher4 = pattern4.matcher(str);

        if(matcher1.find()) {
            for(int i = 0; i < numbers1.length; i ++) {
                sum = sum + numbers1[i];
            }
            System.out.println(sum);
        }
        else if(matcher2.find()) {
            for(int i = 0; i < numbers1.length; i ++) {
                sum = numbers1[i] - sum;
            }
            System.out.println(-sum);
        }
        else if(matcher3.find()) {
            for(int i = 0; i < numbers1.length; i ++) {
                sum1 = numbers1[i] * sum1;
            }
            System.out.println(sum1);
        }
        else if(matcher4.find()) {
            for (int i = 0; i < numbers1.length; i++) {
                sum1 = numbers1[i] / sum1;
            }
            System.out.println(sum1);
        }

    }
}
