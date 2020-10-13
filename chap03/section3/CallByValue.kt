package chap03.section3

fun main()
{
	val result = callByValue(lamda())
	println(result)
}

fun callByValue(b : Boolean):Boolean{
	println("callByValue function")
	return b
}

val lamda : () -> Boolean={
	println("lamda function")
	true //마지막 표현식 문장의 결과가 반환
}