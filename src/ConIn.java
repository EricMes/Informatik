import java.io.*; 

public class ConIn {

  public static String readln() {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      return in.readLine(); // Gelesenen String zur¸ckgeben
    }
    catch( IOException ex ) {
      System.out.println( ex.getMessage() );
    }
    return "Keine Eingabe";
  }

  // byte einlesen
  public static byte readByte(String prompt) {
    System.out.print(prompt);
    return Byte.parseByte(readln());
  }

  // short einlesen
  public static short readShort(String prompt) {
    System.out.print(prompt);
    return Short.parseShort(readln());
  }
  
  // int einlesen
  public static int readInt(String prompt) {
    System.out.print(prompt);
    return Integer.parseInt(readln());
  }

  // long einlesen
  public static long readLong(String prompt) {
    System.out.print(prompt);
    return Long.parseLong(readln());
  }
  
  // float einlesen
  public static float readFloat(String prompt) {
    System.out.print(prompt);
    return Float.parseFloat(readln());
  }

  // double einlesen
  public static double readDouble(String prompt) {
    System.out.print(prompt);
    return Double.parseDouble(readln());
  }

  // char einlesen
  public static char readChar(String prompt) {
    System.out.print(prompt);
    return readln().charAt(0);
  }
  
  // String einlesen
  public static String readString(String prompt) {
    System.out.print(prompt);
    return readln();
  }
}
