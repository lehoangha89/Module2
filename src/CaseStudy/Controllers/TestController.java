package CaseStudy.Controllers;

import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;

public class TestController {
    public static void main(String[] args) {
        Services villa=new Villa("1","ád",32.4,45.6,9,"month",
                "vip","karaoke",33.0,2);
        villa.showInfor();
    }
}
