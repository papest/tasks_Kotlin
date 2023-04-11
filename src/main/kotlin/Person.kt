@SuppressWarnings("All")
class Person(personName: String?, personAge: Int) {
    companion object {
        const val DEFAULT_NAME = "Unknown"
        const val MAX_AGE = 130
        const val MIN_AGE = 0
    }

    var name = personName
    var age: Int = personAge

    init {
        val nameNotNull = name ?: DEFAULT_NAME
        name = if (nameNotNull.isNotBlank()) nameNotNull else DEFAULT_NAME
        age = if (age < MIN_AGE) MIN_AGE else if (age > MAX_AGE) MAX_AGE else age
    }
}