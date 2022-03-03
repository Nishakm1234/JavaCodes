import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionEx {
    public static void main(String[] args) throws IOException {
        FileReader fileInput=new FileReader("C://file.txt");
        BufferedReader br=new BufferedReader(fileInput);
        for(int i=0;i<3;i++){
            System.out.println(br.readLine());

        }
        fileInput.close();
    }
}
