public class Main {
        public static void main(String[] args){
            int num1 = 100;
            int num2 = 50;
            System.out.println("Number 1: "+num1);
            System.out.println("Number 2:"+num2);

            System.out.println("Multiplication: "+multiply(num1,num2));
            System.out.println("Summation: "+sum(num1,num2));
            System.out.println("Substraction: "+sub(num1,num2));
            System.out.println("Division: "+div(num1,num2));
        }
        public static void printName(String name){
            System.out.println("Hello "+name);
        }
        public static int multiply(int num1, int num2){
            return num1*num2;
        }
        public static int sum(int num1, int num2){
            return num1+num2;
        }
        public static int div(int num1, int num2){
            return num1/num2;
        }
        public static int sub(int num1, int num2){
            return num1-num2;
        }
}
