package Java08_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04_Songs {
    public static class Song {
        String typeList; //we
        String name;
        String time;
        public Song(String typeList,String name,String time){
            // this is the attributes in the class Song
                 //here we say from the class Song(this) we get the String named typeList and we give it
                 //a value that will come from the outside
            this.typeList = typeList;
            this.name = name;
            this.time=time;
        }
        public String getTypeList(){
            return this.typeList;
        }
        public String getName(){
            return this.name;
        }
        public String getTime(){
            return this.time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            String[] songsArr = inputLine.split("_");
            Song currentSong = new Song(songsArr[0],songsArr[1],songsArr[2]);
            songList.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            //for class Song , constructor song in our song list
            for (Song song : songList){
                System.out.println(song.getName());
            }
        } else {
            for (Song song :songList){
                String currentTypeList =song.getTypeList();
                if (currentTypeList.equals(command)){
                    System.out.println(song.getName());
                }
            }
        }

    }

}
