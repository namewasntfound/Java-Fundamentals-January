package Lists_Lab;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String product = sc.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        int index = 1;
        for (String product : products) {
            System.out.printf("%d.%s%n", index, product);
            index++;
        }
    }
}
