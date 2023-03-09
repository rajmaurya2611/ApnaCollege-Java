import java.util.*;
class Calculator{
    public static void main(String args[]){
        int a,b,res;
        char op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter Operation to be performed");
        op=sc.next().charAt(0);
        switch(op){
        case '+':
        res=a+b;
        System.out.println(res);
        break;
        case '-':
        res=a-b;
        System.out.println(res);
        break;
        case '*':
        res=a*b;
        System.out.println(res);
        break;
        case '/':
        res=a/b;
        System.out.println(res);
        break;
        case '%':
        res=a%b;
        System.out.println(res);
        break;
        default:
        System.out.println("Wrong Input");             
    }
}
}
