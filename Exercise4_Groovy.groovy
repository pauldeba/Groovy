package test.activity

class Exercise4_Groovy {

	static void main(args) {
		def str = "This is a Groovy Language"
		println "Reverse of the string is: "+str.reverse()
		println "Substring is : "+str.substring(9)
		println "Split the String : "+str.split(" ")
		println "Remove word: "+(str.minus("This is a ")).minus("Language")
		println "Lower Case: "+str.toUpperCase()
		println "Upper Case: "+str.toLowerCase()
		
		//REGEX OPERATIONS
        //matches()
        def matchStatus = str.matches("(.*)Groovy(.*)")
        if(matchStatus) { println "String matches" }
        
        //replaceAll()
        def replaceWith = "very Groovy"
        println(str.replaceAll("Groovy", replaceWith))
        //Notice that the original string is not changed
        println str
		
		
	}
}
