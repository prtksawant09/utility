package edu.pratik.stringpoc;

import static sun.misc.Version.println;

public class StringStarter {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = str1;

        System.out.println("str1==str2: " + String.valueOf(str1)==String.valueOf(str2));
        System.out.println("str2==str3: " + str2==str3);
        System.out.println("str1==str3: " + str1==str3);

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str2.equals(str3): " + str2.equals(str3));
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
        System.out.println("str2.equalsIgnoreCase(str3): " + str2.equalsIgnoreCase(str3));
        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));
    }
}
