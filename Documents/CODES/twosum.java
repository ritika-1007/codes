class twosum {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
       int pos1=0,pos2=0;
        while(start<=end)
        {
            int sum=numbers[start]+numbers[end];
            if(sum==target)
            {
                pos1=start;
                pos2=end;
                break;
            }
            if(sum<target)
                start++;
            else 
                end--;
        }
        int arr[]=new int[2];
        arr[0]=pos1+1;
        arr[1]=pos2+1;
        return arr;
    }
}
