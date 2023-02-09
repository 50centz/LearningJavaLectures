package Lectures.Lecture1;
import java.io.FileWriter;
import java.io.IOException;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        /* 
        System.out.println("world"); 
        int a = 123;
        a = --a - a--;
        System.out.println(a);
        */
        /* 
        int [][] arr = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d", arr[i][j]);
                
            }
            System.out.println();
        }
        */

        //lib.sayHi();
        try (FileWriter fw = new FileWriter("file.txt", false)){
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 4");
            fw.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
   
}