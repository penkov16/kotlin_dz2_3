fun main(){
    val musicLovers = true  //������� ���������� ��� ���
    val itemPrice = 1000 //��������� ����� ������
    val itemCount = 10 //���������� �������
    val discount = 100 //����������� ������
    val discountStart = 1001 //������ �������� ����������� ������
    val discountFinich = 10000 // ����� �������� ����������� ������
    val totalPrice = itemPrice * itemCount // ��������� �������
    val discountPercent = (totalPrice * 5)/100 // 5% ������

    var result = if(totalPrice >= discountStart && totalPrice <= discountFinich) totalPrice - discount //����������� ������
    else if(totalPrice >= 10001) totalPrice - discountPercent else totalPrice

    if (musicLovers && totalPrice >= discountStart) result -= (result*1)/100 //���. ������, ���� �������

    println(result)
}