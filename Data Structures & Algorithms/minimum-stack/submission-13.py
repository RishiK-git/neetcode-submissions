class MinStack:
    def __init__(self):
        self.stack = []
        self.mins = [float('inf')]

    def push(self, val: int) -> None:
        currMin = self.mins[len(self.mins) - 1] 
        if currMin >= val:
            self.mins.append(val) 
        self.stack.append(val)

    def pop(self) -> None:
        removed = self.stack[len(self.stack) - 1] 
        currMin = self.mins[len(self.mins) - 1] 
        if removed == currMin:
            self.mins.pop()
        self.stack.pop()

    def top(self) -> int:
        return self.stack[len(self.stack) - 1]

    def getMin(self) -> int:
        return self.mins[len(self.mins) - 1] 
