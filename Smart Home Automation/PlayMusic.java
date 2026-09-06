import java.util.Scanner;

public class PlayMusic implements Command{

    private MusicPlayer musicPlayer;
    private String title, artist;

    public PlayMusic(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }
    @Override 
    public String execute(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter music title: ");
        String title = sc.nextLine();
        System.out.print("Enter artist: ");
        String artist = sc.nextLine();
        return MusicPlayer.setMusic(title, artist);
        
    }
    
}