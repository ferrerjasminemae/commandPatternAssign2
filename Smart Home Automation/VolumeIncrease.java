public class VolumeIncrease implements Command{

    private MusicPlayer musicPlayer;

    public VolumeIncrease(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }
    @Override 
    public String execute(){
        return musicPlayer.volIncrease();
    }
}