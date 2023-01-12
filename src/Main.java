import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};

        for (int i = 0; i < arr.length; i++) {
            if ( i % 3 == 0) {
                arr[i] = arr[i].toUpperCase();
            }
        }

        System.out.println(Arrays.toString(arr));




    }
}