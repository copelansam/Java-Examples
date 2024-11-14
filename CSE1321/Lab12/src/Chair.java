public class Chair {
    int legs = 0;
    boolean rolling = false;
    String material;

    Chair (int x, boolean y, String z){
        legs = x;
        rolling = y;
        material = z;
    }

    String statsRoll (boolean rolling){
        if (rolling){
            //System.out.print("rolling");
            return "rolling";
        }
        else if (!rolling){
            //System.out.print("not rolling");
            return "not rolling";
        }
        return "rolling";
    }
}
