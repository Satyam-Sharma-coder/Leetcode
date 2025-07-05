class Solution {
    public int find(int x, int[]parent){
        if(x==parent[x]) return x;
        return parent[x]=find(parent[x],parent);
    }
    public void union(int x,int y,int[] parent,int[] rank){
        int parent_x = find(x,parent);
        int parent_y=find(y,parent);
        if(parent_x==parent_y) return;
        int rank_x=rank[parent_x];
        int rank_y=rank[parent_y];
        if(rank_x>rank_y){
            parent[parent_y]= parent_x;
        }
        else if(rank_y>rank_x){
            parent[parent_x]=parent_y;
        }
        else if (rank_y==rank_x){
            parent[parent_y]=parent_x;
            rank[parent_x]++;
        }
    }
    public boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
        }
        int[] rank = new int[26];
        for(String s: equations){
            if(s.charAt(1)=='='){
                int x = s.charAt(0)-'a';
                int y = s.charAt(3)-'a';
                union(x,y,parent,rank);
            }
        }
        for(String s: equations){
            if(s.charAt(1)=='!'){
                int parent_x = find(s.charAt(0)-'a',parent);
                int parent_y = find(s.charAt(3)-'a',parent);
                if(parent_x== parent_y) return false;
            }
        }
        return true;
    }
}