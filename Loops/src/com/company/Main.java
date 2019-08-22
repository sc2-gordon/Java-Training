package com.company;

public class Main {

    public static void main(String[] args) {
//        for (double i=8;i>3;i--) {
//            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
//        }

//        for (int i=4; i<27; i++){
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }

//        int count = 0;
//        int sum = 0;
//        for(int i=1;i<1001;i++){
//            if(i%3==0 && i%5==0){
//                System.out.println(i);
//                sum+=i;
//                count++;
//                if(count==5){
//                    break;
//                }
//            }
//        }
//        System.out.println(sum);

//        System.out.println(sumOdd(4,57));
//        int count = 1;
//        do {
//            System.out.println(count);
//            count++;
//
//            if(count>100){
//                break;
//            }
//        } while (count!=6);

//        int number = 4;
//        int finishNumber = 22;
//        int count = 0;
//        int sum = 0;
//
//        while(number<=finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println(number);
//            sum+= number;
//            count++;
//            if(count == 5){
//                break;
//            }
//        }
//        System.out.println(sum);

        System.out.println(sumDigits(2551));
    }

//    public static double calculateInterest(double amount, double interestRate){
//            return(amount *(interestRate/100));
//    }
//
//    public static boolean isPrime(int n){
//        if(n==1){
//            return false;
//        }
//
//        for(int i=2; i<= n/2; i++){
//            if(n%i == 0){
//                return false;
//            }
//        }
//        return true;
//    }

//    public static boolean isOdd(int number){
//        if(number<=0){
//            return false;
//        } else if(number%2!=0){
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static int sumOdd(int start, int end){
//        int sum = 0;
//        if(end<start || start<0 || end<0){
//            return -1;
//        }
//        for(int i=start;i<=end;i++){
//            if(isOdd(i)){
//                sum+=i;
//            }
//        }
//        return sum;
//    }

//    public static boolean isEvenNumber(int number){
//        if(number%2==0){
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static int sumDigits(int number){
        int sum = 0;
        if(number >= 10){
            while(number>0){
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            return sum;
        } else {
            return -1;
        }
    }
}
