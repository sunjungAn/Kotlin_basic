package chap04.section1

fun main()
{
	print("Enter the score: ")
	var score = readLine()!!.toDouble()
	var grade: Char = 'F'
	
	when{ //인자가 없음
		score >= 90.0 -> grade = 'A'
		score in 80.0..89.9 -> grade = 'B'
		score in 70.0..79.9 -> grade = 'C'
		score < 70.0 -> grade = 'F'
	}
	println("Score : $score, Grade : $grade")
}