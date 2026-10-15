class Solution:
    def hammingWeight(self, n: int) -> int:
        binary = bin(n)[2:]
    
        # Initialize a counter variable
        count = 0
        
        # Iterate through each character in the binary string
        for bit in binary:
            if bit == '1':
                # Increment the counter if the bit is '1'
                count += 1
        
        # Return the count of 1 bits
        return count