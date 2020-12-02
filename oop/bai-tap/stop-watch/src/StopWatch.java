public class StopWatch {
    private long starTime, endTime;

    public StopWatch() {
        starTime = System.currentTimeMillis();
        // 1000000
    }

    public long getStarTime() {
        return this.starTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setStarTime(long starTime) {
        this.starTime = starTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.starTime = System.currentTimeMillis();

    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.starTime;
    }
}
