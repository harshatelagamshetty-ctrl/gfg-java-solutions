class Solution {
    public void sortInWave(int arr[]) {
        // code here
        if(arr.length%2!=0){
            for(int i=0;i<arr.length-2;i=i+2){
            int x=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=x;
        }
    }
        else{
            for(int i=0;i<arr.length-1;i=i+2){
            int x=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=x;
        }
            
    }

    }
}
