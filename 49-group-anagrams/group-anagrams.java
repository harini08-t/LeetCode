class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> mp=new HashMap<>();

        for(String str:strs){
            int arr[]=new int[26];
            for(char ch:str.toCharArray()){
                arr[ch-'a']++;
            }
            String k=Arrays.toString(arr);
            mp.putIfAbsent(k,new ArrayList<>());
            mp.get(k).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}