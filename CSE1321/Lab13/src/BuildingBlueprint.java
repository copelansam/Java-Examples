public class BuildingBlueprint {
    private int story;
    private int apartment;
    private float occupancy;
    private boolean full;

    BuildingBlueprint(int a, int b, float c, boolean d){
        story = a;
        apartment = b;
        occupancy = c;
        full = d;

    }

    BuildingBlueprint(int a, int b, float c){
        story = a;
        apartment = b;
        occupancy = c;
        if (occupancy == 1.0){
            full = true;
        }
        else{
            full = false;
        }
    }

    int storyStat(){
        return story;
    }

    int apartmentStat(){
        return apartment;
    }

    int occupancyStat(){
        int rate = (int) occupancy * 100;
        return rate;
    }

    boolean fullStat(){
        return full;
    }

    void occupancyChange(float a){
        occupancy = a;
    }
}
