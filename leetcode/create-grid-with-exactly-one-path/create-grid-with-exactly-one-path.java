class Solution {
    public String[] createGrid(int m, int n) {
        String[] path=new String[m];
        for(int i=0;i<m;i++){
            if(i==0){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j++)sb.append('.');
                path[i]=sb.toString();
            }
            else{
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n-1;j++)sb.append('#');
                sb.append('.');
                path[i]=sb.toString();
            }
        }
        return path;
    }
}