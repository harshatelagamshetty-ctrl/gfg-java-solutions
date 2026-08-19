class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(-1);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<st.peek()){
                list.add(st.peek());
                st.push(arr[i]);
            }
            else{
                while(st.size()!=0 && arr[i]>=st.peek()) st.pop();
                if(st.size()==0) {
                    list.add(-1);
                    st.push(arr[i]);
                }
                else{
                    list.add(st.peek());
                    st.push(arr[i]);
                }
            }
        }
        return list;
    }
}