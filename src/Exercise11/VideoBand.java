package Exercise11;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class VideoBand {
    private Duration length;
    private Duration usedUpSpace;

    // om du inte använt ngt space ännu
    public VideoBand(Duration length) {
        this.length = length;
    }

    // om man har använt space
    public VideoBand(Duration length, Duration usedUpSpace) {
        this.length = length;
        this.usedUpSpace = usedUpSpace;
    }

    public void setLengthOfTape(Duration length) {
        this.length = length;
    }

    public Duration getLength() {
        return length;
    }

    public void setLength(Duration length) {
        this.length = length;
    }

    public Duration getUsedUpSpace() {
        return usedUpSpace;
    }

    public void setUsedUpSpace(Duration usedUpSpace) {
        this.usedUpSpace = usedUpSpace;
    }

    public long calcTimeOfRecordingInMinutes(LocalTime start, LocalTime end) {
        return Duration.between(start, end).toMinutes();
    }

    public long getRemainder(long minutes) {
        return length.toMinutes() - minutes;
    }
}
