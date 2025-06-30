import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();

        int b1 = B.charAt(2) - '0';
        int b2 = B.charAt(1) - '0';
        int b3 = B.charAt(0) - '0';

        bw.write(A * b1 + "\n" + A * b2 + "\n" + A * b3 + "\n" + A * Integer.parseInt(B) + "\n");
        bw.flush();
        bw.close();
    }
}