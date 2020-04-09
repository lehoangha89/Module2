package NgonNguLapTrinhJaVa.BaiTap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int num=100;
        int count=2;
        while (count<num){
            boolean check=false;
            for (int i=2;i<count;i++){
                if(count%i==0){
                    check=true;
                    break;
                }
            }

            if (!check){
                System.out.println(count);
            }
            count++;
        }

    }
}
