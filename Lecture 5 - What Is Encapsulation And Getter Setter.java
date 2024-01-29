package winterpep_github;
// Lecture 5 - What Is Encapsulation And Getter Setters
public class lecture5 {
    public static void main(String[] args) {
    Amazon customer = new Amazon();
    float payableAmount=customer.Transaction(1500);
        System.out.println("Total Payable: "+payableAmount);

        /*
        public String iAmAccessibleEverywhere
        private String iAmAccessibleOnlyhere
        protected String iAmAccessibleToDerivedClasses
        String iAmAccessibleToAllClassInSamePackage
         */
    }
}
class Gpay{
    // making the variable private is encapsulation or data hiding
    private float txnCharge=0.05f;

    public void setTxnCharge(float newCharge){
        txnCharge=newCharge;
        if (newCharge<=5){
            System.out.println("Invalid TxtCharge");
            return;
        }
    }
    public float getTxnCharge(){
        return txnCharge;
    }
}
class Amazon{

    float Transaction(float amt) {
        Gpay gpayobject = new Gpay();

        gpayobject.setTxnCharge(0.07f);

        float totalAmount=amt+ (amt* gpayobject.getTxnCharge());
        return totalAmount;
    }
}
