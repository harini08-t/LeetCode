class Solution {
    public int lengthOfLongestSubstring(String str) {

        int le=0,maxi=0,ri;

        Set<Character> st=new HashSet<>();

        for(ri=0;ri<str.length();ri++){
            while(st.contains(str.charAt(ri))){
                st.remove(str.charAt(le));
                le++;
            }

            st.add(str.charAt(ri));

            maxi=Math.max(maxi,ri-le+1);

        }
        return maxi;
    }
}