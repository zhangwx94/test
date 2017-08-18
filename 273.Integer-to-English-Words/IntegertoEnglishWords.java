public class Solution {
    int[] divisor = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20, 30, 40, 50, 60, 70, 80, 90};
    String[] divisor_w = {"Zero","One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ",
        "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ","Eighteen ", "Nineteen ",
        "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        String rlt = helper(num);
        return rlt.trim();
    }
    
    public String helper(int num){
        if(num >= 1000000000)   return helper(num/1000000000) + "Billion " + helper(num%1000000000);
        else if(num >= 1000000) return helper(num/1000000) + "Million " + helper(num%1000000);
        else if(num >= 1000)    return helper(num/1000) + "Thousand " + helper(num%1000);
        else if(num >= 100)     return helper(num/100) + "Hundred " + helper(num%100);
        else if(num >0){
            for(int i=divisor.length-1; i>=0; i--){
                if(num>=divisor[i]) return divisor_w[i] + helper(num - divisor[i]);
            }
            return "";
        }
        else return "";
    }
}
