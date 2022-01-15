class pairdiff
{
    public boolean findPair(int arr[], int size, int n)
    {
        int c=0;
    Arrays.sort(arr);
    for(int i=0;i<size;i++)
    {
        int val=n+arr[i];
        int start=0,end=size-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==val)
            c++;
            if(arr[mid]>val)
            end=mid-1;
            else
            start=mid+1;
        }
        
    }
    if(c>0)
    return true;
    else 
    return false;
    }
}
