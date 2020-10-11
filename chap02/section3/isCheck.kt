package chap02.section3

//자료형 검사하기 is

fun main(){
	val num = 256
	if(num is Int)
		{
			print(num)
		}
	else if(num !is Int) //아닐때를 뜻한다 표현 주의해서 볼것
		{
			print("Not a Int");
		}
}