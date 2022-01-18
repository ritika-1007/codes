public class equi {

        // a: input array
        // n: size of array
        // Function to find equilibrium point in the array.
        public static int equilibriumPoint(long arr[], int n) {
             int sum=0,temp=0;
             for(int i=0;i<n;i++)
             sum+=arr[i];
             
             for(int i=0;i<n;i++)
             {
                 if(temp==sum-arr[i])
                 return i+1;
                 
                 temp+=arr[i];
                 sum-=arr[i];
             }
             return -1;
        }
    }
    

