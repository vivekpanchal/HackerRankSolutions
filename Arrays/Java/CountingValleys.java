
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



    public class CountingValleys {

        // Complete the countingValleys function below.
        static int countingValleys(int n, String s) {

            int v = 0;     // # of valleys
            int lvl = 0;   // current level
            for(char c : s.toCharArray()){
                if(c == 'U') ++lvl;
                if(c == 'D') --lvl;

                // if we just came UP to sea level
                if(lvl == 0 && c == 'U')
                    ++v;
            }

            // int sum = 0;
            // int way=0;
            // char[] sa = s.toCharArray();
            // if(sa[0]=='U'){
            //     ++way;
            // }else --way;
            // for(int i=1; i<sa.length;i++){
            //     System.out.println(i+"="+sa[i]);
            //    if((sa[i]=='D')){
            //        --way;
            //        System.out.println("Down-"+way);
            //    }else if((sa[i]=='U')){
            //      ++way;
            //      System.out.println("Up-"+way);
            //    }

            //    if((sa[i]=='D')&&(sa[i-1]=='U')&&(way>=-1)){
            //       ++sum;
            //       System.out.println("Sum-"+sum);
            //    }
            //}
            return v;

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String s = scanner.nextLine();

            int result = countingValleys(n, s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }


