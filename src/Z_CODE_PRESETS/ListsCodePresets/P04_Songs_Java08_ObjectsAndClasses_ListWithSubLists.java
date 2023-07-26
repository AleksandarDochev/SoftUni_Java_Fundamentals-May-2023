package Z_CODE_PRESETS.ListsCodePresets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04_Songs_Java08_ObjectsAndClasses_ListWithSubLists {
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
            System.out.println();

        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            System.out.println(songList.get(0));
        }
    }

}
