

class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        q = deque((t, i) for i, t in enumerate(tickets))
        time = 0
        while q:
            t, i = q.popleft()
            time += 1
            t -= 1
            if i == k and t == 0:
                return time
            if t > 0:
                q.append((t, i))