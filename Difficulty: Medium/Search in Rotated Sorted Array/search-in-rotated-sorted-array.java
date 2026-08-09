class Solution {
    int search(int[] arr, int target) {
        // code here
        int p=findPivotIdx(arr);
        int i=0;
        int j=p-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) i=mid+1;
            else j=mid-1;
        }
        
        int a=p;
        int b=arr.length-1;
        while(a<=b){
            int mid=a+(b-a)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) a=mid+1;
            else b=mid-1;
        }
        return -1;
    }
    public int findPivotIdx(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return i+1;
        }
        return 0;
    }
}