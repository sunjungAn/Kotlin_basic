class Bird{
	var name: String = "mybird"
	var wing: Int = 2
	var beak: String = "short"
	var color: String = "blue"
	
	fun fly() = println("Fly wing: $wing") //메서드
	fun sing(vol: Int) = println("Sing vol: $vol")
	
}
fun main(){
	val coco = Bird() //coco는 bird클래스의 인스턴스
	coco.color ="blue"
	println("coco.color : ${coco.color}")
	coco.fly()
	coco.sing(3)
	
}