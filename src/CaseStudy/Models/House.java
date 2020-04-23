package CaseStudy.Models;

public class House extends Services {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String id, String nameSevices, double arenaUsed, int rental,
                 int maxNumberOfPeople, String typeOfRent, String roomStandard, int numberOfFloors) {
        super(id, nameSevices, arenaUsed, rental, maxNumberOfPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfor() {
        return "1. Mã dịch vụ: "+super.getId()+"\n"
                +"2. Tên dịch vụ: "+super.getNameSevices()+"\n"
                +"3. Diện tích sử dụng: "+super.getArenaUsed()+"\n"
                +"4. Chi phí thuê: "+super.getRental()+"\n"
                +"5. Số người tối đa: "+super.getMaxNumberOfPeople()+"\n"
                +"6. Kiểu thuê: "+super.getTypeOfRent()+"\n"
                +"7. Tiêu chuẩn phòng: "+this.getRoomStandard()+"\n"
                +"8. Số tầng: "+this.getNumberOfFloors()+"\n";
    }
}
