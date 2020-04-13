package LopVaDoiTuongTrongJava.BaiTap;

public class XayDungLopFan {
    private final int slow=1;
    private final int medium=2;
    private final int fast=3;
    int speed;
    boolean isOn=false;
    double radius=5;
    String color="blue";
    private XayDungLopFan(int speed, boolean isOn, double radius, String color){
        this.speed=speed;
        this.isOn=isOn;
        this.radius=radius;
        this.color=color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   public XayDungLopFan(){
   }

    @Override
    public String toString() {
        if (this.isOn==true){
        return "1. Speed of fan: "+getSpeed()
                +"\n2.Radius of fan: "+getRadius()
                +"\n3.Color of fan: "+getColor()
                +"\nFan is on ";
    }else {
            return "1.Speed of fan: "+getSpeed()
                    +"\n2.Radius of fan: "+getRadius()
                    +"\n3.Color of fan: "+getColor()
                    +"\n4.Fan is off ";
        }
    }

    public static void main(String[] args) {
        int slow=1;
        int medium=2;
        int fast=3;
        XayDungLopFan Fan1=new XayDungLopFan();
        Fan1.setSpeed(fast);
        Fan1.setOn(true);
        Fan1.setRadius(10);
        Fan1.setColor("Yellow");
        System.out.println(Fan1);
        XayDungLopFan Fan2=new XayDungLopFan();
        Fan2.setSpeed(medium);
        Fan2.setOn(false);
        Fan2.setColor("Blue");
        Fan2.setRadius(5);
        System.out.println(Fan2);
    }
}



