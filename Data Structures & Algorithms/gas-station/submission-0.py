class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        total_surplus = 0
        current_surplus = 0
        start = 0
        
        for i in range(len(gas)):
            total_surplus += gas[i] - cost[i]
            current_surplus += gas[i] - cost[i]
            
            # If we can't reach the next station, start from the next one
            if current_surplus < 0:
                start = i + 1
                current_surplus = 0

        return start if total_surplus >= 0 else -1
