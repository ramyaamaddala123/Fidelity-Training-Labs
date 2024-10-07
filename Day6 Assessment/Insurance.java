package Day6Assessment;
import java.util.*;

public class Insurance {
    private String insuranceNo;
    private String insuranceName;
    private Double amountCovered;

    public Insurance(String insuranceNo, String insuranceName, Double amountCovered){
        this.insuranceNo = insuranceNo;
        this.insuranceName = insuranceName;
        this.amountCovered = amountCovered;
    }
    public String getInsuranceNo(){
        return insuranceNo;
    }
    public String getInsuranceName(){
        return insuranceName;
    }
    public Double getAmountCovered(){
        return amountCovered;
    }
}
class MotorInsurance extends Insurance{
    private Double idv;
    private Float depPercent;

    public MotorInsurance(String insuranceNo, String insuranceName, Double amountCovered, Float depPercent){
        super(insuranceNo, insuranceName, amountCovered);
        this.depPercent = depPercent;
        this.idv = amountCovered - ((amountCovered * depPercent) / 100);
    }
    public Double getIdv(){
        return idv;
    }
    public Float getDepPercent(){
        return depPercent;
    }
    public double calculatePremium(){
        return idv * 0.03;
    }
}
class LifeInsurance extends Insurance{
    private int policyTerm;
    private Float benefitPercent;

    public LifeInsurance(String insuranceNo, String insuranceName, Double amountCovered, int policyTerm, Float benefitPercent){
        super(insuranceNo, insuranceName, amountCovered);
        this.policyTerm = policyTerm;
        this.benefitPercent = benefitPercent;
    }
    public int getPolicyTerm(){
        return policyTerm;
    }
    public Float getBenefitPercent(){
        return benefitPercent;
    }
    public double calculatePremium(){
        return (getAmountCovered() - ((getAmountCovered() * benefitPercent) / 100 )) /policyTerm;
    }
}
class Program{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insurance Number : ");
        String insuranceNo = sc.nextLine();
        System.out.println("Insurance Name : ");
        String insuranceName = sc.nextLine();
        System.out.println("Amount Covered : ");
        Double amountCovered = sc.nextDouble();
        System.out.println("Select");
        System.out.println("1.Life Insurance");
        System.out.println("2.Motor Insurance");
        int option = sc.nextInt();

        if(option == 1){
            System.out.println("Policy Term : ");
            int policyTerm = sc.nextInt();
            System.out.println("Benefit Percent : ");
            Float benefitPercent = sc.nextFloat();

            LifeInsurance li = new LifeInsurance(insuranceNo, insuranceName, amountCovered, policyTerm, benefitPercent);
            double premium = li.calculatePremium();
            System.out.println("Calculated Premium : " +premium);
        }
        else if(option == 2){
            System.out.println("Depreciation Percent : ");
            Float depPercent = sc.nextFloat();
            MotorInsurance Mi = new MotorInsurance(insuranceNo, insuranceName, amountCovered, depPercent);
            double premium = Mi.calculatePremium();
            System.out.println("Calculated Premium : " +premium);
        }
        else{
            System.out.println("Invalid Option Selected");
        }
    }
}
