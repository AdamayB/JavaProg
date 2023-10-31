public class Precedence_operator_challenge {
    public static void main(String[] args) {
        double n1=20.00;
        double n2=80.00;
        double remainder=((n1+n2)*100)%40;
        boolean ans= remainder==0?true:false;
        System.out.println(ans);
        String s= ans==true?"No Remainder":"There is a remainder";
        System.out.println(s);
    }
    
}
