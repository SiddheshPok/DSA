class ProductOfNumbers {
        ArrayList<Integer> list; 
    public ProductOfNumbers() {
        list = new ArrayList<>();
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int prod = 1;
        int n = list.size() - 1;
        // for(int i = n; i >= k; i--) {
        //     prod *= list.get(i);
        // }
        int count = 1;
        while(count <= k) {
            prod *= list.get(n--);
            count++;
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */