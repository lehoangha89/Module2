package CaseStudy.Models;

public class MainModels {
    public static void main(String[] args) {
       Services villa=new Villa("1","tuan",34,234,12,
               "vip","vip",123,123);
       Services house=new House("2","alsad",123,32,123,
               "ád","vip",123);
       Services room=new Room("21","qd",23,12,56,"ỵt","cafe");
        System.out.println(villa.showInfor());
        System.out.println("----------------------");
        System.out.println(house.showInfor());
        System.out.println("----------------------");
        System.out.println(room.showInfor());

    }
}
