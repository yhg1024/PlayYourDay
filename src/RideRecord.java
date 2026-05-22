public class RideRecord {
    String attractionName;
    String date;

    String startedAt;
    String completedAt;

    int waitTime;

    public RideRecord (String attractionName, String date, String startedAt, String completedAt, int waitTime) {
        this.attractionName = attractionName;
        this.date = date;
        this.startedAt = startedAt;
        this.completedAt = completedAt;
        this.waitTime = waitTime;
    }

    public RideRecord(String name, String date, int waitTime) {
        this.attractionName = name;
        this.date = date;
        this.waitTime = waitTime;
    }
}
