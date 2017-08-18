public int[][] multiply(int[][] A, int[][] B) {
        if(A.length == 0 || A[0].length == 0 || B.length == 0 || B[0].length == 0) 
                return new int[][]{};
        int m = A.length, n = B.length; l = B[0].length;
        int[][] res = new int[m][l];
        
        Map<Integer, Map<Integer, Integer>> map = new HashMap();
        for(int i = 0; i < m; i++){
                Map<Integer, Integer> temp = new HashMap();
                for(int j = 0, j < n; j++){
                        if(A[i][j] != 0)
                                temp.put(j, A[i][j]);
                }
                map.put(i, temp);
        }
        
        for(int key1: map.keySet()){
                for(int i = 0; i < l; i++){
                        for(int key2: map.get(key1).keySet()){
                                res[key1][i] += map.get(key1).get(key2) * B[key2][i];
                        }
                }
        }
        return res
}

                        
