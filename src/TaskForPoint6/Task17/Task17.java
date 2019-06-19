package TaskForPoint6.Task17;

import java.io.*;

public class Task17 {
    public static void main(String[] args) {

        Integer value = 1231;
        // запись в файл
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\maven/readmix.txt")))
        {
            // записываем значения
            dos.writeInt(value);
            System.out.println("File has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        // обратное считывание из файла
        try(DataInputStream dos = new DataInputStream(new FileInputStream("C:\\maven/readmix.txt")))
        {
            // записываем значения
            int valuee = dos.readInt();
            System.out.println(valuee);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}