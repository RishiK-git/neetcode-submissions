class Solution:
    def minInterval(self, intervals: List[List[int]], queries: List[int]) -> List[int]:
        n = len(queries)
        queries.sort()
        blacklists.sort()
        blacklist_idx = 0
        next_available = 0
        events = []
        for i in range(n):
            while blacklist_idx < len(blacklists) and blacklists[blacklist_idx] <= queries[i][0]:
                next_available = max(next_available, blacklists[blacklist_idx])
                blacklist_idx += 1
            events.append((next_available + 1, queries[i][1]))
        events.sort()
        min_interval = float('inf')
        for i in range(n):
            min_interval = min(min_interval, events[i][1] - events[i][0])
        return min_interval