// Q 1.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//        for(int i=0;i<=4;i++){
//            for(int j=0;j<=4;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//}


//Q 2.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//        for(int i=0;i<=4;i++){
//            for(int j=0; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//}


//Q3.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=1; j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }
//    }
//}


//Q4.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=1; j<=i;j++){
//                System.out.print(i);
//            }
//            System.out.println(" ");
//        }
//    }
//}



//
//Q5.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//        for(int i=0;i<=5;i++){
//            for(int j=5; j>=i ;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//
//Q6.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//        for(int i=0;i<=6;i++){
//            for(int j=6; j>i ;j--){
//                System.out.print(6-j+1);
//            }
//            System.out.println();
//        }
//    }
//}


//Q7.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++)
//        {
//            for (int j =0; j<5-i-1; j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=0;j< 2*i+1;j++){
//                System.out.print("*");
//            }
//            for (int j =0; j<5-i-1; j++)
//            {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}


//Q8.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++)
//        {
//            for (int j =0; j<i; j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*5-(2*i+1);j++){
//                System.out.print("*");
//            }
//            for (int j =0; j<i; j++)
//            {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}



//Q9.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5 - i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * i + 1; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < 5 - i - 1; j++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * 5 - (2 * i + 1); j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}


//Q 10.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//        for(int i=1;i<=2*5-1;i++){
//            int stars = i;
//            if(i>5) stars = 2*5-i;
//            for(int j=1;j<=stars;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


//Q 11.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//       int start = 1;
//       for(int i =0; i<=6;i++){
//           if(i %2 == 0){
//               start = 1;
//           }else{
//               start =0;
//           }
//           for(int j =0; j<=i; j++){
//               System.out.print(start);
//               start = 1 - start;
//           }
//            System.out.println();
//        }
//    }
//}


//Q 12.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//        int spaces = 2 * (5 - 1);
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//            spaces -= 2;
//        }
//    }
//}


//Q 13.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//        int start =1;
//        for(int i = 0; i<=4; i++){
//            for(int j = 0; j <= i; j++){
//                System.out.print(start + " ");
//                start = start +1;
//            }
//            System.out.println();
//        }
//    }
//}



//Q 14.
//public class PatternsInJavaSDE {
//    public static void main(String[] args) {
//
//        for(int i =0; i<=5;i++){
//            for(char ch= 'A';ch <= 'A' + i;ch++){
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }
//    }
//}


//Q 15.
public class PatternsInJavaSDE {
    public static void main(String[] args) {
        for(int i =5; i>=0;i--){
            for(char ch= 'A';ch <= 'A' + i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}