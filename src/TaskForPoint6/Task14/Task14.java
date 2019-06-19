package TaskForPoint6.Task14;

import java.io.*;

public class Task14 {
    public static void main(String[] args) throws FileNotFoundException {


        // dummy bytes to manipulate
        byte myBytes[] =
                {
                        ( (1 << 2) + (1 << 3) ), // 2^2 + 2^3 = 12 --  1100
                        ( (1 << 4) + (1 << 2) ), // 2^4 + 2^2 = 20 -- 10100
                        ( (1 << 2) + (1 << 0) )  // 2^2 + 2^0 = 5  --   101
                };

        ByteArrayInputStream bais = new ByteArrayInputStream(myBytes);

        // displays the available bytes in this stream
        System.out.println("Bytes left in inputstream = " + bais.available());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        System.out.println("writing information to outputstream, read from input stream");

        while(bais.available() != 0){
            baos.write(bais.read());
            try{Thread.sleep(500); System.out.print(".");}catch(Throwable t){}
        }

        System.out.println("Bytes left in inputstream = " + bais.available());


        // displays the available bytes after writing the read bytes into the output stream
        System.out.println(baos); // displaying the information written to the output stream - should be displayed as chars
        System.out.println(
                (char)(byte)(new Byte((byte)12)) + "  " +
                        (char)(byte)(new Byte((byte)20)) + "  " +
                        (char)(byte)(new Byte((byte)5))); // proof that the information was written to the stream as bytes but displayed as chars
    }
}
