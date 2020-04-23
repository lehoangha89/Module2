package CaseStudy.Models;

public class Room extends Services {
    private String FreeServiceIncluded="Nước miễn phí";

    public Room() {
    }

    public Room(String id, String nameSevices, double arenaUsed, int rental, int maxNumberOfPeople,
                String typeOfRent, String freeServiceIncluded) {
        super(id, nameSevices, arenaUsed, rental, maxNumberOfPeople, typeOfRent);
        FreeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return FreeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        FreeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String showInfor() {
        return "1. Mã dịch vụ: "+super.getId()+"\n"
                +"2. Tên dịch vụ: "+super.getNameSevices()+"\n"
                +"3. Diện tích sử dụng: "+super.getArenaUsed()+"\n"
                +"4. Chi phí thuê: "+super.getRental()+"\n"
                +"5. Số người tối đa: "+super.getMaxNumberOfPeople()+"\n"
                +"6. Kiểu thuê: "+super.getTypeOfRent()+"\n"
                +"8. Dịch vụ miễn phí đi kèm: "+this.getFreeServiceIncluded()+"\n";

    }
}
