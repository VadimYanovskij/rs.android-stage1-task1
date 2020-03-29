package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
    //  throw NotImplementedError("Not implemented")
//        val happyArray = sadArray.filterIndexed { index, i -> (index == 0 || index == sadArray.lastIndex) || i < sadArray[index - 1] + sadArray[index + 1] }
//
//        return happyArray.toIntArray()
        var pair = Pair(sadArray, false)
        while (!pair.second) {
            pair = filter(pair.first)
        }
        return (pair.first)
    }

    private fun filter(sadArray: IntArray): Pair<IntArray, Boolean> {
        val result = mutableListOf<Int>()
        for (i in sadArray.indices) {
            when {
                i == 0 -> result.add(sadArray[i])
                i == sadArray.size - 1 -> result.add(sadArray[i])
                sadArray[i - 1] + sadArray[i + 1] >= sadArray[i] -> result.add(sadArray[i])
            }
        }

        return Pair(result.toIntArray(), result.size == sadArray.size)
    }

}
