package strings;

/**
 * To print substring of a string.
 *
 * @author Kristel Talimaa
 */
public class SubstringPrint {
    public static void main(String[] args) {
        String s = "Estonia is a beautiful country!";       // substring for example is three words from it
        System.out.println(s);

        System.out.println(s.substring(0, 22));     // 22 = Es...ful, counts every digit, spaces too.
        System.out.println(s.substring(23));    // s.substring(from beginning of the index)
        System.out.println(s.substring(13, 22));     // to print only word "beautiful"
        System.out.println(s.substring(0, 13) + s.substring(23));       //joining the strings

        System.out.println(s.substring(s.indexOf("beau")));     // no need to count digits, when using indexOf

        System.out.println(s.startsWith("Estonia"));
    }
}
