fun gcd(a: Int, b: Int) : Int{
    if(b == 0) return a
    return gcd(b, a % b)
}
fun sum(a: Int, b: Int) = a + b

fun ranges(){
    for(i in 1..5) print("$i ")

    val num = arrayOf(1, 2, 3)
    if(1 in num) println("YES")
}

fun loops(){
    /*for loops*/
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for(car in cars) print("$car ")

    /* while loops*/
    var i = 0
    while (i < cars.size){
        println(cars[i])
        i++
    }

    /* for-while loops*/
    i = 0
    do{
        println(cars[i])
        i++
    }while(i < cars.size)
}

fun array(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])
}

fun whens(){
    val day = 4
    val result = when(day){
        1 -> "Saturday"
        2 -> "Sunday"
        3 -> "Monday"
        4 -> "Tuesday"
        5 -> "Wednesday"
        6 -> "Thursday"
        7 -> "Friday"
        else -> "No Day"
    }
    print("$day is : ")
    println(result) // 4 is : Tuesday
}

fun string(){
    val greeting = "Hello"
    println(greeting)

    val name : String = "Apple"
    println(name)

    var fruitsName : String;
    fruitsName = "Mango to Apple"
    println(fruitsName)
    println(fruitsName[1])

    println(fruitsName.length) // 14
    println(fruitsName.uppercase()) // MANGO TO APPLE
    println(fruitsName.compareTo(greeting)) // 5
    println(fruitsName.indexOf(name))      // 9
    println("Jonny eat ".plus(fruitsName)) // Jonny eat Mango to Apple
    println("Jonny eat $name $fruitsName") // Jonny eat Apple Mango to Apple
}

fun Lists() {
    val nums = listOf(1, 2,3,4,10)
    println(nums.get(nums.size - 1))
    println(nums[nums.size - 1])
    println(nums.lastIndex)
    println(nums.last())
}

fun main() {
    /*Functions*/
    println("GCD is: " + gcd(10, 5))
    println("SUM is: " + sum(10, 5))
    /*Range*/
    ranges()
    /*Loops*/
    loops()
    /*Arrays*/
    array()
    /*When*/
    whens()
    /*Strings*/
    string()
    /*Lists*/
    Lists()
}

