fun main(){
    val musicLovers = true  //меломан покупатель или нет
    val itemPrice = 1000 //стоимость одной записи
    val itemCount = 10 //количество записей
    val discount = 100 //стандардная скидка
    val discountStart = 1001 //начало действия стандартной скидки
    val discountFinich = 10000 // конец действия стандартной скидки
    val totalPrice = itemPrice * itemCount // стоимость покупки
    val discountPercent = (totalPrice * 5)/100 // 5% скидка

    var result = if(totalPrice >= discountStart && totalPrice <= discountFinich) totalPrice - discount //определение скидки
    else if(totalPrice >= 10001) totalPrice - discountPercent else totalPrice

    if (musicLovers && totalPrice >= discountStart) result -= (result*1)/100 //доп. скидка, если меломан

    println(result)
}