import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;



public class TwoD_Array {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       /* List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
*/
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[1000][1000];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int max_sum = 0;

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {

                int temp_sum = 0;
                // top row
                temp_sum += arr[i][j];
                temp_sum += arr[i][j+1];
                temp_sum += arr[i][j+2];
                //middle
                temp_sum += arr[i+1][j+1];
                //bottom row
                temp_sum += arr[i+2][j];
                temp_sum += arr[i+2][j+1];
                temp_sum += arr[i+2][j+2];

                //if first hourglass, set as max
                if(temp_sum > max_sum){
                    max_sum = temp_sum;///this will keep it up to date
                }
            }
        }
        System.out.println(max_sum);
    }
}
