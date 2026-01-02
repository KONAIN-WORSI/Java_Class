package week_8;


/**
 * Write a description of class GymMemberNepal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GymMemberNepal
{
    String memberName;
    String membershipType;
    double monthlyFee;
    int joinTime;
    static final double VAT_PERCENT = 0.13;
    
    
    
    public GymMemberNepal(String memberName, String membershipType, double monthlyFee, int joinTime) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.monthlyFee = monthlyFee;
        this.joinTime = joinTime;
    }
    
    public double calculateAnnualFee() {
        return (monthlyFee + (monthlyFee * VAT_PERCENT)) * 12;
    }
    
    public double getDiscountedFee(double discountPercent) {
        return monthlyFee * discountPercent;
    }
    
    public boolean isEligibleForDiscount() {
        return joinTime >= 6;
    }
    
    public void dsiplayMemberInfo() {
        System.out.println("Member Name: " + this.memberName);
        System.out.println("Membership Type: " + this.membershipType);
        System.out.println("Monthly Fee: " + this.monthlyFee);
        System.out.println("Join Time(months): " + this.joinTime);
    }
    
    public static void main(String[] args) {
        GymMemberNepal member = new GymMemberNepal("Siddhartha", "Monthly", 5000, 10);
        
        System.out.println(member.calculateAnnualFee());
        System.out.println(member.getDiscountedFee(0.10));
        System.out.println(member.isEligibleForDiscount());
        member.dsiplayMemberInfo();
        
    }  
}