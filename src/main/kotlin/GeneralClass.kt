abstract class GeneralClass {
    abstract fun menu()
    abstract fun printMenu()

    var choice: Int = 0

    fun checkNum(): Boolean {
        val reader = readLine()
        if (reader != null) {
            if (reader.toIntOrNull() == null) {
                println("Вы ввели некорректное значение. Требуется вводить цифры согласно пунктам меню.")
            } else {
                choice = reader.toInt()
                return true
            }
        }
        return false
    }

    fun checkZero(): Boolean {
        if (choice == 0) {
            return true
        }
        return false
    }
    fun addMenuText(): String = readLine().toString()
}

