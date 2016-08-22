
class VersioningModel {

    public String startdate;
    public int eventver;
    public String timezone;
    public int tracksver;
    public String enddate;
    public String privacy;

    public VersioningModel(String startdate, int eventver, String timezone, int tracksver, String enddate, String privacy) {

        this.startdate = startdate;
        this.eventver = eventver;
        this.timezone = timezone;
        this.tracksver = tracksver;
        this.enddate = enddate;
        this.privacy = privacy;

    }

}