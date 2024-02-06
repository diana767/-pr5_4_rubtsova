fun main()
{
    try {
        println("введите  трёхзначное число")
        var a= readLine()
        var b=a!!.toInt()
        var sum1 =0
        sum1= a[0].toInt()+a[1].toInt()+a[2].toInt()
        when
        {
            (b/100>0)&&(sum1%5==0)-> println("число трехзначное,сумма цифр кратна 5")
        }
    }
    catch(e:Exception){ println("неправильный ввод")}
    }
