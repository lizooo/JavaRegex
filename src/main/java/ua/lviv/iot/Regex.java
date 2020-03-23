package ua.lviv.iot;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

  public String replaceTextUsingPatten( String patternString, String stringToCheck) {
    Pattern pattern = Pattern.compile(patternString);
    Matcher matcher = pattern.matcher(stringToCheck);
    System.out.println(matcher.replaceAll(""));
    return matcher.replaceAll("");
  }

}
