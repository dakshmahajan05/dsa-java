

public class freq {
    public static void main(String[] args) {
        int n=777220018;
        int hash[]=new int[10];
        System.out.println(n);
        while(n!=0){
            int digit=n%10;
            hash[digit]++;
            n/=10;

        }

        for(int i=0;i<hash.length;i++){
          if(hash[i]>0)  System.out.println(i + ": " + hash[i]);
        }

    }
    
}
