class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
    int[] myArray = new int[26];

        for (int i = 0; i < s.length(); i++){
            myArray[s.charAt(i) - 'a']++;
            myArray[t.charAt(i) - 'a']--;
        }

        for (int count : myArray){
            if (count != 0){
                return false;
            }
        }

        return true;

    }
}
