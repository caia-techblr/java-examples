enum TimePeriod { AM, PM }
enum PartOfDay { MORNING, AFTERNOON, EVENING, NIGHT }

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int totalNumberOfSeconds() {   //elapsed seconds since midnight
        return hour * 3600 + minute * 60 + second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandardString() {
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String period = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }
    
    public TimePeriod getTimePeriod() {
        return (hour < 12) ? TimePeriod.AM : TimePeriod.PM;
    }
    public PartOfDay getPartOfDay() {
        if (hour >= 5 && hour < 12) {
            return PartOfDay.MORNING;
        } else if (hour >= 12 && hour < 17) {
            return PartOfDay.AFTERNOON;
        } else if (hour >= 17 && hour < 21) {
            return PartOfDay.EVENING;
        } else {
            return PartOfDay.NIGHT;
        }
    }   

    @Override
    public String toString() {
        return toUniversalString();
    }
}
