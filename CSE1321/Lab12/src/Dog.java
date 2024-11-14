public class Dog {
    int age;
    double weight;


    String name, breed, color;

    Dog (int a, double b, String c, String d, String e){
        age =  a;
        weight = b;
        name = c;
        color = d;
        breed = e;
    }

    String bark (){
        return "Woof! Woof!";
    }

    void eat (double x){
        double feed = x;
        weight += feed;

    }


}
