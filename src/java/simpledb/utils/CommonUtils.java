package simpledb.utils;

public class CommonUtils {

  public static boolean equals(String a, String b) {
    if (a == null) {
      return b == null;
    }
    return a.equals(b);
  }
}
