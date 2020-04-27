package CaseStudy.Controllers;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class TestCSVReader {
    public static void main(String[] args) throws IOException {
        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader("src/Data/Test.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String[]> allData = csvReader.readAll();

        for(String[] data : allData)
        {
            for(String s : data)
            {
                System.out.print(s+";");
            }
            System.out.println();
        }

        csvReader.close();
    }
}
