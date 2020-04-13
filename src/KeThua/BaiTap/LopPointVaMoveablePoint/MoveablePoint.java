package KeThua.BaiTap.LopPointVaMoveablePoint;

public class MoveablePoint extends LopPoint {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public MoveablePoint(){

    }

    public MoveablePoint(float x, float y, float xSpeed,float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.getxSpeed(),this.getySpeed()};
    }
    public MoveablePoint move(){
        this.setX(this.getX()+this.getxSpeed());
        this.setY(this.getY()+this.getySpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint(" +
                "xSpeed=" + this.getxSpeed() +
                ", ySpeed=" + this.getySpeed() +
                "speed= "+this.getxSpeed()+","+this.getySpeed()+
                ')';
    }
}
