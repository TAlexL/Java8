package Other;

import java.util.ArrayList;
import java.util.List;

public class Exemple {

    private static class Students {
        final int age;
        final String name;

        private Students(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public static void main(String[] args) {
            List<Students> base = new ArrayList<>() {{
                add(new Students(18, "Sasha"));
                add(new Students(22, "Sergei"));
                add(new Students(21, "Vova"));
                add(new Students(24, "Misha"));
                add(new Students(19, "Grisha"));
            }};
            long count = base
                    .stream()
                    .filter(students -> students.age > 18)
                    .map(students -> students.name)
                    .filter(name -> name.length() >= 5)
                    .count();
            System.out.println(count);
        }
    }
}
