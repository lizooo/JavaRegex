package ua.lviv.iot;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import org.junit.Test;

public class RegexTest {


   Regex regex = new Regex();
  
  @Test
  public void replaceTextUsingPattenTest() {

    String expectedUserInput =
        "Hello! Mr Matcher please check this line. Oh and also this one. OK, that's it thanks!";
    System.setIn(new ByteArrayInputStream(expectedUserInput.getBytes()));
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    String text = scan.nextLine();
    System.out.println(text);

     String resultLine = regex.replaceTextUsingPatten("\\b\\S*[AaOrK]\\S*\\s?", text);
     assertEquals("Hello! check this line. this one. it ", resultLine);

  }



}
