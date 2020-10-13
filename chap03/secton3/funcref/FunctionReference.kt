package chap03.secton3.funcref

fun main(){
	val res1 = funcParam(3,2, ::sum)
	println(res1)
	
	hello(::text) //--> (int, int) ->Int
	
	val likeLambda = ::sum // sum : (int, int)->Int
	println(likeLambda(6,6))
	
}

fun sum(a:Int, b:Int) = a+b

fun text(a : String, b:String) = "Hi! $a $b"

fun funcParam(a: Int, b:Int, c:(Int, Int)->Int):Int{
	return c(a,b)
}

fun hello(a:(String, String)-> String):Unit{
	println(a("Hello", "World"))
}