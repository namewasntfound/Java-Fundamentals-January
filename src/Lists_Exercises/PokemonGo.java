package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> pokemons = Arrays
                .stream(sc.nextLine().split("\\s"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while (!pokemons.isEmpty()) {
            int index = Integer.parseInt(sc.nextLine());
            if (index < 0) {
                int element = pokemons.get(0);
                sum += element;
                pokemons.set(0, pokemons.get(pokemons.size() - 1));
                changeElements(pokemons, element);
            } else if (index <= pokemons.size() - 1) {
                int element = pokemons.get(index);
                sum += element;
                pokemons.remove(index);
                changeElements(pokemons, element);
            } else {
                int element = pokemons.get(pokemons.size() - 1);
                sum += element;
                pokemons.set((pokemons.size() - 1), pokemons.get(0));
                changeElements(pokemons, element);
            }
        }

        System.out.println(sum);
    }

    private static List<Integer> changeElements(List<Integer> pokemons, int value) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (value >= pokemons.get(i)) {
                pokemons.set(i, value + pokemons.get(i));
            } else {
                pokemons.set(i, pokemons.get(i) - value);
            }
        }
        return pokemons;
    }
}
