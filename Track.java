class Track{
    //attributes getter setter functions
    private int track_id;
    private String track_name;
    private int track_time;

    public Track(int track_id,String track_name,int track_time){
        this.track_id=track_id;
        this.track_name=track_name;
        this.track_time=track_time;

    }
    public  int getTrack_id()
    {
        return track_id;
    }
    public void setTrackID(int track_id)
    {
        this.track_id = track_id;
    }
    public String getTrack_name()
    {
        return track_name;
    }
    public void setTrack_name(String track_name) {
        this.track_name = track_name;
    }
    public int getTrack_time()
    {
        return track_time;
    }
    public void setTrack_time(int track_time) 
    {
        this.track_time= track_time;
    }


}