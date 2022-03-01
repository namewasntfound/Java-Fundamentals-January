package ObjectsAndClasses_Lab.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split("_");

            String typeList = data[0];
            String songName = data[1];
            String time = data[2];

            Song song = new Song();

            song.setTypeList(typeList);
            song.setName(songName);
            song.setTime(time);

            songs.add(song);
        }

        String input = sc.nextLine();

        if (input.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(input)) {
                    System.out.println(song.getName());
                }
            }
        }
    }

}
