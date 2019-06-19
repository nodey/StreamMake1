package TaskForPoint6.Task15;

import java.io.BufferedInputStream;
    import java.io.BufferedOutputStream;
    import java.io.BufferedReader;
    import java.io.FileInputStream;
    import java.io.FileOutputStream;
    import java.io.InputStream;
    import java.io.InputStreamReader;
    import java.io.OutputStream;

    public class Task15 {

        public static void CopyFile(String src, final String dest) throws Exception {
            InputStream in = new BufferedInputStream(new FileInputStream(src));
            try {
                OutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
                try {
                    byte[] b = new byte[1024];
                    int r;

                    do {
                        r = in.read(b, 0, b.length);
                        if (r > 0)
                            out.write(b, 0, r);
                    } while (r > 0);

                } finally {
                    out.close();
                }
            } finally {
                in.close();
            }
        }


        public static void main(String[] args) throws Exception {
            String s1, s2;

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            s1 = bf.readLine();
            System.out.println("From " + s1);

            s2 = bf.readLine();
            System.out.println("to " + s2);

            Task15.CopyFile(s1, s2);
        }
    }