class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()<sentence2.length()){
            String temp= sentence1;
            sentence1=sentence2;
            sentence2=temp;
        }
        // small - sentace 2 k l  l<k True
        // big - sentace 1  i j 
        String[] s1 = sentence1.split(" ");  
        String[] s2 = sentence2.split(" ");

        int i=0,j=s1.length-1;
        int k=0,l=s2.length-1;
        while(k<s2.length && i<s1.length && s2[k].equals(s1[i])){
            k++;
            i++;
        }
        while(l>=k && s2[l].equals(s1[j])){
            j--;
            l--;
        }

        return l<k;
    }
}


