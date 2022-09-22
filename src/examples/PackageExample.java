package examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;

/**
 * Package examples
 *
 * @author Kristel Talimaa
 */
public class PackageExample {
    public static void main(String[] args) {
        Random random = new Random();                           //To import package after Random ctrl + space  //open library Random+ctrl+enter
        System.out.println(random.nextInt());

        Date date = new Date ();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();              //most useful to use
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate myBirthday = LocalDate.of(1996, 3, 29);
        System.out.println(myBirthday);

        LocalTime localTime = LocalTime.MIDNIGHT;
        System.out.println(localTime);

        //ctrl+alt+o = cleans all unnecessary things
        //ctrl+alt+l = lines the rows

        //class files start with capital letter
        //packages with small letter





    }
}
