package CaseStudy.Controllers;


import CaseStudy.Models.House;
import CaseStudy.Models.Villa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

public class HouseCSV {
    TreeSet<String> listHouseNotDuplicate = new TreeSet<>();
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "id,nameSevices,arenaUsed,retal,maxNumberOfPeople," +
            "typeOfRent,roomStandard,numberOfFloors";


    private static final String fileHouse = "E:\\Codegym\\Module2\\FuramaResort\\src\\CaseStudy\\Data\\House.csv";

    public static void writeHouseCsv(ArrayList<House> listHouse){
        FileWriter fileWriter=null;
        try{
            fileWriter =new FileWriter(fileHouse);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house:listHouse){
                fileWriter.append(String.valueOf(house.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getNameSevices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getArenaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getRental()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getTypeOfRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getNumberOfFloors()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
    public static ArrayList<House> readHouseCsv(){
        BufferedReader bufferedReader=null;
        ArrayList<House> houseArrayList=new ArrayList<House>();
        Path path= Paths.get(fileHouse);
        if (!Files.exists(path)){
            try {
                Writer writer=new FileWriter(fileHouse);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            bufferedReader=new BufferedReader(new FileReader(fileHouse));
            while ((line=bufferedReader.readLine())!=null){
                String[] splitData=line.split(",");
                if (splitData[0].equals("id")){
                    continue;
                }
                House house=new House();
                house.setId(splitData[0]);
                house.setNameSevices(splitData[1]);
                house.setArenaUsed(Double.parseDouble(splitData[2]));
                house.setRental(Integer.parseInt(splitData[3]));
                house.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
                house.setTypeOfRent(splitData[5]);
                house.setRoomStandard(splitData[6]);
                house.setNumberOfFloors(Integer.parseInt(splitData[7]));
                houseArrayList.add(house);
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
        return houseArrayList;
    }
    public TreeSet<String> readCsvHouseNotDuplicate() throws IOException {
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileHouse));
        while ((line = bufferedReader.readLine()) != null) {
            String[] splitData = line.split(",");
            listHouseNotDuplicate.add(splitData[1]);
        }
        return listHouseNotDuplicate;
    }
}
