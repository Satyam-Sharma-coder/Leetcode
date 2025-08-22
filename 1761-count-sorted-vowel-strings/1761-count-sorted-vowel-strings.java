class Solution { 
    public ArrayList<Integer> helper(int n){
        if(n==1){
            return new ArrayList<>(Arrays.asList(1,1,1,1,1,5));
        }
        ArrayList<Integer> list = helper(n-1);
        ArrayList<Integer> list2=new ArrayList<>();
        int sum=0;
        list2.add(list.get(5));
        list2.add(list2.get(0)-list.get(0));
        list2.add(list2.get(1)-list.get(1));
        list2.add(list2.get(2)-list.get(2));
        list2.add(list2.get(3)-list.get(3));
        sum=list2.get(0)+list2.get(1)+list2.get(2)+list2.get(3)+list2.get(4);
        list2.add(sum);
        return list2;

    }
    public int countVowelStrings(int n) {
        ArrayList<Integer> list = helper(n);
        return list.get(5);
    }
}