package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
    //    throw NotImplementedError("Not implemented")
 //       var sumsArray = mutableListOf<Int>()
 //       for (i in input)  {
 //          sumsArray[i] = input.sum().minus(input[i])
 //       }
       // var sum = 0
//       for (i in input) {
//           sum += input[i]
//       }
        val sum = input.fold(0) { acc, e -> acc + e }

//        for (i in input) {
//            sumsArray[i] = sum - input[i]
//        }
        val sumsArray = mutableListOf<Int>()
        for (i in input.indices) {
            sumsArray.add(sum - input[i])
        }

     //   val minSum = sumsArray.min()
     //   val maxSum = sumsArray.max()


        var minSum = sumsArray[0]

        for (number in sumsArray){
            if(minSum > number)
                minSum = number
        }

        var maxSum = sumsArray[0]

        for (number in sumsArray){
            if(maxSum < number)
                maxSum = number
        }


        val result = intArrayOf(minSum, maxSum)


        return result
        }










        //{ i -> (input.sum()-input[i]) }

}
