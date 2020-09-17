package test.activity

class Exercise6_Groovy {

	static void main(args) {
		// TODO Auto-generated method stub
		def map = [:]
		map.put(1, "Cat")
		map.put(2, "Tiger")
		map.put(3, "Dog")
		for(def item:map) {
			println item
		}
		
		map.each { item -> println "$item" }
		//Merge new key-value pairs
		def newMap = map.plus([4:"Hourse",5:"Donkey"])
		println newMap
		// print the value in ascending order
		println newMap.sort()
		println newMap.values().sort()
		println newMap.values().sort { it.length() }
		
	}
}
