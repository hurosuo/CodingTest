

import java.util.*;

public class B_14225 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        // Set 설정하고
        Set<Integer> s=new HashSet<Integer>();

        int num= (int)Math.pow(2,n);

        //Bit마스킹 시작
        for(int i =0;i<num;i++){
            int sum=0;

            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    sum+=a.get(j);
                }
            }
            s.add(sum);
        }
        ArrayList<Integer> result=new ArrayList<>(s);
        result.sort(null);

        int flag=0;
        for(int i=0;i<result.size();i++){
            if(i!=result.get(i)){
                System.out.println(i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(result.get(result.size()-1)+1);
        }
    }
}