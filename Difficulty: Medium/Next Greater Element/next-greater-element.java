class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);
        Stack<Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<st.peek()){
                list.add(st.peek());
                st.push(arr[i]);
            }
            else{
                while(st.size()!=0 && arr[i]>=st.peek()) st.pop();
                if(st.size()==0){
                    list.add(-1);
                    st.push(arr[i]);
                }
                else{
                    list.add(st.peek());
                    st.push(arr[i]);
                }
            }
        }
        Collections.reverse(list);
        return list;
    }
}