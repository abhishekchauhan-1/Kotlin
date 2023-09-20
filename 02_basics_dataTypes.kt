typealias EmailAddress = String // Define the type alias at the top level

fun main() {
    // Numbers
    val age: Int = 30
    val price: Double = 19.99
    val isStudent: Boolean = true

    // Characters
    val grade: Char = 'A'

    // Text
    val name: String = "John"

    // Arrays
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    // Collections
    val fruits: List<String> = listOf("Apple", "Banana", "Cherry")

    // Nullability (using the safe call operator)
    val nullableString: String? = null
    val length: Int? = nullableString?.length

    // User-Defined Types (Custom Classes)
    data class Person(val name: String, val age: Int)
    val person: Person = Person("Alice", 25)

    // Top-level Type Aliases
    val email: EmailAddress = "example@example.com"

    // Printing data types
    println("age is of type ${age::class.simpleName}")
    println("price is of type ${price::class.simpleName}")
    println("isStudent is of type ${isStudent::class.simpleName}")
    println("grade is of type ${grade::class.simpleName}")
    println("name is of type ${name::class.simpleName}")
    println("numbers is of type ${numbers::class.simpleName}")
    println("fruits is of type ${fruits::class.simpleName}")
//     println("nullableString is of type ${nullableString::class.simpleName}")
    println("person is of type ${person::class.simpleName}")
    println("email is of type ${email::class.simpleName}")
}
