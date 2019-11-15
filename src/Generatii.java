import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Generatii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("introduceti varsta");
        int age = in.nextInt();
        String generatia;
        if (age <= 0) {
            // generatia = "valoare incorecta";
            System.out.println("varsta incorecta");
            return;
        }
        else if (age < 6) {
            generatia = "alfa";
        }
        else if (age <= 20) {
            generatia = "z";
        } else {
            generatia = "builders";
        }
        System.out.println("Generatia este : " + generatia);
    }
}
