class Solution:

    def encode(self, strs: List[str]) -> str:
        encodedStr = str(len(strs)) + ""
        for word in strs:
            encodedStr = encodedStr + str(len(word)) + word
            
        print(encodedStr)
        return str(encodedStr)




    def decode(self, s: str) -> List[str]:
        if s == str(10):
            return [""]

        output = []
        numLoops = int(s[0])
        wordStartIndex = 1

        for i in range(numLoops):

            wordToAdd = s[wordStartIndex + 1 : wordStartIndex + int(s[wordStartIndex]) + 1]
            print(wordStartIndex + 1," ", wordStartIndex + int(s[wordStartIndex]))
            output.append(wordToAdd)
            wordStartIndex = wordStartIndex + int(s[wordStartIndex]) + 1



        return(output)