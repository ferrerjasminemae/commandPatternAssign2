public class MusicPlayer{
    public String volDecrease(){
        return"The volume is decreased.";
    }
    public String volIncrease(){
        return "The volume is increased.";
    }
    public static String setMusic(String title, String artist){
        return "Playing "+ title + " by " + artist;
    }
    public String stopMusic(){
        return "Music stopped playing.";
    }
    
}