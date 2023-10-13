
generate-sources:
	find ./src/ -type f -name "*.java" > sources.txt  

compile:
	javac -d ./out/ @sources.txt

run:
	cd out && java annotations.AnnotationsPoc
