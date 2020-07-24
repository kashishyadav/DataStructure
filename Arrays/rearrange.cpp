// Function to rarrange the elements in O(1) extra space
// arr: input array
// n: size of array
void arrange(long long A[], int n1) {
    // Your code here
    int i;
    for(i=0;i<n1;i++){
        A[i]+=((A[A[i]]%n1)*n1);
    }
    for(i=0;i<n1;i++){
        A[i]=A[i]/n1;
    }
    
}
