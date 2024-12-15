fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbersRemoved = list.removeIf { it % 2 == 0 }
    println("Original list: $list") // Output: [1, 3, 5]
    println("Removed even numbers: $evenNumbersRemoved") // Output: true 

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val evenNumbersRemovedFromSet = set.removeIf { it % 2 == 0 }
    println("Original set: $set") // Output: [1, 3, 5]
    println("Removed even numbers from set: $evenNumbersRemovedFromSet") // Output: true

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val evenKeysRemovedFromMap = map.removeIf { it.key % 2 == 0 }
    println("Original Map: $map") // Output: {1=one, 3=three, 5=five}
    println("Removed even keys from map: $evenKeysRemovedFromMap") // Output: true
} 