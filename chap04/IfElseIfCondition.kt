package chap04.section1

fun main(){
	print("Enter the score :")
	val score = readLine()!!.toDouble() //readLine은 문자열을 읽어들이는 함수, toDouble은 실수형으로 바꾸어줌
	//이때 실수로 바꾸지 못하는 것이 들어왔을때 예외가 발생할 수 있기 때문에 예외를 막기위한 !!(non_null)이라는 단정기호를 받아들어야함,
	//하지만 non_null이기 때문에 null한 경우 예외를 발생시킬 수 있음
	var grade : Char = 'F'
	
	if(score >= 90.0)
		{
			grade = 'A'
		}else if (score >=80.0 && score <=89.9)
		{
			grade = 'B'
		}
	else if (score >= 70.0 && score <= 79.9)
		{
			grade = 'C'
		}
	
	println("Score : $score, Grade : $grade");
}