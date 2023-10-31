public class methods_prac {
    public static void main(String[] args) {
        double third=15d;
        findAvg(3d,4d,third);
        int diff=findDiff(9, 4);
        System.out.println(diff);
    }
    public static void findAvg(double a,double b, double c){
        double avg=(a+b+c)/3;
        System.out.println(avg);
    }

    public static int findDiff(int a, int b){
        int avg=a-b;
        return avg;
    }
}
