import java.util.*;



public class B_1339 {

    static List<Integer> core=new ArrayList<>();


    public static void calculate(List<String> word,List<Character> cha){

        for(int i=0;i<word.size();i++){
            String str=word.get(i);
            int a=(int)Math.pow(10,str.length());

            for(int j=str.length()-1;j>=0;j--){
                a/=10;
                for(int k=0;k<core.size();k++){
                    if(cha.get(k)==str.charAt(j)){
                        int c= core.get(k);
                        c+=a;
                        core.set(k,c);
                    }
                }
            }
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> list=new ArrayList<>();
        Set<Character> set=new HashSet<Character>();


        for(int i=0;i<n;i++){
            String str=sc.next();
            for(int j=0;j<str.length();j++){
                set.add(str.charAt(j));
            }
            list.add(str);
        }

        System.out.println(set);
        List<Character> set1=new ArrayList<>(set);
        for(int i=0;i<set.size();i++){
            core.add(0);
        }
        calculate(list,set1);
        System.out.println(core);




    }
}
