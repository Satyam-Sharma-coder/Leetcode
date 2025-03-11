class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> capitalization = new HashMap<>();
        Map<String, String> vowel = new HashMap<>();

        for (String word : wordlist) {
            String lowerWord = word.toLowerCase();
            capitalization.putIfAbsent(lowerWord, word);
            
            String vowelKey = lowerWord.replaceAll("[aeiou]", "*");
            vowel.putIfAbsent(vowelKey, word);
        }

        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (exactWords.contains(queries[i])) {
                result[i] = queries[i];
            } else {
                String lowerQuery = queries[i].toLowerCase();
                String vowelKey = lowerQuery.replaceAll("[aeiou]", "*");

                if (capitalization.containsKey(lowerQuery)) {
                    result[i] = capitalization.get(lowerQuery);
                } else if (vowel.containsKey(vowelKey)) {
                    result[i] = vowel.get(vowelKey);
                } else {
                    result[i] = "";
                }
            }
        }
        return result;
    }
}