## Newton
Version of JSON, with readability in mind.

It is based on YAML and is built using ANTLR with java bindings. Built upon the listener architecture.

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
