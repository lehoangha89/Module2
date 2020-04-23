package CaseStudy.Controllers;


import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

public class RoomCSV {
    TreeSet<String> listRoomNotDuplicate = new TreeSet<>();
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "id,nameSevices,arenaUsed,retal,maxNumberOfPeople," +
            "typeOfRent,freeServiceIncluded";
    private static final String fileRoom = "E:\\Codegym\\Module2\\FuramaResort\\src\\CaseStudy\\Data/Room.csv";
    public static void writeRoomCsv(ArrayList<Room> listRoom){
        FileWriter fileWriter=null;
        try{
            fileWriter =new FileWriter(fileRoom);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room:listRoom){
                fileWriter.append(String.valueOf(room.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getNameSevices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getArenaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getRental()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getTypeOfRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getFreeServiceIncluded());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        }catch (Exception ex){
            System.out.println("Error in CsvFileWriter !!! ");
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception ex){
                System.out.println("Error while flushing/closing fileWriter !!! ");
            }
        }
    }
    public static ArrayList<Room> readRoomCsv(){
        BufferedReader bufferedReader=null;
        ArrayList<Room> roomArrayList=new ArrayList<Room>();
        Path path= Paths.get(fileRoom);
        if (!Files.exists(path)){
            try {
                Writer writer=new FileWriter(fileRoom);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            bufferedReader=new BufferedReader(new FileReader(fileRoom));
            while ((line=bufferedReader.readLine())!=null){
                String[] splitData=line.split(",");
                if (splitData[0].equals("id")){
                    continue;
                }
                Room room=new Room();
                room.setId(splitData[0]);
                room.setNameSevices(splitData[1]);
                room.setArenaUsed(Double.parseDouble(splitData[2]));
                room.setRental(Integer.parseInt(splitData[3]));
                room.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
                room.setTypeOfRent(splitData[5]);
                room.setFreeServiceIncluded(splitData[6]);
                roomArrayList.add(room);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            try {
                bufferedReader.close();
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        return roomArrayList;
    }
    public TreeSet<String> readCsvRoomNotDuplicate() throws IOException {
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRoom));
        while ((line = bufferedReader.readLine()) != null) {
            String[] splitData = line.split(",");
            listRoomNotDuplicate.add(splitData[1]);
        }
        return listRoomNotDuplicate;
    }
}
