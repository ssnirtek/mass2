
import kotlin.random.Random
fun main()
{
    println("Данная программа: Имея массив целых чисел из 5-и строк и 5-и столбцов." +
            "\n" + " Выясняет, симметричен ли он относительно главной диагонали.")


    println("Введите размерность массива")
    println("Введите количество строк: ")
    val rows = readLine()!!.toInt()
    println("Введите количество столбцев: ")
    val columns = readLine()!!.toInt()

    val array = Array(rows) { Array(columns) {
        Random.nextInt(1, 500)
    }}

    println("Сгенерированный массив:")
    for (i in 0 until rows) { // i принимает значения от 0 до ровс
        for (j in 0 until columns) {
            print("${array[i][j]} ")
        }
        println()
    }

    if (isSymmetric (array, rows, columns)) { // Проверяем симметричность
        println("Массив симметричен относительно главной диагонали")
    } else {
        println("Массив не симметричен относительно главной диагонали")
    }
}
// Функция проверки симметричности
fun isSymmetric(mas: Array<Array<Int>>, rows: Int, columns: Int): Boolean { //функция с истиной и ложью
// Проходим по массиву, сравнивая элементы относительно диагонали
    for (i in 0 until rows) {
        for (j in i + 1 until columns) {
            if (mas[i][j] != mas[j][i]) {
                return false
            }
        }
    }
    return true
}
