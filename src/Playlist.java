import java.util.ArrayList;
public class Playlist {
    public static void main(String[] args){
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("signed to god");
        desertIslandPlaylist.add("IDGAF");
        desertIslandPlaylist.add("famous");
        desertIslandPlaylist.add("racks and rounds");
        desertIslandPlaylist.add("snitches get stiches");
        desertIslandPlaylist.add("panjab");
        desertIslandPlaylist.remove(1);
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.set(0,"IDGAF");
        desertIslandPlaylist.set(1,"signed to god");
        System.out.println(desertIslandPlaylist);
    }
}
