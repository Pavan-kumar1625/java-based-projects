import java.util.Scanner;  // import util package
public class Calculator{   // Calculator class
    public static void main(String[] args){  // main function
        Scanner sc = new Scanner(System.in);  // scanner obj creation
        double num1 , num2 , result;          // variable create
        char operator;

        System.out.println("Enter num1 : ");   // take input from user
        num1 = sc.nextDouble();
        System.out.println("Enter operator : ");  // take operator input from user
        operator = sc.next().charAt(0);
        System.out.println("Enter num2 : ");
        num2 = sc.nextDouble();

        switch(operator){          // use of swith statement
            case '+':              // case use
                result = num1 + num2;
                System.out.println("sum is : " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("subtract is : " + result);
                break;
            case '*':                          //case use
                result = num1*num2;
                System.out.println("multiply is : " + result);
                break;
            case '/':
                if(num2>=1){
                    result = num1/num2;
                    System.out.println("Division is : " + result);
                    break;
                }else{
                    System.out.println("num2 should not be zero");
                    break;
                }
            default:                // default condition
                System.out.println("Enter valid operator and try again");
                break;
        }
        sc.close();         // close the scanner object
    }


}
