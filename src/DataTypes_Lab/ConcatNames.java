package DataTypes_Lab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name1 = sc.nextLine();
//        String name2 = sc.nextLine();
//        String delimiter = sc.nextLine();
//
//        System.out.println(String.join(delimiter, name1, name2));

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        StringBuilder concat = new StringBuilder();

        concat.append(name1);
        concat.append(sc.nextLine());
        concat.append(name2);

        System.out.println(concat);
    }
}
