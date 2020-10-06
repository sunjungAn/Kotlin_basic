package chap02.section3

fun main(){
	var str1 : String? = "Hello Kotlin"
	str1 = null
	println("str1 : $str1 length: ${str1?.length ?: -1}")
	//엘비스 연산자 --> ${str1?.length ?: -1} str1이 null이면 -1
	
}