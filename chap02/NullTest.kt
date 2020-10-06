package chap02.section3

fun main(){
	var str1 : String? = "Hello Kotlin"
	//?를 사용하려 null이 가능하게 함.
	str1 = null
	println("str1 : $str1")
	println("str: $str1 length : ${str1?.length}")//null을 허용하면 length가 허용되지 않음
	val len = if(str1 != null) str1.length  else -1
	println("str1 : $str1 length : ${len}") //그냥 null인것을 검사해서 출력
	
}
