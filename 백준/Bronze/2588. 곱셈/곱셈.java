import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int a = Integer.parseInt(br.readLine());
    String b = br.readLine();

    int b1 = b.charAt(2) - '0';
    int b2 = b.charAt(1) - '0';
    int b3 = b.charAt(0) - '0';

    bw.write(a * b1 + "\n");
    bw.write(a * b2 + "\n");
    bw.write(a * b3 + "\n");
    bw.write(a * Integer.parseInt(b) + "\n");

    bw.flush();
    bw.close();
  }
}