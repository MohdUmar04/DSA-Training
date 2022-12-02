/*GFG->   Check Arithmetic Progression*/
/*Java Solution */
class Solution
{
    boolean checkIsAP(int arr[] ,int n)
    {
        // code here
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        int a=arr[0];
        for(int i=0;i<n;i++)
        {
            if(a!=arr[i])
            return false;
            else
            a=a+d;
        }
        return true;
    }
}
/*PYTHON Solution */
class Solution:
    
    def checkIsAP(self, arr, n):
        # code here
        arr=sorted(arr)
        d=arr[1]-arr[0]
        a=arr[0]
        for i in range(n):
            if a != arr[i]:
                return False
            else:
                a=a+d
        return True