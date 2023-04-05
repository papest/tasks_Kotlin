import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class Tourist(val name: String, val age: Int, val visitedCountries: Array<String>)

val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()!!

val touristAdapter = moshi.adapter(Tourist::class.java)!!

val touristString = """
    {"name":"Jacky",
    "age":23, 
    "visitedCountries":["Israel","Argentina", "Malaysia"]}""".trimIndent()

val newTourist = touristAdapter.fromJson(touristString)
val countryStrings = newTourist?.visitedCountries
fun main() {
    println(countryStrings.contentToString())
}