// Fibonacci number
package test.activity

class Exercise3_Groovy {

	static void main(args) {
		def num = 10, a, b,n
		a=0
		b=1
		print "$a , $b "
		//Java way
		for (int i=0;i<num-1;i++) {
			n=a+b
			print ",$n "
			a=b
			b=n
		}
		
		// groovy way
		def num1 = 10, a1, b1,n1
		a1=0
		b1=1
		print "\n$a1"
		num1.times { 
			(a1,b1)=[b1,a1+b1]
			print ", $a1"
			
		}
	}
}
