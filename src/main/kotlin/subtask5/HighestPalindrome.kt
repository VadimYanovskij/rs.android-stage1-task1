package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
     //   throw NotImplementedError("Not implemented")
        var palin : CharArray = digitString.toCharArray();
        val palin1 : CharArray = digitString.toCharArray();
        var result : String = ""
        // Iinitialize l and r by leftmost and rightmost ends
        var l : Int = 0
        var r : Int = n - 1
        var kk : Int = k

        // first try to make String palindrome
        while (l < r) {
            // Replace left and right character by maximum of both
            if (palin1[l] != palin1[r]) {
                palin[l] = Math.max(palin1[l].toInt(), palin1[r].toInt()).toChar()
                palin[r] = palin[l]
                kk--
            }
            l++
            r--
        }

        // If k is negative then we can't make String palindrome
        if (kk < 0) {
            return "-1"
        }

        l = 0
        r = n - 1

        while (l <= r) {
            // At mid character, if K>0 then change it to 9
            if (l == r) {
                if (kk > 0) {
                    palin[l] = '9'
                }
            }

            // If character at lth (same as rth) is less than 9
            if (palin[l] < '9') {
                /* If none of them is changed in the previous loop then subtract 2 from K
            and convert both to 9 */
                if (kk >= 2 && palin[l] == palin1[l]
                    && palin[r] == palin1[r]) {
                    kk -= 2
                    palin[l] = '9'
                    palin[r] = '9'
                } /* If one of them is changed in the previous loop then subtract 1 from K (1 more is
				subtracted already) and make them 9 */
                else if (kk >= 1 && (palin[l] != palin1[l]
                            || palin[r] != palin1[r])) {
                    kk--
                    palin[l] = '9'
                    palin[r] = '9'
                }
            }
            l++
            r--
        }
        for(i in 0..n-1)
        result+=palin[i]
        return result
    }



}