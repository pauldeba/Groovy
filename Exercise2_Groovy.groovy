package test.activity

class Exercise2_Groovy {

	static void main(args) {
		def marks = [60,79,88,99,100]
		def grade
		def avg=0, sum=0, max=0, min=0
		//Calculate Average
		//marks.each { sum+=it }
		//avg = sum/marks.size() as Integer
		
		avg = marks.average() as int
		println "Avarage is : $avg"
		sum=marks.sum()
		
		println "Maximum Marks: "+marks.max()
		println "Minimum Marks: "+marks.min()
		
		switch(avg){
			case 90..100:
				grade="A"
				break
			case 80..89:
				grade="B"
				break
			case 70..79:
				grade = "C"
				break
			case 50..69:
				grade = "D"
			case 0..49:
				grade ="F"
			default:
				println "Invalid Number"
				break			 
			
		}
		println "Grade is: $grade"
	}
}
