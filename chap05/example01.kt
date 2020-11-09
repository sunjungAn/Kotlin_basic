class NotEmailForm(message : String) : Exception(message)
class NotpwForm(message : String) : Exception(message)

fun main()
{
	val email = readLine().toString()
	val pw = readLine().toString()
	try{
		checkemail(email)
	}catch(e : NotEmailForm)
	{
				println(e.message)
	}
	try{
		checkpw(pw)
	}catch(e : NotpwForm)
	{
		println(e.message)
	}
}

fun checkemail(email : String)
{
	if('@' !in email){
		throw NotEmailForm("email : $email, not email form")
	}
	else if('.' !in email){
		throw NotEmailForm("email : $email, not email form")
	}
	
}

fun checkpw(pw: String)
{
	if(pw.length < 8)
		throw NotpwForm("password: $pw, not password form")
	else println("success sign up!")
}
