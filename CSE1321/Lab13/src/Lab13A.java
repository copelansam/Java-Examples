public class Lab13A {
    public static void main (String [] args) {
        BuildingBlueprint buildingOne = new BuildingBlueprint(10, 20, 1.0f, true);
        BuildingBlueprint buildingTwo = new BuildingBlueprint(30, 30, 0.75f);
        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + buildingOne.storyStat() + " floors, " + buildingOne.apartmentStat() + " apartments, and is " + buildingOne.occupancyStat() + "% occupied. Full? " + buildingOne.fullStat());
        System.out.println("Building 2 has " + buildingTwo.storyStat() + " floors, " + buildingTwo.apartmentStat() + " apartments, and is " + buildingTwo.occupancyStat() + "% occupied. Full? " + buildingTwo.fullStat());
        System.out.println();
        System.out.println("Many years pass");
        System.out.println();
        buildingOne.occupancyChange(0.0f);
        buildingTwo.occupancyChange(1.0f);
        System.out.println("Year 2043:");
        System.out.println("Building 1 has " + buildingOne.storyStat() + " floors, " + buildingOne.apartmentStat() + " apartments, and is " + buildingOne.occupancyStat() + "% occupied. Full? " + buildingOne.fullStat());
        System.out.println("Building 2 has " + buildingTwo.storyStat() + " floors, " + buildingTwo.apartmentStat() + " apartments, and is " + buildingTwo.occupancyStat() + "% occupied. Full? " + buildingTwo.fullStat());
        System.out.println();
        System.out.println("Looks like people prefer taller buildings.");
    }
}
