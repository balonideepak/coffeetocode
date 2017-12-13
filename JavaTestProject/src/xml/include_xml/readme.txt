test.xml includes para1.xml
but we can't see the content of included xml. So need to run below command 

$ xmllint --dropdtd --noent test.xml > test.html


Now open the test.html .