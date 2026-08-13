class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        int[] answer = new int[2];

        for(int i = 0; i < numbers.length; i++){

            System.out.println(numbers[leftPointer] + " + " + numbers[rightPointer]);

            if(numbers[leftPointer] + numbers[rightPointer] > target){

                rightPointer--;
                continue;
            }
            if(numbers[leftPointer] + numbers[rightPointer] < target){

                leftPointer++;
                continue;
            }
            if(numbers[leftPointer] + numbers[rightPointer] == target){

                answer[0] = leftPointer + 1;
                answer[1] = rightPointer + 1;
                System.out.println("huh");
                return answer;
            }



        }

        return answer;

    }
}
