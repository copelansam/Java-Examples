import java.util.Scanner;
public class Driver {
    public static int convertTime(String time) throws InvalidTimeException, Exception{
        String[] times = time.split(":",3);
        if (times.length != 3){
            throw new Exception("Enter a valid time");
        }
        int hours = Integer.parseInt(times[0]);
        int minutes = Integer.parseInt(times[1]);
        int second = Integer.parseInt(times[2]);
        if (hours > 23){
            throw new InvalidTimeException("Hour must be below 24");
        }
        else if (hours < 0){
            throw new InvalidTimeException("Hour must be positive");
        }
        if (minutes > 59){
            throw new InvalidTimeException("Minutes must be less than 60");
        }
        else if (minutes < 0){
            throw new InvalidTimeException("Minutes must be positive");
        }
        if (second > 59){
            throw new InvalidTimeException("Seconds must be less than 60");
        }
        else if (second < 0){
            throw new InvalidTimeException("Seconds must be positive");
        }
        return (hours * 60 * 60) + (minutes * 60) + second;


    }

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            String time1 = scan.nextLine();
            int time1Seconds = convertTime(time1);
            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            String time2 = scan.nextLine();
            int time2Seconds = convertTime(time2);
            int timeDifference = Math.abs(time1Seconds - time2Seconds);
            System.out.println("Difference in Seconds: " + timeDifference);
        }
        catch(InvalidTimeException e){
            System.err.println(e.getMessage());
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
