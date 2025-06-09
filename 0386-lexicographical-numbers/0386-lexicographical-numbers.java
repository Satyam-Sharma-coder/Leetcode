class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        answer(1,n,list);
        return list;
    }
    public void answer(int i,int n,List<Integer> list){
        if(i>n){
            return;
        }
        list.add(i);
        answer(i*10,n,list);
        if(i%10!=9){
            answer(i+1,n,list);
        }
    }
}