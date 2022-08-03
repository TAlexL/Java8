package Other;

public class LambdaApp {
        public static void main(String[] args) {

            Mani mani1 = (x,y)->x*y;
            Mani mani2 = (x,y)->x-y;
            Mani mani3 = (x,y)->x+y;

            System.out.println(mani1.calculate(10, 20));
            System.out.println(mani2.calculate(10, 20));
            System.out.println(mani3.calculate(10, 20));

        }
    }
    interface Mani {
        int calculate(int e, int w);
}
