import java.io.*;
public class Demo {

   public static void main(String args[])throws IOException {
      File file = new File("Hello2.csv");
      
      int[] data1 = {000, 111, 222, 333, 444, 555, 666, 777, 888, 999};
      String[] data2 = {"aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "jjj", "kkk"};
      
      // creates the file
      file.createNewFile();
      
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file); 
            
      // Writes the content to the file
      for (int i = 0; i <= 9; i++) {
    	  	 writer.write(i + ", " + data1[i] + ", " + data2[i] + "\r\n");
      }
      writer.flush();
      writer.close();

      // Creates a FileReader Object
      FileReader fr = new FileReader(file); 
      char [] a = new char[100000];
      fr.read(a);   // reads the content to the array
      
      for(char c : a)
         System.out.print(c);   // prints the characters one by one
      fr.close();
   }
}