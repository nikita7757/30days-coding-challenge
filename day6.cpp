#include <iostream>
#include <vector>
using namespace std;


vector<pair<int, int>> findZeroSumSubarrays(vector<int>& arr) {
    vector<pair<int, int>> result;
    
 
    for (int start = 0; start < arr.size(); start++) {
        int sum = 0;
        for (int end = start; end < arr.size(); end++) {
            sum += arr[end];
            
            if (sum == 0) {
                result.push_back({start, end});
            }
        }
    }
    
    return result;
}

int main() {
    
    vector<int> arr = {1, 2, -3, 3, -1, 2};
    
   
    vector<pair<int, int>> subarrays = findZeroSumSubarrays(arr);
    
    cout<<"[";
    for (auto& subarray : subarrays) {
        
        cout << "("<< subarray.first << " ," << subarray.second <<")";
        
    }
    cout<<"]";
    return 0;
}
