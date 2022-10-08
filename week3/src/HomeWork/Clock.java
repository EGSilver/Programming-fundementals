package HomeWork;

public class Clock {
    private Counter hour;
    private Counter minute;
    private Counter second;

 public Clock (int hour, int minute, int second) {
     this.hour = new Counter(hour,23);
     this.minute = new Counter(minute,59);
     this.second = new Counter(second,59);
 }

    public void raiseHour() {
     if (this.hour.getNumber() == this.hour.getMaxNumber()) {
         this.hour.setNumber(0);
     } else {
         this.hour.setNumber(this.hour.getNumber()+1);
     }
 }

    public void raiseMinute() {
        if (this.minute.getNumber() == this.minute.getMaxNumber()) {
            this.minute.setNumber(0);
            raiseHour();
        } else {
            this.minute.setNumber(this.minute.getNumber()+1);
        }
    }

    public void raiseSecond() {
            if (this.second.getNumber() == this.second.getMaxNumber()) {
                this.second.setNumber(0);
                raiseMinute();
            } else {
                this.second.setNumber(this.second.getNumber()+1);
            }
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
