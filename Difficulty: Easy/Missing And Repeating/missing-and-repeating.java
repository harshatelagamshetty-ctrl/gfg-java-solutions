class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(arr);

        for (int x : arr)
            list.add(x);

        // Find repeating element
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                ans.add(list.get(i));
                list.remove(Integer.valueOf(list.get(i)));
                break;
            }
        }

        long n = arr.length;

        long n_sum = n * (n + 1) / 2;

        long sum = 0;
        for (int x : list)
            sum += x;

        ans.add((int)(n_sum - sum));

        return ans;
    }
}