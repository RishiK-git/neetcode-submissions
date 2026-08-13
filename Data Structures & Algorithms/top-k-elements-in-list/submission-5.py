class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freqMap = {}
        # find freq of each number in input array
        for num in nums:
            freqMap[num] = 1 + freqMap.get(num, 0)

        freqList = [[] for _ in range(len(nums) + 1)]
        # bucket sort, index is count
        for num, count in freqMap.items():
            freqList[count].append(num)


        limit = k
        output = []
        # looping backwards through list
        for bucket in reversed(freqList):
            for num in bucket:
                output.append(num)
                limit = limit - 1
                if (limit == 0): break
            if (limit == 0): break

        return output
        