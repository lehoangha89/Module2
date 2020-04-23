package CaseStudy.Controllers;

import CaseStudy.Models.Villa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;


public class VillaCsv {
    TreeSet<String> listVillaNotDuplicate = new TreeSet<>();
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "id,nameSevices,arenaUsed,retal,maxNumberOfPeople," +
            "typeOfRent,roomStandard,poolArena,numberOfFloors";


    private static final String fileVilla = "E:\\Codegym\\Module2\\FuramaResort\\src\\CaseStudy\\Data\\Villa.csv";

    public static void writeVillaCsv(ArrayList<Villa> listVilla){
        FileWriter fileWriter=null;
        try{
            fileWriter =new FileWriter(fileVilla);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa:listVilla){
                fileWriter.append(String.valueOf(villa.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getNameSevices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getArenaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRental()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTypeOfRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getPoolArena()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberOfFloors()));
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
    public static ArrayList<Villa> readVillaCsv(){
        BufferedReader bufferedReader=null;
        ArrayList<Villa> villaArrayList=new ArrayList<Villa>();

        Path path= Paths.get(fileVilla);
        if (!Files.exists(path)){
            try {
            Writer writer=new FileWriter(fileVilla);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            bufferedReader=new BufferedReader(new FileReader(fileVilla));
            while ((line=bufferedReader.readLine())!=null){
                String[] splitData=line.split(",");
                if (splitData[0].equals("id")){
                    continue;
                }
                Villa villa=new Villa();
                villa.setId(splitData[0]);
                villa.setNameSevices(splitData[1]);
                villa.setArenaUsed(Double.parseDouble(splitData[2]));
                villa.setRental(Integer.parseInt(splitData[3]));
                villa.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
                villa.setTypeOfRent(splitData[5]);
                villa.setRoomStandard(splitData[6]);
                villa.setPoolArena(Double.parseDouble(splitData[7]));
                villa.setNumberOfFloors(Integer.parseInt(splitData[8]));
                villaArrayList.add(villa);
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
        return villaArrayList;
    }
    public TreeSet<String> readCsvVillaNotDuplicate() throws IOException {
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileVilla));
        while ((line = bufferedReader.readLine()) != null) {
            String[] splitData = line.split(",");
            listVillaNotDuplicate.add(splitData[1]);
        }
        return listVillaNotDuplicate;
    }
}
