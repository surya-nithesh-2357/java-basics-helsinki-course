

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
        printFromNumberToOne(2);
    }

    public static void printFromNumberToOne (int num){
        while(num >=1){
            System.out.println(num);
            num--;
        }
    }

}
