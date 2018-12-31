//server program
import java.io.*;
import java.net.*;
public class Serverp{
public static void main(String args[]){
 try{
   ServerSocket ss=new ServerSocket(2222);
   Socket s=ss.accept();
   DataInputStream dis=new DataInputStream(s.getInputStream());
   String str=(String)dis.readUTF();
   System.out.println("message from client"+str);
   s.close();
   }
catch(Exception ex){
ex.printStackTrace();
}
}
}