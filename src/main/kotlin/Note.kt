class Note : GeneralClass() {
    private val notesList = mutableListOf<String>()

    override fun menu() {

        while (true) {
            printMenu()
            while (!checkNum()) {
                printMenu()
            }
            if (checkZero()) {
                println("Напишите текст для заметки")
                if (notesList.isEmpty()) {
                    notesList.add("Текст заметки:\n${addMenuText()}")
                    continue
                }
                notesList.add(addMenuText())
                continue
            }
            when {
                choice == 1 -> break
                choice > 1 -> {
                    println("Данного пункта не существует")
                    continue
                }
            }
        }
    }
    override fun printMenu() {
        println("Заметка:")
        println("0. Написать текст в заметку")
        println("1. Выход")
        notesList.forEach { println(it) }

    }

}

