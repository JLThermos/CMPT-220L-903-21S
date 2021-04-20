package base;

public class Plant {
    boolean hasSun;
    boolean needsWatering;
    String plantFamily;
    String Name;



    public void wateringInstructions(boolean needsWatering, String plantFamily, String Name) {
        this.needsWatering = needsWatering;

        if (needsWatering) {
            System.out.println("This plant named " + Name + " in the " + plantFamily + " plant family needs some water.");

        } else {
            System.out.println("This plant named " + Name + " in the " + plantFamily + " does not need any more water.");
        }






    }

    public void sunlightRequirements(boolean hasSun, String plantFamily, String Name) {
        this.hasSun = hasSun;


        if (hasSun) {
            System.out.println("This plant named " + Name + " in the " + plantFamily + " plant family has enough sunlight.");

        } else {
            System.out.println("This plant named " + Name + " in the " + plantFamily + " plant family needs some some more sunlight.");

        }
    }
}

