package chap03.section3

 fun main()
{
	var result : Int
	val multi = { x: Int, y:Int -> y*x}
	result = multi(10,20)
	println(result)
}