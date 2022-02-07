class Solve {
    int[] findTwoElement(int arr[], int n) {//[1,2,3,3,5]
         int freq[]=new int[n+1]; //[0,1,1,2,0,1]
         for(int i=0;i<n;i++)
         {
             freq[arr[i]]++;
         }
         int ans[]=new int[2];
         for(int i=1;i<n+1;i++)
         {
             if(freq[i]>1)
             ans[0]=i;
             if(freq[i]==0)
             ans[1]=i;
         }
         return ans;
    }
}
