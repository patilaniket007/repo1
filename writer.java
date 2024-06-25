import java.io.*;
class Test{
    public static void main(String args[]) throws IOException{
       FileOutputStream fout=new FileOutputStream("abc.txt");
       String z="This Is My Own File";
       byte[] b=z.getBytes();
       fout.write(b);
       fout.close();
       System.out.println("Write Operation Successful......");
    }
}