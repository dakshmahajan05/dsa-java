public class gcd {
    public static void main(String[] args) {
        int x=12;
    int y=18;
    int small=x<y?x:y;
    while(small>=0){
        if(x%small==0 && y%small==0){
            System.out.println(small);
            break;
        }
       small--;
    }
    }
}
