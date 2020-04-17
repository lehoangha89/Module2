package LopVaDoiTuongTrongJava.BaiTap.MainStopWatch;

public class StopWatch {
    private double startTime;
    private double endTime;
    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return (this.getStartTime() - this.getEndTime()) / 1000;
    }
}