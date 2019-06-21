package TaskForPoint6.Task23;

import sun.misc.BASE64Decoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Base64;

public class Task23 {
        public static void main(String[] args) throws Exception {

            // read "any" type of image (in this case a png file)
            BufferedImage image = ImageIO.read(new File("C:\\maven/image.jpg"));

            // write it to byte array in-memory (jpg format)
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            ImageIO.write(image, "jpg", b);

            // do whatever with the array...
            byte[] jpgByteArray = b.toByteArray();

            // convert it to a String with 0s and 1s
            StringBuilder sb = new StringBuilder();
            for (byte by : jpgByteArray)
                sb.append(Integer.toBinaryString(by & 0xFF));

            System.out.println(sb.toString());

            encoder("C:\\maven/image.jpg");
            decodeToImage("C:\\maven/image.jpg");


            Socket socket = new Socket("localhost", 13085);
            OutputStream outputStream = socket.getOutputStream();

            image = ImageIO.read(new File("C:\\maven/image.jpg"));

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(image, "jpg", byteArrayOutputStream);

            byte[] size = ByteBuffer.allocate(4).putInt(byteArrayOutputStream.size()).array();
            outputStream.write(size);
            outputStream.write(byteArrayOutputStream.toByteArray());
            outputStream.flush();
            System.out.println("Flushed: " + System.currentTimeMillis());

            Thread.sleep(120000);
            System.out.println("Closing: " + System.currentTimeMillis());
            socket.close();
        }

    public static String encoder(String filePath) {
        String base64File = "";
        File file = new File(filePath);
        try (FileInputStream imageInFile = new FileInputStream(file)) {
            // Reading a file from file system
            byte fileData[] = new byte[(int) file.length()];
            imageInFile.read(fileData);
            base64File = Base64.getEncoder().encodeToString(fileData);
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the file " + ioe);
        }
        return base64File;
    }

    public static BufferedImage decodeToImage(String imageString) {

        BufferedImage image = null;
        byte[] imageByte;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }
    }
