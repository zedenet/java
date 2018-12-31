//client program
import java.io.*;
import java.net.*;
public class Clientp{
public static void main(String args[]){
try{
 Socket s=new Socket("localhost",2222);
 DataOutputStream dout=new DataOutputStream(s.getOutputStream());
 dout.writeUTF("From wolliso campus");
 dout.flush();
 dout.close();
 s.close();
  }
catch(Exception ex){
ex.printStackTrace();
}
}
}