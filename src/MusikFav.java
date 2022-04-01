public class MusikFav {
    private String songTitle;
    private String singer;

    public MusikFav(String songTitle, String singer){
        this.songTitle = songTitle;
        this.singer = singer;
    }

    public String getSongTitle() {
        return this.songTitle;
    }

    @Override
    public String toString() {
        return songTitle +" ~ "+ singer;
    }
}
