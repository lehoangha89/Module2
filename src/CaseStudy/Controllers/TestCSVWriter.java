package CaseStudy.Controllers;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestCSVWriter {
    public static void main(String[] args) throws IOException {
        String csv = "src/Data/Test.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));

        String[] header= new String[]{"Name","Age","Salary","Address"};
        writer.writeNext(header);

        List<String[]> allData = new ArrayList<String[]>();
        for(int i=0;i<3;i++)
        {
            String[] data = new String[]{"Blogger"+i,"20"+i,"20.0002",i+" World Wide Web"};
            allData.add(data);
        }

        writer.writeAll(allData);
        writer.close();

    }
}

