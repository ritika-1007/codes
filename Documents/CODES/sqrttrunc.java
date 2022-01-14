class sqrttrunc {
    public int mySqrt(int x) {
        if(x==0 || x==1)
            return x;
        
        int start=0,end=x,mid=0;
        
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(mid==x/mid )
                return mid;
           if(mid>x/mid)
                end=mid-1;
            else
                start=mid+1;
        }
        if(mid*mid>x)
            return mid-1;
        else 
        return mid ;
    }
}
