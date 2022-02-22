package assignment2;
import java.io.*;

public class program6  {

class Main  {
  public static void findFile() {

       try {
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
		stream.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

  public static void main(String[] args) {
    System.out.println("print Exception");
  }
}

}



