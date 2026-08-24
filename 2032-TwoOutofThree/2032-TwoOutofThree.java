// Last updated: 8/24/2026, 4:23:09 PM
1class Solution {
2    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
3        ArrayList<Integer>list=new ArrayList<>();
4        HashMap<Integer,Integer>map=new HashMap<>();
5        HashMap<Integer,Integer>map1=new HashMap<>();
6        HashMap<Integer,Integer>map2=new HashMap<>();
7        HashSet<Integer>set =new HashSet<>();
8        HashSet<Integer>set1=new HashSet<>();
9        HashSet<Integer>set2=new HashSet<>();
10        for(int n1:nums1){
11            set.add(n1);
12        }
13        for(int n2:nums2){
14            set1.add(n2);
15        }
16        for(int n3:nums3){
17            set2.add(n3);
18        }
19        for(int x:set){
20            map.put(x,map.getOrDefault(x,0)+1);
21        }
22        for(int x1:set1){
23            map.put(x1,map.getOrDefault(x1,0)+1);
24        }
25         for(int x2:set2){
26            map.put(x2,map.getOrDefault(x2,0)+1);
27        }
28         for(int n : map.keySet()) {
29            if(map.get(n) >= 2) {
30                list.add(n);
31            }
32        }
33
34        return list;
35
36
37    }
38}