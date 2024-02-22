fun main()
{
    try
    {
        var gezeta=Gezeta("19.02.2007")
        gezeta.Input(gezeta)
        gezeta.Genre(gezeta)
        gezeta.Price(gezeta)
        gezeta.Skidka(gezeta)
        gezeta.Output(gezeta)
    }catch (e:Exception)
    {
        println("введено некорректно");
    }
}