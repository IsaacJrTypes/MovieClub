/*
 * Description: The program uses OOP concept to create a movieClub
 * abstract class to help create membership club subclasses. An array
 * of multiple subclasses are saved to an array. Allowing for loop to
 * print out each member through an implicit toStrings() call
 *
 * @author: Isaac Jimenez
 * @version: 1.0
 *
 * */
public class Main {
    public static void main(String[] args) {
        MovieClub m1 = new SeniorClub(16.00);
        MovieClub m2 = new GoldClub(16.00);
        MovieClub m3 = new PlatinumClub(16.00);
        MovieClub m4 = new PlatinumPlusClub(16.00);
        MovieClub[] members = { m1,m2,m3,m4 };
        for(MovieClub member : members) {
            System.out.println(member);
        }

    }
}