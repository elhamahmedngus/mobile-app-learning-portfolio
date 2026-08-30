Exercises

fun main() {
    println("1")
    println("2")
    println("3")
}

fun main() {
    println("I'm")
    println("learning")
    println("Kotlin!")
}

fun main() {
    println("Monday")
    println("Tuesday")
    println("Wednesday")
    println("Thursday")
    println("Friday")
}

fun main() {
    println("Tomorrow is rainy")
}

fun main() {
    println("There is a chance of snow")
}

fun main() {
    println("How's the weather today?")
}

VARIABLE

fun main() {
    val count: Int = 10
    println("You have $count unread messages.")
}


fun main() {
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")
}

fun main() {
    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")
}

fun main() {
    var cartTotal = 0
    println("Total: $cartTotal")

    cartTotal = 20
    println("Total: $cartTotal")
}

fun main() {
    var count = 10
    println("You have $count unread messages.")
    count++
    println("You have $count unread messages.")
}

fun main() {
    var count = 10
    println("You have $count unread messages.")
    count--
    println("You have $count unread messages.")
}

fun main() {
    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
}

comment
/*
 * This program displays the number of messages
 * in the user's inbox.
 */
fun main() {
    // Create a variable for the number of unread messages.
    var count = 10
    println("You have $count unread messages.")

    // Decrease the number of messages by 1.
    count--
    println("You have $count unread messages.")
}

FUNCTIONS

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}


fun main() {
    val message = birthdayGreeting("John", 21)
    println(message)
}

 practice problem

fun main() {
    val line1 = "Use the val keyword when the value doesn't change."
    val line2 = "Use the var keyword when the value can change."
    val line3 = "When you define a function, you define the parameters that can be passed to it."
    val line4 = "When you call a function, you pass arguments for the parameters."

    println(line1)
    println(line2)
    println(line3)
    println(line4)
}



