package chap02.section3

//Any는 모든 자료형의 뿌리이다. (슈퍼클래스)
fun main()
{
	var a : Any =1
	a = 20L
	println("a : $a type : ${a.javaClass}") //변수.javaClass--> 변수의 자료형을 출력
}