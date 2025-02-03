package partA.ex02;

public class SavingBond {
    public int bondLength;
    public double interest;
    public SavingBond(int x){
        bondLength = x;
        if( x < 12){
            interest = .005;
        }else if(x < 24){
            interest = .01;
        }
        else if(x < 36){
            interest = .015;
        }
        else if(x < 48){
            interest = .02;
        }
        else if(x < 61){
            interest = .025;
        }
        else{
            interest = .025;
        }
    }
}
