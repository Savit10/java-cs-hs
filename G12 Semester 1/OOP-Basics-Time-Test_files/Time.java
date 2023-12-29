public class Time {
    private int minutes;
    private int hours;

    public Time()
    {
    }

    public Time(int minutes)
    {
        this.setMinutes(Math.abs(minutes));
    }

    public Time(int hours, int minutes) {
        this.setHours(Math.abs(hours));
        this.setMinutes(Math.abs(minutes));
    }

    @Override
    public String toString() {
        if (this.getMinutes()/10 < 1 && this.getHours()/10 < 1)
        {
            return "0" + hours + ":0" + minutes;
        }
        else if(this.getMinutes()/10 < 1)
        {
            return  hours + ":0" + minutes;
        }
        else if (this.getHours()/10 < 1)
        {
            return "0" + hours + ":" + minutes;
        }
        return hours + ":" + minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
       minutes = Math.abs(minutes);
       if (minutes >= 60)
       {
           this.setHours(this.getHours() + (minutes/60));
           this.minutes = minutes % 60;
       }
       else{
           this.minutes = minutes;
       };
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        hours = Math.abs(hours);
        if (hours >= 24)
        {
            this.hours = hours % 24;
        }
        else
        {
            this.hours = hours;
        }
    }

    public int toMinutes()
    {
        return ((this.getHours()*60) + this.getMinutes());
    }

    public boolean equals(Time time) {
        return this.getHours() == time.getHours() && this.getMinutes() == time.getMinutes();
    }

    public int compareTo(Time time)
    {
        return this.toMinutes() - time.toMinutes();
    }
}
