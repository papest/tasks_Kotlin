import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class PalindromeTests {
    /**
     * Unsatisfied with palindrome checkers from stackoverflow.com, you decided to write your own implementation of this
     * algorithm and apply the test-driven development approach to this process. First, you defined a set of rules for
     * your checker. After that, you wrote tests to enforce these rules. It's about time to implement the checker itself.
     * Too bad, you have lost the piece of paper with the full list of rules, so no other cases will be tested.
     */

    @ParameterizedTest
    @ValueSource(strings = ["aaaa", "AaAaaaA", "Radar", "My gym", "Don't nod", "No lemon, no melon"])
    fun testIsPalindrome(string: String?) {
        assertTrue(Palindrome.isPalindrome(string))
    }

    @ParameterizedTest
    @ValueSource(strings = ["", "hello!", "horror", "Ill will", "((()))", "[))))]", "222222122222"])
    fun testIsNotPalindrome(string: String?) {
        assertFalse(Palindrome.isPalindrome(string))
    }
}