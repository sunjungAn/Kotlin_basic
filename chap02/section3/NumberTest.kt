package chap02.section3

fun main()
{
	var test: Number = 12.2 //스마트 캐스트
	println("$test")
	
	test =12
	println("$test")
	
	test = 120L //Long형으로 캐스트
	println("$test")
	
	test += 12.0f //Float형으로 캐스트
	println("$test")
	
}