class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s1 = new HashMap();
        HashMap<Character, Integer> s2 = new HashMap();

        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();

        if (!(s.length() == t.length())) {
            return false;
        } else {
            for (char letter : string1) {
                s1.put(letter, s1.getOrDefault(letter, 0) + 1);
            }
            for (char letter : string2) {
                s2.put(letter, s2.getOrDefault(letter, 0) + 1);
            }
            System.out.println(s1);
            System.out.println(s2);
            return s1.equals(s2);
        }
    }
}
