package chap05.section2
class Bird{
	var name: String
	var wing: Int
	var beak: String
	var color: String
	//何积己磊
	constructor(name: String, wing: Int, beak: String, color: String) //积己磊
	{
		this.name = name
		this.wing = wing
		this.beak = beak
		this.color = color
	}
	fun fly() = println("Fly wing: $wing") //皋辑靛
	fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main(){
	val coco = Bird("mybird", 2, "short", "blue")
	
	coco.color = "yello"
	println("coco.color: ${coco.color}")
	coco.fly()
	coco.sing(3)
}