class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {
            groups.computeIfAbsent(buildFrequencyKey(s), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());   
    }

    private String buildFrequencyKey(String s) {

        int[] counts = new int[26];

        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int count : counts) {
            sb.append('#').append(count);
        }
        return sb.toString();
    }
}
