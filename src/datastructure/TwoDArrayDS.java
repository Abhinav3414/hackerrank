package datastructure;
import java.util.*;

public class TwoDArrayDS {
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int arr_i=0; arr_i < 6; arr_i++){
	            for(int arr_j=0; arr_j < 6; arr_j++){
	                arr[arr_i][arr_j] = in.nextInt();
	            }
	        }
	    }
}
