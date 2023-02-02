import java.util.Arrays;
public class AdditionOfArray {
    public static void main(String[] args) {

        int arr[] = {9,8,3,7,5,6};
        int n = arr.length;
        int newArr[] = new int[n+1];
        int value = 5;
        System.out.println(Arrays.toString(arr));  //I am displaying array using this command
        for(int i = 0; i<n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = value;
        System.out.println(Arrays.toString(newArr));//I am displaying array using this command
    }
}

