import java.util.Scanner;
import java.io.*;
public class Driver {
    public static void processComplaint(Complaint c) throws StateComplaintException{
        if (c.getCauseOfAction().equals("Equal Protection Challenge")
                || c.getCauseOfAction().equals("Title IX Workplace Discrimination")
                || c.getCauseOfAction().equals("Prisoner Civil Rights Claim")
                || c.getCauseOfAction().equals("Fair Labor Standard Act Claim")){
            return;
        }
        else if(c.getDefendantCitizenship().equals(c.getPlaintiffCitizenship())){
            throw new StateComplaintException("Lack of Diversity");
        }
        else if (c.getAmountInControversy() <=75000.00){
            throw new StateComplaintException("Amount in controversy less than or equal to $75000");
        }
        else if (c.getDefendantCitizenship().equals(c.getOrigianalStateOfFiling())){
            throw new StateComplaintException("No prejudice through diversity");
        }
    }

    public static void main(String[] args){
        Scanner userScan = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = userScan.nextLine();
        Scanner fileScan = null;
        File complaints = new File(fileName);
        String lines = "";
        Complaint adding = null;
        PrintWriter pwApproved = null;
        PrintWriter pwRejected = null;
        FileOutputStream fosApproved = null;
        FileOutputStream fosRejected = null;

        try{
            File approved = new File("accepted.txt");
            approved.createNewFile();
            File rejected = new File("remanded.txt");
            rejected.createNewFile();
            fileScan = new Scanner(complaints);
            fosApproved = new FileOutputStream(approved);
            fosRejected = new FileOutputStream(rejected);
            pwApproved = new PrintWriter(fosApproved);
            pwRejected = new PrintWriter(fosRejected);
            while (fileScan.hasNextLine()) {
                try {
                    String complaintLine = fileScan.nextLine();
                    String[] complaintProcess = complaintLine.split(",");
                    adding = new Complaint(complaintProcess[0], complaintProcess[2],
                            complaintProcess[3], complaintProcess[4], Double.parseDouble(complaintProcess[1]));
                    lines = adding.toString();
                    processComplaint(adding);
                    lines += "\n==============================";
                    pwApproved.println(lines);
                    pwApproved.flush();
                }
                catch(StateComplaintException e){
                    lines = adding.toString() + "\n\nReason for remand: " + e.getMessage()
                            +"\n==============================";
                    pwRejected.println(lines);
                    pwRejected.flush();
                }
            }
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
