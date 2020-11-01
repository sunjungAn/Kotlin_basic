package chap04.section1
fun main()
{
	cases("Hello")
	cases(1)
	cases(System.currentTimeMillis()) //현재 시간을 Long형 값으로 반환
	cases(true) 
}
fun cases(obj : Any) ///Any형 변수로 매개변수로 받음
{
	when(obj)
	{
		1 -> println("Int : $obj")
		"Hello" -> println("String : $obj")
		is Long -> println("Long : $obj")
		!is String -> println("Not a String")
		else -> println("Unknown")
	
	}
}
//여기서 알게 된 형식 --> when은 위 조건에서 아래조건으로 이동하여 검사를 하는데, 위에서 하나라도 맞으면 break로 빠져나와서
// 아래에 맞는 조건이 있더라도 수행이 되지 않는다. 