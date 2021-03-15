class Arrays{
    public static void main(String[] args) {
        int[] arr = {12, 15, 6, 3, 70, 51, 83, 15, 3, 83};
        int max = arr[0], index = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                index = i;
                max = arr[i];
            }
        }

        System.out.println("MAX = " + max + " Index ke-" + index);
    }
}