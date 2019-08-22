package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(isPalindrome(-1221));
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(getEvenDigitSum(-22));
//        System.out.println(hasSharedDigit(15,55));
//        System.out.println(hasSameLastDigit(9,99,999));
//        System.out.println(getGreatestCommonDivisor(81,153));
//        printFactors(-1);
//        System.out.println(isPerfectNumber(-1));
//        numberToWords(-12);
    }

//    public static boolean isPalindrome(int number){
//        int originalNumber = Math.abs(number);
//        number = Math.abs(number);
//        int reverse = 0;
//        int lastDigit = 0;
//        while(number > 0){
//            lastDigit = number%10;
//            reverse = reverse * 10;
//            reverse += lastDigit;
//            number /= 10;
//        }
//
//        if(originalNumber==reverse){
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public static int sumFirstAndLastDigit(int number){
//        int firstDigit = 0;
//        int lastDigit = number % 10;
//        if(number<0){
//            return -1;
//        } else {
//            while(number >= 10) {
//                number /= 10;
//                firstDigit = number;
//            }
//
//            if(firstDigit == 0){
//                lastDigit *= 2;
//            }
//            return firstDigit + lastDigit;
//        }
//    }

//    public static int getEvenDigitSum(int number){
//        int gather = 0;
//        int sum = 0;
//        if(number<0){
//            return -1;
//        } else{
//            while(number > 0){
//                gather = (number % 10);
//                if(gather % 2 == 0){
//                    sum += gather;
//                }
//                number /= 10;
//            }
//        }
//        return sum;
//    }

//    public static boolean hasSharedDigit(int x, int y){
//        int x1 = 0;
//        int x2 = 0;
//        int y1 = 0;
//        int y2 = 0;
//        if(x<10 || x>99 || y<10 || y>99){
//            return false;
//        } else {
//                x1 = x % 10;
//                x2 = x / 10;
//                y1 = y % 10;
//                y2 = y / 10;
//                if(x1 == y1 || x2 == y2 || x2 == y1 || x1 == y2){
//                    return true;
//                } else {
//                    return false;
//                }
//        }
//    }

//    public static boolean hasSameLastDigit(int x, int y, int z){
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        if(x<10 || x>1000 || y<10 || y>1000 || z<10 || z>1000){
//            return false;
//        } else {
//            a = x % 10;
//            b = y % 10;
//            c = z % 10;
//            if(a == b || b == c || a == c){
//                return true;
//            }  else {
//                return false;
//            }
//        }
//    }
//
//    public static boolean isValid(int num){
//        if(num<10 || num>1000){
//            return false;
//        } else {
//            return true;
//        }
//    }

//    public static int getGreatestCommonDivisor(int first, int second){
//        int lowestNumber = 0;
//        if(first<second){
//            lowestNumber = first;
//        } else if (second<first){
//            lowestNumber = second;
//        } else {
//            lowestNumber = first;
//        }
//
//        if(first<10 || second <10){
//            return -1;
//        } else {
//            for(int i=lowestNumber;i>0;i--){
//                if(first%i == 0 && second%i == 0){
//                    return i;
//                }
//            }
//            return -1;
//        }
//    }

//    public static void printFactors(int number){
//        if(number < 1){
//            System.out.println("Invalid Value");
//        } else {
//            for(int i=1;i<=number;i++){
//                if(number%i == 0){
//                    System.out.println(i);
//                }
//            }
//        }
//    }

//    public static boolean isPerfectNumber(int number){
//        int sum = 0;
//        if(number < 1){
//            return false;
//        }
//        for(int i=1;i<number;i++){
//            if(number%i == 0){
//                sum += i;
//            }
//        }
//        if(number == sum){
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public static void numberToWords(int number){
//        int digit = 0;
//        int reverseNumber = reverse(number);
//        int difference = getDigitCount(number) - getDigitCount(reverseNumber);
//        if(reverseNumber<0){
//            System.out.println("Invalid Value");
//        }
//        if(getDigitCount(number) == getDigitCount(reverseNumber)) {
//            if(reverseNumber == 0){
//                System.out.println("Zero");
//            }
//            while (reverseNumber > 0) {
//                digit = reverseNumber % 10;
//                switch (digit) {
//                    case 0:
//                        System.out.println("Zero");
//                        break;
//                    case 1:
//                        System.out.println("One");
//                        break;
//                    case 2:
//                        System.out.println("Two");break;
//                    case 3:
//                        System.out.println("Three");break;
//                    case 4:
//                        System.out.println("Four");break;
//                    case 5:
//                        System.out.println("Five");break;
//                    case 6:
//                        System.out.println("Six");break;
//                    case 7:
//                        System.out.println("Seven");break;
//                    case 8:
//                        System.out.println("Eight");break;
//                    case 9:
//                        System.out.println("Nine");break;
//                }
//                reverseNumber /= 10;
//            }
//        } else {
//            for(int i=getDigitCount(number);i>difference;i--){
//                digit = reverseNumber % 10;
//                switch (digit) {
//                    case 0:
//                        System.out.println("Zero");break;
//                    case 1:
//                        System.out.println("One");break;
//                    case 2:
//                        System.out.println("Two");break;
//                    case 3:
//                        System.out.println("Three");break;
//                    case 4:
//                        System.out.println("Four");break;
//                    case 5:
//                        System.out.println("Five");break;
//                    case 6:
//                        System.out.println("Six");break;
//                    case 7:
//                        System.out.println("Seven");break;
//                    case 8:
//                        System.out.println("Eight");break;
//                    case 9:
//                        System.out.println("Nine");break;
//                }
//                reverseNumber /= 10;
//            }
//            for(int i=difference;i>0;i--){
//                System.out.println("Zero");
//            }
//        }
//
//    }
//
//    public static int reverse(int num){
//        int reversed = 0;
//        while(num != 0) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//            num /= 10;
//        }
//        return reversed;
//    }
//
//    public static int getDigitCount(int number){
//        int count = 0;
//        if(number<0){
//            return -1;
//        }
//        if(number == 0){
//            count = 1;
//        } else {
//            while (number > 0) {
//                count++;
//                number /= 10;
//            }
//        }
//        return count;
//    }

}
