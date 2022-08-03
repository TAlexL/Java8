package Other;

public class newLambda {
    public static int suumm(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        NewInterface newInterface1;
        NewInterface newInterface2;
        newInterface1 = (int a, int b) -> a + b;
        newInterface2 = (int a, int b) -> a/2;
        System.out.println(newInterface1.summ(20, 30));
        System.out.println(newInterface2.summ(20, 50));
        System.out.println(suumm(20,30));
    }
}
interface NewInterface {
    int summ(int a, int b);
}