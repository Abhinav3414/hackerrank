package algorithm;
import java.lang.reflect.Method;


public class Solution3 {

	 static <E> void printArray(E[] inputArray)
    {
        for(E elements : inputArray)
            System.out.println(elements);
}
public static void main(String args[]){
    Integer[] intArray = { 1, 2, 3 };
    String[] stringArray = { "Hello", "World" };
    //return 1+Max(5,3);
    printArray( intArray  );
    printArray( stringArray );
    
    if(Solution3.class.getDeclaredMethods().length > 2){
        System.out.println("You should only have 1 method named printArray.");
    }
}
}