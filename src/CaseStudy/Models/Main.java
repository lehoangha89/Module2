package CaseStudy.Models;

public class Main {
    public static void main(String[] args) {
        Services villa=new Villa("1","sdf",43.3,345,
                9,"month","vip",54.5,2);
        System.out.println(villa.showInfor());
    }
}
