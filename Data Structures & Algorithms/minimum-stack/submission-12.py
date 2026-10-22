class MinStack:
    def __init__(self):
        self.stack = []
        self.lastMin = None
        self.currMin = float('inf')

    def push(self, val: int) -> None:
        if val <= self.currMin:
            self.lastMin = self.currMin
            self.currMin = val
        self.stack.append(val)

    def pop(self) -> None:
        if self.top() == self.currMin:
            self.currMin = self.lastMin
        self.stack.pop()

    def top(self) -> int:
        return self.stack[len(self.stack) - 1]

    def getMin(self) -> int:
        return self.currMin
