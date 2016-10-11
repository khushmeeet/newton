## Newton
Version of JSON, with readability in mind.

It is based on YAML and is built using ANTLR with java bindings. Built upon the listener architecture.

## How to Use
First install ANTLR jar file.

	$ cd /usr/local/lib
	$ sudo curl -O http://www.antlr.org/download/antlr-4.5.3-complete.jar

Then, if your are on macOs or Linux , you can use ```sh automate.sh``` to run the build process. This will generate the ```lexer``` and ```parser``` from the specified grammar and then it will compile those classes into the gen folder, and use those classes to run the parser on the example file provided in the example folder.

An update is coming that will create gen folder , when ```automate.sh``` is run for the first time.

For windows , to install ANTLR

	Download http://antlr.org/download/antlr-4.5.3-complete.jar.
	Add antlr4-complete.jar to CLASSPATH, either:
	Permanently: Using System Properties dialog > Environment variables > Create or append to CLASSPATH variable
	Temporarily, at command line:
	SET CLASSPATH=.;C:\Javalib\antlr4-complete.jar;%CLASSPATH%
	Create batch commands for ANTLR Tool, TestRig in dir in PATH
	 antlr4.bat: java org.antlr.v4.Tool %*
	 grun.bat:   java org.antlr.v4.gui.TestRig %*

Unfortunatly there is no ```.bat``` file at the moment to run the build process on windows. You have to it manually.
For windows, create ```gen``` folder at the root. Run ```antlr4``` on the grammar and specifies to the to be /src/.
then run ```javac``` command on the generated java files and specify the output directory to be /gen at the root.
and run ```java``` to execute the class file.

API - coming soon 

Also parser API is also coming is javascript, to be integrated in build process.

### This is Newton
```
# Following is the array of objects taken from https://jsonplaceholder.typicode.com/users

- id: 1
  name: Leanne Graham
  username: Bret
  email: Sincere@april.biz
  address: 
        street: Kulas Light
        suite: Apt. 556
        city: Gwenborough
        zipcode: 929983874
        geo: 
                lat: -37.3159
                lng: 81.1496
  phone: 17707368031 x56442
  website: hildegard.org
  company: 
        name: RomagueraCrona
        catchPhrase: Multilayered clientserver neuralnet
        bs: harness realtime emarkets
- id: 2
  name: Ervin Howell
  username: Antonette
  email: Shanna@melissa.tv
  address: 
        street: Victor Plains
        suite: Suite 879
        city: Wisokyburgh
        zipcode: 905667771
        geo: 
                lat: -43.9509
                lng: -34.4618
  phone: 0106926593 x09125
  website: anastasia.net
  company: 
        name: DeckowCrist
        catchPhrase: Proactive didactic contingency
        bs: synergize scalable supplychains
- id: 3
  name: Clementine Bauch
  username: Samantha
  email: Nathan@yesenia.net
  address: 
        street: Douglas Extension
        suite: Suite 847
        city: McKenziehaven
        zipcode: 595904157
        geo: 
                lat: -68.6102
                lng: -47.0653
  phone: 14631234447
  website: ramiro.info
  company: 
        name: RomagueraJacobson
        catchPhrase: Face to face bifurcated interface
        bs: e_enable strategic applications

```

### This is JSON
Some formatting still needs to be done.
```javascript
    [{
	 id: 1,
	name: Leanne Graham,
	username: Bret,
	email: Sincere@april.biz,
	address: {
	street: Kulas Light,
	suite: Apt. 556,
	city: Gwenborough,
	zipcode: 929983874,
	geo: {
	lat: -37.3159,
	lng: 81.1496
}
},
	phone: 17707368031 x56442,
	website: hildegard.org,
	company: {
	name: RomagueraCrona,
	catchPhrase: Multilayered clientserver neuralnet,
	bs: harness realtime emarkets
}
},{
	 id: 2,
	name: Ervin Howell,
	username: Antonette,
	email: Shanna@melissa.tv,
	address: {
	street: Victor Plains,
	suite: Suite 879,
	city: Wisokyburgh,
	zipcode: 905667771,
	geo: {
	lat: -43.9509,
	lng: -34.4618
}
},
	phone: 0106926593 x09125,
	website: anastasia.net,
	company: {
	name: DeckowCrist,
	catchPhrase: Proactive didactic contingency,
	bs: synergize scalable supplychains
}
},{
	 id: 3,
	name: Clementine Bauch,
	username: Samantha,
	email: Nathan@yesenia.net,
	address: {
	street: Douglas Extension,
	suite: Suite 847,
	city: McKenziehaven,
	zipcode: 595904157,
	geo: {
	lat: -68.6102,
	lng: -47.0653
}
},
	phone: 14631234447,
	website: ramiro.info,
	company: {
	name: RomagueraJacobson,
	catchPhrase: Face to face bifurcated interface,
	bs: e_enable strategic applications
}
} ]

```


## TODO
- [x] Listener Implementation
- [ ] Enclosing text in quotes
- [ ] Folded text block
- [ ] Support for hyphen in text
- [ ] Readme.md Update
