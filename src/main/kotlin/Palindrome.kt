object Palindrome {
    fun isPalindrome(palindrome: String?): Boolean {
        val temp = palindrome?.lowercase()?.replace("[^a-zA-Z]".toRegex(), "")
        if (temp?.length == 0) return false
        return temp == temp?.reversed()
    }
}