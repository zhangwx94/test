public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if(s==null||wordDict==null){
            return false;
        }
        
        List<Integer> list = new ArrayList();
        list.add(-1);
        
        for(int i = 0; i < s.length(); i++){
            for(int j = list.size() - 1; j >= 0; j--){
                if(wordDict.contains(s.substring(list.get(j)+1, i+1))){
                    list.add(i);
                    break;
                }
            }
        }
        
        return list.get(list.size()-1) == s.length() - 1; 
    }
}

public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if(s==null||wordDict==null){
            return false;
        }
        
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                dp[i] = dp[j] && wordDict.contains(s.substring(j, i)); 
            }
        }
        
        return dp[s.length()];
    }
}
