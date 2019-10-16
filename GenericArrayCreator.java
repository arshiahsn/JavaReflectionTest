import java.lang.reflect.Array;

public class GenericArrayCreator {

    public static void main(String args[]) throws ClassNotFoundException {
        int sizeOfArray = Integer.valueOf(args[0]);
        String className = args[1];
        className = "java.lang." + className;
        Object objArray =  Array.newInstance(Class.forName(className),sizeOfArray);
        Array.set(objArray, 2, 2);
        System.out.println(ArrayUtils.getElement(objArray, 2));


    }
}
