 import java.util.Scanner;

public class functions_for_pattern {
    public static void rectanglePattern(int m, int n) {
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        
    }
    public static void hollowRectanglePattern(int m,int n) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == m || j == n) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();

        }

       
        
    }
    public static void halfPyramid(int n) {
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void invertedPyramid(int n) {
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void halfPyramid2(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void numberHalfPyramid(int n) {
        for(int i =1; i<=n;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
        
    }
    public static void numberPyramidWithoutNUmberRepition(int n) {
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        
    }
    public static void invertedNumberPyramid(int n) {
        for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        
    }
    public static void halfPyramidWithZeroOneForm(int n) {
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                   
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
    }
    public static void butterFly(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               System.out.print("*");
                 
            }
           for(int j=1;j<=2*(n-i);j++){
               System.out.print(" ");

           }
           for(int j=1;j<=i;j++){
               System.out.print("*");}
               System.out.println();
          
           
            
       }
       for(int i=n;i>=1;i--){
           for(int j=1;j<=i;j++){
              System.out.print("*");
                
           }
          for(int j=1;j<=2*(n-i);j++){
              System.out.print(" ");

          }
          for(int j=1;j<=i;j++){
              System.out.print("*");}
              System.out.println();
            }

        
    }
    public static void paralleloGram(int n) {
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void numberPyramid(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
    public static void numberPyramidWithNumbersLike121(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    public static void diamondPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1 ;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
            
            
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1 ;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
            
            
        }
        
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of a");
     int a = sc.nextInt();
     System.out.println("Enter the value of b");
     int b = sc.nextInt();
     System.out.println("Enter the value of n");
     int n = sc.nextInt();
    
      rectanglePattern(a, b);
      System.out.println();
      hollowRectanglePattern(a, b);
      System.out.println();
      halfPyramid(n);
      System.out.println();
      invertedPyramid(n);
      System.out.println();
      halfPyramid2(n);
      System.out.println();
      numberHalfPyramid(n);
      System.out.println();
      invertedNumberPyramid(n);
      System.out.println();
      numberPyramidWithoutNUmberRepition(n);
      System.out.println();
      halfPyramidWithZeroOneForm(n);
      System.out.println();
      butterFly(n);
      System.out.println();
      paralleloGram(n);
      System.out.println();
      numberPyramid(n);
      System.out.println();
      numberPyramidWithNumbersLike121(n);
      System.out.println();
      diamondPattern(n);
    
        

    }
}