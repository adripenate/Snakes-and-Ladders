import java.util.HashMap;
import java.util.Map;

public class Snakes {
    private static Map<Integer, Integer> snakes = new HashMap<Integer, Integer>()
    {{
        put(16, 6);
        put(46, 25);
        put(49, 11);
        put(62, 19);
        put(64, 60);
        put(74, 53);
        put(89, 68);
        put(92, 88);
        put(95, 75);
        put(99, 80);
    }};

    public static Integer getEndSquare(int actualSquare) {
        return snakes.get(actualSquare);
    }

    public static boolean isSnakeSquare(int actualSquare) {
        return snakes.containsKey(actualSquare);
    }
}
