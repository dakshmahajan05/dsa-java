public class one {


static void pattern1(){
int n=5;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
  }
}
static void pattern2(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
static void pattern3(){
    int n=5;
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

    static void pattern4(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n ||j==1 || j==n){
                    System.out.print("*");
                     System.out.print(" ");
                    
                }else{
                    System.out.print((" "));
                     System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern5(){
        int n=5;
      for(int i=1;i<=n;i++){
        
      }
    }
    public static void main(String[] args) {

    pattern1();
    System.err.println();

    pattern2();

    pattern3();

    pattern4();

    pattern5();
    }
}
