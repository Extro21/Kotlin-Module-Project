class Archive(private val name: String = "") : GeneralClass() {
    private val notes = Notes()
    private var archiveList = mutableListOf<Archive>()

    override fun menu() {

        while (true) {
            printMenu()

            while (!checkNum()) {
                printMenu()
            }
            if (checkZero()) {
                println("Задайте название Архива")
                archiveList.add(Archive("${archiveList.size + 1}. ${addMenuText()}"))
                continue
            }
            when {
                choice == archiveList.size + 1 -> break
                choice > archiveList.size + 1 || choice < 0 -> {
                    println("Данного пункта не существует")
                    continue
                }
            }
            archiveList[choice - 1].notes.menu()
        }
    }

    override fun printMenu() {
        println("Список архивов:")
        println("0. Создать архив")
        archiveList.forEach { println(it.name) }
        println("${archiveList.size + 1}. Выход")
    }

}




