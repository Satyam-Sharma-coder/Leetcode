class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        answer(1,n,list,set);
        return list;
    }
    public void answer(int i,int n,List<Integer> list,HashSet<Integer> set){
        if(set.contains(i) || i>n || i==0 ){
            return;
        }
        list.add(i);
        set.add(i);
        answer(i*10,n,list,set);
        int last= i%10;
        last=last+1;
        i=i/10;
        i=i*10+last;
        while(i%10==0){
            i=i/10;
        }
        answer(i,n,list,set);
    }
}