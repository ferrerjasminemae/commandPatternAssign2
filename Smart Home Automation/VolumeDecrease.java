public class VolumeDecrease implements Command{

    private MusicPlayer musicPlayer;

    public VolumeDecrease(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }
    @Override 
    public String execute(){
        return musicPlayer.volDecrease();
    }
}