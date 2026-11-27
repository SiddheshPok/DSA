class KthLargest {
    List<Integer> list = new ArrayList<>();
    int largest;
    public KthLargest(int k, int[] nums) {
        this.largest = k;
        //Arrays.sort(nums);
        for(int n : nums) {
            list.add(n);
        }
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size() - largest);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */