class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        
        class Pair{
            char ch;
            int freq;
            Pair(char ch,int freq){
                this.ch=ch;
                this.freq=freq;
            }
        }
        
        int[] freq=new int[26];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            freq[idx]++;
        }
        
        ArrayList<Pair>list=new ArrayList<>();
        for(int i=0;i<freq.length;i++){
            list.add(new Pair((char)(i+'a'),freq[i]));
        }
        Collections.sort(list,Comparator.comparingInt(p->p.freq));
        int target=list.get(list.size()-1).freq;
        int i=0;
        int j=list.size()-1;
        int idx=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(list.get(mid).freq>=target){
                idx=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
        return list.get(idx).ch;
    }
}