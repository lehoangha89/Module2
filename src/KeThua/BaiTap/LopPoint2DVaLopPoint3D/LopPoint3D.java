package KeThua.BaiTap.LopPoint2DVaLopPoint3D;

public class LopPoint3D extends LopPoint2D {
    private float z=0.0f;
    public LopPoint3D(){

    }

    public LopPoint3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.setX(x);
        this.setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        return new float[]{this.getX(),this.getY(),this.getZ()};
    }

    @Override
    public String toString() {
        return "LopPoint3D{" +
                "x="+this.getX()+
                "y="+this.getY()+
                "z=" + this.getZ() +
                " and array xyz: "+this.getXYZ()[0]+
                ", "+this.getXYZ()[1]+
                ", "+this.getXYZ()[2]+
                '}';
    }
}
