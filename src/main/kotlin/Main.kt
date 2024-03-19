fun main() {
    var numbers: Array<Int> = arrayOf(2, 1, 3, 4, 5, 6, 7, 8, 9)
    var sum = 0
    numbers.forEach { x: Int ->
        if (x % 2 == 0) {
            sum += x
        }

        println(sum)

        var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
        var result = numbers[7] + numbers[12]
        println(result)
        var arrange = numbers.sortedArrayDescending()
        println(arrange.contentToString())
         var new = numbers.maxOrNull()
        println(new)

    }
}