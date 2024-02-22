class Gezeta(data: String) {
    var nazv="Unnamed"
    var nomer=0
    var datav="Unnamed"
    var price=0.0
    var skidka=0.0
    var genre="Unnamed"
    init
    {
        datav=data
    }
    fun Input (gezeta: Gezeta) {
        try {
            println("Введите название газеты")
            gezeta.nazv = readLine()!!.toString()
            do {
                println("Введите номер газеты")
                gezeta.nomer = readLine()!!.toInt()
            } while (nomer <= 0)

        } catch (e: Exception) {
            println("введено некорректно")
        }
    }
    fun Genre(gezeta: Gezeta)
    {
        do
        {
            println("Выберите жанр журнала (хроника, интервью, репортаж, статья)")
            gezeta.genre=readLine()!!.toString()
        }while(gezeta.genre!="хроника"&&gezeta.genre!=" интервью"&&gezeta.genre!="репортаж"&&
            gezeta.genre!="статья")
    }
    fun Price(gezeta: Gezeta)
    {
        do
        {
            println("Введите цену")
            gezeta.price= readLine()!!.toDouble()
        }while(price<0)

    }

    fun Skidka(gezeta: Gezeta)
    {
        println("Если ваша книга относится к жанру статья или хроника, скидка 20%")
        if (gezeta.genre=="статья" || gezeta.genre=="хроника" )
        {
            gezeta.skidka=gezeta.price*0.8
        }
        else
        {
            println("Скидки нет")
        }

    }

    fun Output(gezeta: Gezeta)
    {
        println("\nНазвание газеты: ${gezeta.nazv} \nНомер газеты: ${gezeta.nomer}" +
                " \nДата выпуска: ${gezeta.datav} \nЖанр журнала: ${gezeta.genre} " +
                "\nЦена: ${gezeta.price} рублей \nЦена со скидкой: ${gezeta.skidka}")
    }
}