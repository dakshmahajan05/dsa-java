public class perfect {
    public static void main(String[] args) {
        int total=0;
        int n=24;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                total+=i;
            }
        }
        if(total==n){
            System.out.println("yes");
        }else{
            System.out.println("no its not");
        }

    }
}
