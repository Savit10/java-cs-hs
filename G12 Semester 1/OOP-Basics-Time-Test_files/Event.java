public class Event {
    private Date eventDate;
    private String eventTitle;
    private String eventLocation;
    private Time eventTime;

    public Event(Date eventDate, String eventTitle, String eventLocation, Time eventTime) {
        this.eventDate = eventDate;
        this.eventTitle = eventTitle;
        this.eventLocation = eventLocation;
        this.eventTime = eventTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventDate=" + eventDate +
                ", eventTitle='" + eventTitle + '\'' +
                ", eventLocation='" + eventLocation + '\'' +
                ", eventTime=" + eventTime +
                '}';
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Time getEventTime() {
        return eventTime;
    }

    public void setEventTime(Time eventTime) {
        this.eventTime = eventTime;
    }
}
