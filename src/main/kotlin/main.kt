fun main(args: Array<String>) {
//    println("Координаты: ")
//    val opp = readLine()!!
//
//    println("Введите значение: ")
//    val list = arrayOf (readLine()!!.toInt(readLine()!!.toInt(readLine()!!.toInt(readLine()!!.toInt()))),  readLine()!!.toInt(readLine()!!.toInt(
//        readLine()!!.toInt(readLine()!!.toInt()))))
//
//    val res: Int = when (opp) {
//        "+" -> list[0] + list [0] + list[0] + list [0]  + list [0] + list[0] + list[0] + list [0]
//        "-" -> list[0] - list[1]
//        "/" -> list[0] / list[1]
//        "*" -> list[0] * list[1]
//        else -> 0
//    }
//
//    println("Итого: ")
//    println(res)
//
//  println("Последовательность Фибоначчи: ")
//
//  var i = 1
//  val n = readLine()!!.toInt()
//  var t1 = 0
//  var t2 = 1
//
//  while (i <= n) {
//          print("$t1 + ")
//          val sum = t1 + t2
//          t1 = t2
//          t2 = sum
//          i++
//     }


//    val table = Array(3, {Array(3, {0})})
//    table[0] = arrayOf(1, 2, 3)
//    table[1] = arrayOf(4, 5, 6)
//    table[2] = arrayOf(7, 8, 9)
////    table[0] = arrayOf(readLine()!!.toInt())
////    table[1] = arrayOf(readLine()!!.toInt())
////    table[2] = arrayOf(readLine()!!.toInt())
//
//    println("Длина матрицы : ")
//    println(table.size)
//    println("Матрицы : ")
//
//
////    table[0] [1] = 77
//
//    val v = table[0] [1]
//
//    for (row in table) {
//
//        for (cell in row) {
//            print("$cell \t")
//        }
//        println()
//    }

//    val a = Array(3) {
//        IntArray(4) {0} }
//
//    println("Тип операции : ")
//    val opp = readLine()!!
//
//    println("Введите значения : ")
////    a[0] = intArrayOf(1, 2, 3, 4)
////    a[1] = intArrayOf(5, 6, 7, 8)
//    a[0] = intArrayOf(readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toInt())
//    a[1] = intArrayOf(readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toInt())
//    a[2] = intArrayOf(readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toInt())
//
////    val res: IntArray = when (opp) {
////        "+" -> a[0] + a[1]
//////        "-" -> list[0] - list[1]
//////        "/" -> list[0] / list[1]
//////        "*" -> list[0] * list[1]
////
////        else -> IntArray (size = 0)
////    }
//
//    println("Итого : ")
//
//    for (i in a) {
//        for (j in i) {
//            print("$j \t")
//        }
//        println()
//    }

}





fun cult() {

     println("Тип математической операции:")
     val opp = readLine()!!

     println("Введите значение ")
     val list = listOf<Int>( readLine()!!.toInt(),  readLine()!!.toInt())

     println("Результат")
//     todo Установить git добавить проект ,сохранить то что есть на данный момент
//      todo Вычислить элементы по списку
//      todo Описать с помщью map
//      todo сделать прогу ввод колво элементов, он тебе столько напечатает элементов фибоначи
//      todo считывание матрицы из консоли 1) длина матрицы 2) ширина матрицы через консоль самому написать матрицу, строковые значения (вычесление суммы диагонали)должен уметь сумму диогоналей, вычислить сумму n-ряда, сумму горизонт, сумму вертикали, с указанием какой именно ты хочешь
//      todo использовать array(можно сразу указать размер элементов)


     val res: Int = when (opp) {
          "+" -> list[0] + list[1]
          "-" -> list[0] - list[1]
          "/" -> list[0] / list[1]
          "*" -> list[0] * list[1]
          else -> 0
     }

     println(res)
}