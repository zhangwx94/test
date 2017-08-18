public class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        int max = Math.max(m,n);
        
        int[] sum = new int[max+1];
        int car=0;
        
        for(int i = 0; i < max+1; i++){
            int numA = 0;
            int numB = 0;
            
            if(i < m){
                numA = a.charAt(m-1-i)-'0';
            }
            if(i < n){
                numB = b.charAt(n-1-i)-'0';
            }
            sum[max-i]=(numA+numB+car)%2;
            car=(numA+numB+car)/2;
        }
        
        StringBuilder res = new StringBuilder();
        
        for(int i=0;i<max+1;i++){
            if(i==0&&sum[i]==0)
            continue;
            
            res.append(sum[i]);
        }
        return res.toString();
    }
}
