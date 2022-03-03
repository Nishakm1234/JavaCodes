import java.io.*;
public class decimalToBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        int i=0;
        int count=0,max=0,temp=0;
        int binary[]=new int[1000000];
        while(n>0){

            binary[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){

            if(binary[j]==1)
                count++;
            else
            {
                temp=count;
                count=0;
                if(temp>max)
                    max=temp;
                continue;
            }

        }
        if(max>count)
            System.out.println(max);
        else
            System.out.println(count);
    }
}
