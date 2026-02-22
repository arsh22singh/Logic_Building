def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i,len(nums)):
                if(i+j==self.target):
                    print(i,j)

num=[2,1,3,4]
target=9
twoSum(num,target)