import java.io.*;
import java.util.Random;
import java.io.BufferedReader;

public class MyClass {
    public static void main(String args[]) {
        // Your algorithm goes here.
    	InputStreamReader isr=new InputStreamReader(System.in);
    	BufferedReader br= new BufferedReader(isr);
    	System.out.println("Who are you?");
    	String namae=null;
    	try {
    		namae=br.readLine();
    		br.close();
    	}
    	catch(IOException e) {
    		e.printStackTrace();
    	}
   System.out.println("Hello,"+namae+"!");
   
   String[] coin ={"Heads","Tails"};
   Random random = new Random();
   int x=0;
   int y=0;
   for(int i=0;i<3;i++) {
	   int n=random.nextInt(2);
	   String hot=coin[n];
	   if(n==0)
		   x++;
	   else
		   y++;
	   System.out.println("Round"+(i+1)+":"+hot);
   }
   System.out.println("Heads: "+x+", Tail:"+y);
   
if(x>y)System.out.println(namae +"win!");
else System.out.println(namae +"lose!");
    }
}