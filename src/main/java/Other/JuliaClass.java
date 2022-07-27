package Other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JuliaClass {
    public static void main(String[] args) {
        int [] ints = new int[10];
        for (int i = 0; i <10; i++){
            ints[i] = i;
        }
        System.out.println(Arrays.toString(ints));

            String text = "Егор Алла Александр";
            Pattern pattern = Pattern.compile("А.++а");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
