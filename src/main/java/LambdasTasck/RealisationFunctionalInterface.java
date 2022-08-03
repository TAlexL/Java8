package LambdasTasck;

import org.junit.Assert;
import org.junit.Test;

public class RealisationFunctionalInterface {
    @Test
    public void realisation() {
        ByOperationWithNullParams byOperationForNullParams;
        byOperationForNullParams = () -> "This method dont have params";
        System.out.println(byOperationForNullParams.printWord());

        ByOperationWithTwoParams byOperationWithTwoParams = (int a, int b) -> a + b;
        int resultTwoParams = byOperationWithTwoParams.calculateTwoParams(10, 20);
        System.out.println(resultTwoParams);

        ByOperationWithTreeParams byOperationWithTreeParams;
        byOperationWithTreeParams = (int a, String name, char c) -> {
            char[] array = name.toCharArray();
            int q = 0;
            for (char s : array) {
                int i = 0;
                if (s == c) {
                    q++;
                }
                i++;
            }
            return a == q;
        };
        System.out.println(byOperationWithTreeParams.threeParamsMethod(4,"Mama mila ramu", 'a'));
        Assert.assertTrue(byOperationWithTreeParams.threeParamsMethod(4,"Mama mila ramu", 'a'));
    }
}
