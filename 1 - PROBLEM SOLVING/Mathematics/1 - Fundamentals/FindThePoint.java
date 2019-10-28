import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class FindThePoint {

    /*
     * Complete the findPoint function below.
     */
    static int[] findPoint(int px, int py, int qx, int qy)
    {
        int[] point = new int[2];
        int rx = Math.abs(px - qx);
        int ry = Math.abs(py - qy);
        
        if(px > qx)
        {
            rx = qx - rx;
        }
        else
        {
            rx = qx + rx;
        }
        
        if(py > qy)
        {
            ry = qy - ry;
        }
        else
        {
            ry = qy + ry;
        }
        
        point[0] = rx;
        point[1] = ry;

        return point;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int nItr = 0; nItr < n; nItr++) {
            String[] pxPyQxQy = scanner.nextLine().split(" ");

            int px = Integer.parseInt(pxPyQxQy[0].trim());

            int py = Integer.parseInt(pxPyQxQy[1].trim());

            int qx = Integer.parseInt(pxPyQxQy[2].trim());

            int qy = Integer.parseInt(pxPyQxQy[3].trim());

            int[] result = findPoint(px, py, qx, qy);

            for (int resultItr = 0; resultItr < result.length; resultItr++) {
                bufferedWriter.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}