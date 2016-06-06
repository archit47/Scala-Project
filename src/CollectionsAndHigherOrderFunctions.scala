object CollectionsAndHigherOrderFunctions{
	
	def main( args: Array[String]){


		var numbers = List(2,3,4,5)

		var newNums = numbers.map(num => num*2)

		println("Original List")
		numbers.foreach(println)

		println("New List")
		newNums.foreach(println)

		var againNewNums = numbers.map(times3)
		println("Second new list:")
		againNewNums.foreach(println)

		var overList = numbers.map(_ * 2)
		println("Underscored list:")
		overList.foreach(println)

		var trying1 = numbers.foreach(times3)
		println("Trying1 list:")
	//	trying1.foreach(println)
		println(trying1)
		println("Numbers List after trying1:")
		numbers.foreach(println)


		var parallel_execution = numbers.par.map(x => x*5)
		println("parallel_execution list:")
		parallel_execution.foreach(println)





	val strings = List("Donny", "testing", "test","test1", "Jonny")
	val byLength = strings.groupBy(_.length)
	println(byLength)
	
	println(byLength(5))
	println(byLength(7))

	val byChar = strings.groupBy(_.charAt(0))
	println(byChar)
	println(byChar('t'))	


	// Mutable Map
	val map = scala.collection.mutable.Map("a" -> 5, "b" -> 1).withDefaultValue(0)
	println(map)

	map("a") += 1
	println(map)

	/*
	 Notice that the following key doesn't exists in the map. If the map is initialized with a DefaultValue then the following code with throw a
	 a java.lang.NoSuchElement exception. But now that we have used a withDefaultValue method, the new keys will be assigned the default value(0) provided.
	*/
	map("c") += 1
	println(map)


	var im_map = scala.collection.immutable.Map("x" -> 3, "y" -> 8)
	println(im_map)

	try{
	
	// Following piece of code throws an error since we are using a immutable 
	
//	im_map("y") += 9
//	im_map("y") = 9
	
	}catch{
		case _ : Exception => println("Oops this is an exception. Map is immutable.")
	}
	println(im_map) 

	
	// Default Map
	val map_check = Map("p" -> 16, "o" -> 15, "n" -> 13)
	
	try{

//	map_check("n") += 1
//	map_check("n") = 1
	
	}catch{
		case _ : Throwable => println("Oops this is an exception. Map is immutable.")
	}
	println(map_check)



	val list_check = List(1,3,5,7,11)
	println(list_check(0))


	//	list_check(0) = 2
//	println(list_check(0))


	}

	def times3(num: Int) ={
		num*3
	}
}