public class Shelter {
    private int defenseLevel;
    private int numberOfSupplies;

    public Shelter(int defenseLevel, int numberOfSupplies){
        this.defenseLevel = defenseLevel;
        this.numberOfSupplies = numberOfSupplies;
    }
    public int getDefenseLevel(){
        return defenseLevel;
    }
    public void setDefenseLevel(int pDefense){
        this.defenseLevel = pDefense;
    }
    public int getNumberOfSupplies(){
        return numberOfSupplies;
    }
    public void setNumberOfSupplies(int pSupplies){
        this.numberOfSupplies = pSupplies;
    }

    public void printInfo(){
        System.out.println("Defense Level: " + defenseLevel);
        System.out.println("Number of Supplies: " + numberOfSupplies);
    }
}
