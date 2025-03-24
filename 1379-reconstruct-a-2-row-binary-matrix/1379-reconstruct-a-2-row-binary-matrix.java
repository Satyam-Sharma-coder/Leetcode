class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int n=colsum.length;
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=0,b=0; 
            if(colsum[i]==2){
                a=b=1;
                upper--;
                lower--;
            }
            else if(colsum[i]==1){
                if(upper>lower){
                    a=1;
                    upper--;
                }else{
                    b=1;
                    lower--;
                }
            }
            if(upper<0 || lower<0){
                break;
            }
            first.add(a);
            second.add(b);
        }
        return (lower==0 && upper==0)?List.of(first,second):List.of();
    }
}