class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> str1 = new HashMap<>();
        HashMap<Character,Integer> str2 = new HashMap<>();


        for(char c : s.toCharArray()){
            if(str1.containsKey(c)){
                str1.put(c,str1.get(c)+1);
            }else{
                str1.put(c,1);
            }
        }
        for(char c : t.toCharArray()){
            if(str2.containsKey(c)){
                str2.put(c,str2.get(c)+1);
            }else{
                str2.put(c,1);
            }
        }

        return str1.equals(str2) ? true : false;
    }
}
