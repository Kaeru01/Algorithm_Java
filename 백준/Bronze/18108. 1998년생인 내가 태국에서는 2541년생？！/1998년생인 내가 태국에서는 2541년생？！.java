import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int a = Integer.parseInt(str);

        bw.write(a - 543 + "\n");
        bw.flush();
        bw.close();
    }
}