import java.lang.reflect.Array;

public class ArrayUtils {

    public static Object getElement(Object array_, int index){
        return Array.get(array_, index);
    }
}
