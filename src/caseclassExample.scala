case class Time(hours: Int = 0, minutes: Int = 0){
	val asminutes = hours*60 + minutes

	def minus(that: Time): Int = this.asminutes - that.asminutes

	def -(that: Time): Int = minus(that)

	override def toString =
		f"$hours%02d:$minutes%02d"
}

object caseclassExample{
	def main(args: Array[String]) {

		val time1 = Time(8, 40)
		val time2 = new Time (8 , 46)
		val time3 = Time(8, 53)
		val time4 = Time(5)
		val time5 = Time(minutes = 7)
		val time6 = Time(minutes=31, hours=2)

		println(time2.minus(time1))
		println(time3 minus time2)
		println(time3 - time1)
		println(time2.-(time1))

		println(time1)
		println(time2)
		println(time3)
		println(time4)
		println(time5)
		println(time6)

	}
}