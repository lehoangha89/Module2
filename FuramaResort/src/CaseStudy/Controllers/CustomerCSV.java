package CaseStudy.Controllers;

import CaseStudy.Models.Customer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CustomerCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "nameCustomer,birthday,gender,cmnd,phoneNumber,email,typeOfCustomer,address,services";


    private static final String fileCustomer = "E:\\Codegym\\Module2\\FuramaResort\\src\\CaseStudy\\Data\\Customers.csv";

    public static void writeCustomerCsv(ArrayList<Customer> listCustomer){
        FileWriter fileWriter=null;
        try{
            fileWriter =new FileWriter(fileCustomer);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer:listCustomer){
                fileWriter.append(customer.getNameCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getBirthday());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getCmnd()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getPhoneNumber()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeOfCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getServices()));
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
    public static ArrayList<Customer> readCustomerCsv(){
        BufferedReader bufferedReader=null;
        ArrayList<Customer> customerArrayList=new ArrayList<Customer>();
        Path path= Paths.get(fileCustomer);
        if (!Files.exists(path)){
            try {
                Writer writer=new FileWriter(fileCustomer);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            bufferedReader=new BufferedReader(new FileReader(fileCustomer));
            while ((line=bufferedReader.readLine())!=null){
                String[] splitData=line.split(",");
                if (splitData[0].equals("id")){
                    continue;
                }
                Customer customer=new Customer();
                customer.setNameCustomer(splitData[0]);
                customer.setBirthday(splitData[1]);
                customer.setGender(splitData[2]);
                customer.setCmnd(Integer.parseInt(splitData[3]));
                customer.setPhoneNumber(Integer.parseInt(splitData[4]));
                customer.setEmail(splitData[5]);
                customer.setTypeOfCustomer(splitData[6]);
                customer.setAddress(splitData[7]);
                customerArrayList.add(customer);
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
        return customerArrayList;
    }
}
