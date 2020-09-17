package test.activity

class Exercise7_Groovy {

	static void main(args) {
		// create file
		def file = new File("./src/tester.txt")
		file.createNewFile()
		// writing to the file
		file.write("A quick brown Fox jumped over the lazy Cow\n")
		file.append("John Jimbo jingeled happily ever after\n")
		file.append("Th1\$ 1\$ v3ry c0nfus1ng")
		println "Match Operations:"
		//Print the line that ends with "Cow"
		file.eachLine { line ->
			if(line==~ /^A.*Cow$/) {
				println "Line that ends with 'Cow' is: $line"
			}
		}
		//Print the line that starts with "J"
		file.eachLine { line ->
			if(line ==~ /^J.*/) {
				println "Line that Start with 'J' is: $line"
			}
			
		}
		
		//Print the line has two number one after the other
		file.eachLine { line ->
			if(line ==~ /.*\d\d.*/) {
				println "Line has two number one after the other is : $line"
			}
		}
		
		//Print the string(s) that match the pattern '\S+er'
		println "\n\nFind Operations:"
		def match1 = file.getText() =~ /\S+er/
		println "String(s) matching '/\\S+er/' are: ${match1.findAll()}"
		
		def match2 = file.getText() =~ /\S*\d\W/
		println "String(s) matching '/\\S*\\d\\W/' are: ${match2.findAll()}"
		
	}
}
