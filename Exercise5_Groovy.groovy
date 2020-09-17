package test.activity

class Exercise5_Groovy {

	static void main(args) {
		// Given List
		def list=[11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		
		def strList = list.minus([11,2,19,5])
		
		def intList = list - strList
				
		println "Sorted StringList are: ${strList.sort()}"
		println "Sorted Integer List are: ${intList.sort()}"
		
		
	}
}
