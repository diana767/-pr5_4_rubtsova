fun main()
{
    try {
        println("введите какова температура в комнате")
        var a= readLine()
        var b=a!!.toInt()
        when
        {
            (b<0)-> println("температура комнаты слишком низкая")
            (b>20&&b<30)-> println("температура комнаты нормальная")
            (b>30&&b<60)-> println("температура комнаты повышенна")
            (b>60)-> println("Пожарная ситуация")
        }
    }
    catch(e:Exception){ println("неправильный ввод")}
}