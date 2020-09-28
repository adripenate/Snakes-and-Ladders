import java.util.HashMap;
import java.util.Map;

public class Ladders {
    private static Map<Integer, Integer> ladders = new HashMap<Integer, Integer>()
    {{
        put(2, 38);
        put(7, 14);
        put(8, 31);
        put(15, 26);
        put(21, 42);
        put(28, 84);
        put(36, 44);
        put(51, 67);
        put(71, 91);
        put(78, 98);
        put(87, 94);
    }};


    public static Integer getEndSquare(int actualSquare) {
        return ladders.get(actualSquare);
    }

    public static boolean isLadderSquare(int actualSquare) {
        return ladders.containsKey(actualSquare);
    }
}
