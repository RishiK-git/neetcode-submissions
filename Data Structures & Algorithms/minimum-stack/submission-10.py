class MinStack:
    def __init__(self):
        self.stack = []
        self.currMin = float('inf')

    def push(self, val: int) -> None:
        print(val < self.currMin)
        self.currMin = val if val < self.currMin else self.currMin
        self.stack.append(val)

    def pop(self) -> None:
        removed = self.top()
        self.stack.pop()
        if removed == self.currMin and self.stack:
            self.currMin = min(self.stack)
        elif not self.stack:
            self.currMin = float('inf')

    def top(self) -> int:
        return self.stack[len(self.stack) - 1]

    def getMin(self) -> int:
        return self.currMin
