import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int m = sc.nextInt();
            int[] arr=new int[m];
            int num=0;
            for(int i=0;i<m;i++){
                arr[i]=sc.nextInt();
                num=Math.max(num,arr[i]);
            }


            LinkedList<Integer> list=new LinkedList<>();
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<m;i++){
                if(!list.isEmpty()&&list.contains(arr[i])){
                    list.remove(arr[i]);
                    list.addFirst(arr[i]);
                }else{
                    list.addFirst(arr[i]);
                }
            }
            for(int i:list){
                System.out.println(i);
                set.add(i);
            }
            for(int i=1;i<=num;i++){
                if(!set.contains(i)){
                    System.out.println(i);
                }
            }
        }
    }
}


/*
public class Main {

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] arr=new int[n];

            int res=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                res^=arr[i];
            }
            int[] or=new int[n];
            for(int i=1;i<=n;i++){
                int num=n/i;
                int mod=n%i;
                if(num%2==0){
                    for(int j=1;j<=mod;j++){
                        or[i-1]^=j;
                    }
                }else{
                    for(int j=mod+1;j<i;j++){
                        or[i-1]^=j;
                    }
                }

                res^=or[i-1];
            }
            /*for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    or[i-1]^=(i%j);
                }
                res^=or[i-1];
            }
            System.out.println(res);
                    }
                    }

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String line=sc.next();
            int small=0;
            int all=line.length();
            for(int i=0;i<all;i++){
                char c=line.charAt(i);
                if(c<='z'&&c>='a'){
                    small++;
                }
            }

            int big=all-small;
            if(small==big){
                System.out.println("0");

            }else{
                int tmp=(int)Math.abs(small-big);
                System.out.println(tmp/2);
            }
            /*int tmp=(int)Math.abs(small-big);
            if(tmp%2==0){
                System.out.println(tmp/2);
            }else{
                System.out.println();
            }

        }

                }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            Set<Integer> setA=new HashSet<>();
            for(int i=0;i<p;i++){
                setA.add(sc.nextInt());
            }

            int total=0;
            for(int i=0;i<q;i++){
                int num=sc.nextInt();
                if(setA.contains(num)){
                    total++;
                }
            }

            int resA=p-total;
            int resB=q-total;
            System.out.println(total+" "+resA+" "+resB);
        }
    }
}
*/
