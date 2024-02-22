fun main()
{
    try
    {
        var exzamen=Exzamen("1.07.2024")
        exzamen.Input(exzamen)
        exzamen.Bonys(exzamen)
        exzamen.Doppred(exzamen)
        exzamen.Rez(exzamen)
        exzamen.Output(exzamen)
    }catch (e:Exception)
    {
        println("введено некорректно");
    }
}