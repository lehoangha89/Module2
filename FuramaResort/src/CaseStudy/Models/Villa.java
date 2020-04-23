package CaseStudy.Models;

public class Villa extends Services {
    private String roomStandard;
    private double poolArena;
    private int numberOfFloors;
    public String descriptionOfOtherAmenities;

    public Villa() {
    }

    public Villa(String id, String nameSevices, double arenaUsed, int rental, int maxNumberOfPeople,
                 String typeOfRent, String roomStandard, double poolArena, int numberOfFloors) {
        super(id, nameSevices, arenaUsed, rental, maxNumberOfPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.poolArena = poolArena;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArena() {
        return poolArena;
    }

    public void setPoolArena(double poolArena) {
        this.poolArena = poolArena;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public String getDescriptionOfOtherAmenities(){
        return this.getAccompaniedService();
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
                +"8. Diện tích hồ bơi: "+this.getPoolArena()+"\n"
                +"9. Số tầng: "+this.getNumberOfFloors()+"\n"
                +"10. Mô tả tiện nghi khác: "+this.getDescriptionOfOtherAmenities();
    }
}
