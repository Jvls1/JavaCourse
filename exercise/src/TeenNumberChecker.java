public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }
    public static boolean hasTeen(int n1, int n2, int n3) {
        if((n1>=13 && n1<=19) ||(n2>=13 && n2<=19) || (n3>=13 && n3<=19)){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isTeen(int n){
        if(n>=13 && n<=19){
            return true;
        }else {
            return false;
        }
    }
}