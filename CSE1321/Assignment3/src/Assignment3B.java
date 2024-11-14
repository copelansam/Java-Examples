import java.util.Scanner;
public class Assignment3B {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int width, height, fileSize, bpc ;
        System.out.println("[Image Encoding Checker]");
        System.out.print("What is the image width? ");
        width = sc.nextInt();
        System.out.print("What is the image height? ");
        height = sc.nextInt();
        System.out.print("What is the file size (in bytes)? ");
        fileSize = sc.nextInt();

        if (width <= 0 || height <= 0 || fileSize < 0) {
            System.out.println("The information is invalid - Please re-enter it.");
        }
        else {
            bpc = fileSize/(width * height);
            if (fileSize % (width * height) != 0){
                System.out.println("The information is invalid - Please re-enter it.");
            }
            else{
                switch (bpc){
                    case 4: System.out.println("The RGBA image is encoded with 8 bits per channel.");
                    break;
                    case 8: System.out.println("The RGBA image is encoded with 16 bits per channel.");
                    break;
                    case 16: System.out.println("The RGBA image is encoded with 32 bits per channel.");
                    break;
                    default: System.out.println("The BPC falls outside of the range that this computer can read.");
                    break;


                }


            }
        }
    }

}
