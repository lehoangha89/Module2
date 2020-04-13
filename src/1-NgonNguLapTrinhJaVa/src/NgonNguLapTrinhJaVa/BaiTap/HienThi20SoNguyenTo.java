package NgonNguLapTrinhJaVa.BaiTap;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int number=2;
        int count=0;
        while (count<20){
            boolean check=true;
            for (int i=2;i<number;i++){
                if (number%i==0){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.println(count+" Số nguyên tố: "+number);
                count++;
            }
            number++;
        }
    }
}
