class Notes(private val name: String = "") : GeneralClass() {
    private val note = Note()
    private val notesList = mutableListOf<Notes>()

    override fun menu() {
        while (true) {
            printMenu()
            while (!checkNum()) {
                printMenu()
            }
            if (checkZero()) {
                println("Задайте название Заметки")
                notesList.add(Notes("${notesList.size + 1}. ${addMenuText()}"))
                continue
            }
            when {
                choice == notesList.size + 1 -> break
                choice > notesList.size + 1 || choice < 0 -> {
                    println("Данного пункта не существует")
                    continue
                }
            }
            notesList[choice - 1].note.menu()
        }
    }

    override fun printMenu() {
        println("Список заметок:")
        println("0. Создать заметку")
        notesList.forEach { println(it.name) }
        println("${notesList.size + 1}. Выход")
    }

}