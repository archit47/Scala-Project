object Anagrams{
	
	def main(args: Array[String]){

	val words = List ("hello","oellh", "wall","lawl","awll","the","a","leloh","wonderful")
	words.foreach(println)

	val anagram_map = words.filter(_.length > 3).groupBy(_.sorted)
	println(anagram_map)

	val anagram_map1 = words.filter(_.length > 3).groupBy(_.sorted).values
	// values method returns 'MapLike'
	println(anagram_map1)
	}
}