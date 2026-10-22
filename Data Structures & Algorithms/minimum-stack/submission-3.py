class MinStack:
    def __init__(self):
        self.stack = []
        self.currMin = float('inf')

    def push(self, val: int) -> None:
        self.currMin = val if val < self.currMin else self.currMin
        self.stack.append(val)

    def pop(self) -> None:
        removed = self.top
        if removed == self.currMin:
            self.currMin = min(self.stack)
        self.stack.pop()

    def top(self) -> int:
        return self.stack[len(self.stack) - 1]

    def getMin(self) -> int:
        return self.currMin
