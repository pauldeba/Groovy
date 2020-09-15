package test.activity

class Exercise1_Groovy {
	public static void main(def args) {
		def x
		int y
		def arr = [2,3.0,'Saahil',true,x,y]
		
		arr.each { println "value is : "+ it + " .//Data type is: "+it.getClass()}
		
		
	}
}
