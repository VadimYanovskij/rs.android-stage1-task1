package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        //   throw NotImplementedError("Not implemented")
        var result = ""
        val sum = bill.fold(0) { acc, e -> acc + e }
        if ((sum-bill[k])/2==b)
            result = "bon appetit"
        else
            result = (b-(sum-bill[k])/2).toString()
        return result
    }


}