class Solution:
    def twoSum(self, no: List[int], target: int) -> List[int]:
        previous_map = dict()
        for i, num in enumerate(no):
            if target - num in previous_map:
                return(i, previous_map[target-num])
            previous_map[num] = i
        return -1



    
    
    
    
  