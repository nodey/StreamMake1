package TaskForPoint6.Task21;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.text.ParseException;
import java.time.ZoneId;
import java.util.TimeZone;

public class Task21 {
    public static void main(String[] args) throws IOException, ParseException {
        String date =(String.valueOf(TimeZone.getTimeZone(ZoneId.of("Europe/Minsk"))));
        System.out.println(date);
        Socket socket = new Socket("localhost", 7777);
        System.out.println("Connected!");

        // get the output stream from the socket.
        OutputStream outputStream = socket.getOutputStream();
        // create a data output stream from the output stream so we can send data through it
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        System.out.println("Sending Date to the ServerSocket");

        dataOutputStream.writeUTF(date);
        dataOutputStream.flush(); // send the message
        dataOutputStream.close(); // close the output stream when we're done.

        System.out.println("Closing socket and terminating program.");
        socket.close();
    }
}