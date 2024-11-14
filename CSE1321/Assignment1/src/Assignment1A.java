import java.util.Scanner;
public class Assignment1A {
    public static void main (String[] args){
        String scheme, subdomain, domain2, domain1, subdirect;
        System.out.println("Were going to create a website URL!");
        System.out.print("Please enter the website's scheme: ");
        Scanner sc = new Scanner (System.in);
        scheme = sc.nextLine();

        System.out.print("Please enter the website's subdomain: ");
        subdomain  = sc.nextLine();

        System.out.print("Please enter the website's second-level domain: ");
        domain2  = sc.nextLine();

        System.out.print("Please enter the website's top-level Domain: ");
        domain1  = sc.nextLine();

        System.out.print("Please enter the website's subdirectory: ");
        subdirect  = sc.nextLine();

        System.out.println("You have created the following website:");
        System.out.println(scheme + ".//" + subdomain +"." + domain2 + "." + domain1 + "/" + subdirect);

    }
}
