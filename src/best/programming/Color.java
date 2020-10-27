package best.programming;

import java.util.HashMap;
import java.util.Map;

public enum Color {

    RED(0),
    GREEN(1),
    YELLOW(2),
    BLACK(3);

    private int value;
    private static Map map = new HashMap<>();

    Color(int value){
        this.value = value;
    }

    static {
        for(Color color : Color.values()){
            map.put(color.value, color);
        }
    }

    public static Color valueOf(int color){
        var moduloResult = Math.abs(color) % map.size();
        if(color >= 0) {
            return (Color) map.get(moduloResult);
        } else {
            if(moduloResult == 0){
                return (Color) map.get(0);
            }
            return (Color) map.get(map.size() - moduloResult);
        }
    }

    public int getValue(){
        return value;
    }
}

