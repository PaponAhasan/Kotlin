fun main() {
    /*Introduction
        Kotlin Programming Language

        The Kotlin programming Language is a general purpose statically typed language that has become extremely
        popular in the last few years. Kotlin can be used on both the client and the server, which means
        the code can be run either on the user's device. The client or on some computer in the cloud called the server which responds to
        requests from the client. On the client kotlin is now widely used for android development to write apps for the 2.5 billion devices
        running the android operating system.
    */

    println("Hello World!")

    /*variables
        Variable is a piece of data which has a name and a type.
        For example string are a sequence of characters.
    */
    val firstName:String = "Rakibul"
    println(firstName)
    //Type inference
    val lastName = "Ahasan"
    println(lastName)
    //val : read-only
    //var : read and write. if the value of a variable can change after it's initialized
    // then we have to declare it with this var keyword
    var weight = 17
    println(weight)
    weight = 20
    println(weight)

    /*operators
    Operator allow us to manipulate these variables. For example,
    we can combine two strings into a longer string with a plus sign. Which
    is called concatenation.
    */

    val yellowFruits = "Banana"
    val redFruits = "Mango"
    println(yellowFruits + redFruits)

    val bankBalance = 12
    val cashBalance = 23
    println(bankBalance + cashBalance) // use can use (-,*,%) operators

    /*strings
    string are a sequence of characters and there are a bunch of useful things
    you can do with them. For example, retrieving a character in the series by
    indexing into the string
     */
    val myString = "KOTLIN"
    println(myString[0])
    println(myString[2])
    println(myString.isEmpty())
    println(myString.length)
    println(myString.substring(2, 4))
    /* Kotlin is to explore other methods available to you by
    hitting the dot or period after writing the name of your variable*/
    println("This string is $myString")

    /*conditionals
    conditional which are a way to execute certain code depending
    on a condition. An if statement is an example of flow control which will
    evaluate whether a statements are true or false and  execute some
    code only if it's true
    */

    val examScore = 88
    if (examScore >= 33){
        println("You are passed")
    }else{
        println("You failed")
    }

    /*collections
    We often went to hold a bunch of variables at once instead of
    defining them one at a time for that we can use collections.
    */

    /*val name1 = "pop"
    val name2 = "can"
    val name3 = "eag"*/

    val names = listOf("pop", "can", "eag")
    println(names[1])

    /*By default, collections in kotlin are immutable which means we can't add or
    remove elements from the list. If we want to change the contents we
    must declare the list as a mutable list by changing the declaration*/

    val fruits = mutableListOf("banana", "apple")
    fruits.add("mango")
    println(fruits)

    /*for loops*/
    for (name in names) {
        println(name)
    }

    for (i in 1..5){
        println(i)
    }
    //if we don't want to include the last number than we can do
    for (i in 1 until 5){
        println(i)
    }
    /*functions
    Function are a way to combine chunks of your code, so we can
    reuse them throughout our program. This makes our code easier to
    read and think about we can create a function with the fun keyword
    */

    fun myFunction(name: String){
        println("hello $name")
    }
    myFunction("Rakibul")

    // you can also set the visibility of functions to be private

    /*nullability
    null means having no value and if a variable is allowed to have no
    value then we need to update the type to include a question mark
    */
    val instagramBio: String? = null
    if(instagramBio != null){
        println(instagramBio.uppercase())
    }
}

