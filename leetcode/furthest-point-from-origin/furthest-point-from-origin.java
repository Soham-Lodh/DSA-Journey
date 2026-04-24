class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL=0,countR=0,distance=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L')countL++;
            else if(moves.charAt(i)=='R')countR++;
        }
        if(countL>=countR){
            distance=countL-countR+(moves.length()-(countL+countR));
        }
        else{
            distance=countR-countL+(moves.length()-(countL+countR));
        }
        return distance;
    }
}