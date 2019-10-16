import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.lang.reflect.Array;
import java.util.Arrays;

public class IntArrayCreator {

    public static void main(String args[]) throws ClassNotFoundException {
        int sizeOfArray = Integer.valueOf(args[0]);

        int[] intArray = (int[])Array.newInstance(int.class,sizeOfArray);
        System.out.println(ArrayUtils.getElement(intArray, 2));


    }

}
