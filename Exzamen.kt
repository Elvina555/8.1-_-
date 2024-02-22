class Exzamen(data: String)
{
    var name="Unnamed"
    var predmet="Unnamed"
    var datae="Unnamed"
    init
    {
        datae=data
    }
    var ball=0
    var bonys=0
    var rez="Unnamed"
    var doppred="Unnamed"
    fun Input (exzamen:Exzamen)
    {
        try
        {
            println("Введите имя студента")
            exzamen.name = readLine()!!.toString()
            do
            {
                println("Выберите предмет: математика, русский, биология, химия, физика, английский")
                exzamen.predmet= readLine()!!.toString()
            }while (exzamen.predmet!="математика" && exzamen.predmet!="русский" &&
                exzamen.predmet!="биология" && exzamen.predmet!="химия" &&
                exzamen.predmet!="физика" && exzamen.predmet!="английский")
            do
            {
                println("Выберите оценку за экзамен: 1,2,3,4,5")
                exzamen.ball= readLine()!!.toInt()
            }while (exzamen.ball!=1 && exzamen.ball!=2 && exzamen.ball!=3 && exzamen.ball!=4 && exzamen.ball!=5)
        }catch (e: Exception) {
            println("введено некорректно")
        }
    }
    fun Bonys(exzamen:Exzamen)
    {
        println("За участие в олимпиаде +1 балл. Вы участвовали?")
        var a=readLine()!!.toString()
        if(a=="да")
        {
            if(exzamen.ball==1 || exzamen.ball==2 || exzamen.ball==3 || exzamen.ball==4)
            {
                exzamen.bonys=exzamen.ball+1
            }
        }
    }
    fun Rez(exzamen: Exzamen)
    {
        if(exzamen.ball==1 || exzamen.ball==2 && exzamen.bonys==2 )
        {
            exzamen.rez="Не сдал"
        }
        else
        {
            exzamen.rez="Сдал"
        }
    }
    fun Doppred(exzamen:Exzamen)
    {
        println("Хотите сдать дополнительный предмет?")
        var b= readLine()!!.toString()
        if(b=="да")
        {
            exzamen.doppred="Сдает"
        }
        else
        {
            exzamen.doppred="Не сдает"
        }

    }
    fun Output(exzamen: Exzamen)
    {
        println("\nИмя студента: ${exzamen.name} \nПредмет: ${exzamen.predmet} " +
                "\nДата экзамена: ${exzamen.datae} \nОценка: ${exzamen.ball} " +
                "\nБонус: ${exzamen.bonys} \nДополнительный предмет: ${exzamen.doppred}" +
                " \nРезультат экзамена: ${exzamen.rez}")
    }
}