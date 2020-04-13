package KeThua.BaiTap.LopPoint2DVaLopPoint3D;

public class LopPoint2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public LopPoint2D() {

    }

    public LopPoint2D(float x, float y) {
        this.x = x;
        this.y = y;
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
        return "LopPoint2D{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", and array xy: "+
                this.getXY()[0]+
                ", "+this.getXY()[1]+
                '}';
    }
}
