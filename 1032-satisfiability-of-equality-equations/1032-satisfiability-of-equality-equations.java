class Solution {
    public char find(char x, char[]parent){
        if(x==parent[x-'a']) return x;
        return parent[x-'a']=find(parent[x-'a'],parent);
    }
    public void union(char x,char y,char[] parent,int[] rank){
        char parent_x = find(x,parent);
        char parent_y=find(y,parent);
        if(parent_x==parent_y) return;
        int rank_x=rank[parent_x-'a'];
        int rank_y=rank[parent_y-'a'];
        if(rank_x>rank_y){
            parent[parent_y-'a']= parent_x;
        }
        else if(rank_y>rank_x){
            parent[parent_x-'a']=parent_y;
        }
        else if (rank_y==rank_x){
            parent[parent_y-'a']=parent_x;
            rank[parent_x-'a']++;
        }
    }
    public boolean equationsPossible(String[] equations) {
        char[] parent = new char[26];
        char ch = 'a';
        for(int i=0;i<parent.length;i++){
            parent[i]=ch;
            ch++;
        }
        int[] rank = new int[26];
        for(String s: equations){
            if(s.charAt(1)=='='){
                char x = s.charAt(0);
                char y = s.charAt(3);
                union(x,y,parent,rank);
            }
        }
        for(String s: equations){
            if(s.charAt(1)=='!'){
                char parent_x = find(s.charAt(0),parent);
                char parent_y = find(s.charAt(3),parent);
                if(parent_x== parent_y) return false;
            }
        }
        return true;
    }
}