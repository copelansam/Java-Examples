public class Complaint {
    private String causeOfAction;
    private String plaintiffCitizenship;
    private String defendantCitizenship;
    private String origianalStateOfFiling;
    private double amountInControversy;
    private int id;
    private static int nextId = 1;

    public String getCauseOfAction(){
        return causeOfAction;
    }
    public String getPlaintiffCitizenship(){
        return plaintiffCitizenship;
    }
    public String getDefendantCitizenship(){
        return defendantCitizenship;
    }
    public String getOrigianalStateOfFiling(){
        return origianalStateOfFiling;
    }
    public double getAmountInControversy(){
        return amountInControversy;
    }
    public int getId(){
        return id;
    }
    public Complaint(String causeOfAction, String plaintiffCitizenship, String defendantCitizenship, String origianalStateOfFiling, double amountInControversy){
        this.amountInControversy = amountInControversy;
        this.causeOfAction = causeOfAction;
        this.defendantCitizenship = defendantCitizenship;
        this.plaintiffCitizenship = plaintiffCitizenship;
        this.origianalStateOfFiling = origianalStateOfFiling;
        id = nextId++;
    }
    @Override
    public String toString(){
        return "Case ID: " + getId()
                +"\nCause of Action: " + getCauseOfAction()
                +"\nAmount in controversy: $" + getAmountInControversy()
                +"\nPlaintiff's citizenship: " + getPlaintiffCitizenship()
                +"\nDefendant's citizenship: " + getDefendantCitizenship()
                +"\nOriginally filled in: " + getOrigianalStateOfFiling();
    }

}
