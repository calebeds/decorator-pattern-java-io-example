import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        int c;

        StringBuffer stringBuffer = new StringBuffer("Calebe Oliveira aaaCCccdddDDDD");
        byte[] bytes = stringBuffer.toString().getBytes();


        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new ByteArrayInputStream(bytes)));
        while ((c = in.read()) >= 0) {
            System.out.println((char) c);
        }

        in.close();
    }
}