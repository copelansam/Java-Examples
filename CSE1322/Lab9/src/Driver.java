import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.*;

public class Driver{
    public static void main(String[] args){
        Scanner userScan = new Scanner (System.in);
        System.out.print("Enter the first file's name: ");
        String fileName1 = userScan.nextLine();
        System.out.print("Enter the second file's name: ");
        String fileName2 = userScan.nextLine();
        File file1 = new File(fileName1);
        File file2 = new File(fileName2);
        Scanner fileScan1 = null;
        Scanner fileScan2 = null;
        String total = "";
        int counter = 1;
        String line1 = "";
        String line2 = "";
        try{
            fileScan1 = new Scanner(file1);
            fileScan2 = new Scanner(file2);
            while(fileScan1.hasNextLine() && fileScan2.hasNextLine()){
                line1 = fileScan1.nextLine();
                line2 = fileScan2.nextLine();
                if (!line1.equals(line2)){
                    total += "Line " + counter +"\n<" + line1 +"\n>" + line2+"\n";
                }
                counter++;
            }
            if ((fileScan1.hasNextLine() && !fileScan2.hasNextLine())
                    || (!fileScan1.hasNextLine() && fileScan2.hasNextLine())){
                total += "\nFiles have different number of lines";
            }
            System.out.println(total);

        }
        catch(IOException e){
            System.err.print(e.getMessage());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        finally {
            fileScan1.close();
            fileScan2.close();
        }
    }
}