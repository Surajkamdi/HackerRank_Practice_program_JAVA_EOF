//Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

/*Output Format

For each line, print the line number, followed by a single space, and then the line content received as input. */
import java.io.*;
import java.util.*;

public class Java_EOF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Written by Er. suraj kamdi
        Scanner s= new Scanner(System.in);
        int count =1;
        while(s.hasNext()){
        String suraj=s.nextLine();
        System.out.println(count+" "+suraj);
        count++;
         }
    }
}
