// Last updated: 9/18/2026, 12:41:30 PM
1class Solution {
2    public String mostCommonWord(String p, String[] banned) {
3        p=p.toLowerCase();
4        p=p.replaceAll("[^a-zA-Z]"," ");
5        String[] w =p.split("\\s+");
6        HashMap<String,Integer>map =new HashMap<>();
7         HashSet<String> ban = new HashSet<>();
8
9for(String x : banned) {
10    ban.add(x);
11}
12        for(int i=0;i<w.length;i++){
13            if(!ban.contains(w[i])){
14                map.put(w[i],map.getOrDefault(w[i],0)+1);
15            }
16        }
17        int max =0;
18        String res ="";
19        for(String x:map.keySet()){
20            if(map.get(x)>max){
21                max =map.get(x);
22                res=x;
23            }
24            
25        }
26        return res;
27        
28    }
29}