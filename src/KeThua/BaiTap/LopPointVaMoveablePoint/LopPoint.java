package KeThua.BaiTap.LopPointVaMoveablePoint;

public class LopPoint {
    private float x=0.0f;
    private float y=0.0f;
    public LopPoint(){

    }

    public LopPoint(float x,float y) {
        this.x = x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        return new float[]{this.getX(),this.getY()};
    }

    @Override
    public String toString() {
        return "LopPoint{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", and array xy: "+this.getXY()[0]+
                ", "+this.getXY()[1]+
                '}';
    }
}
