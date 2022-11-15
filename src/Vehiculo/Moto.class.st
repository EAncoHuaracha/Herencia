Class {
	#name : #Moto,
	#superclass : #Vehiculo,
	#category : #Vehiculo
}

{ #category : #initialization }
Moto >> initialize [
	nroRuedas:=2.
]

{ #category : #accessing }
Moto >> nroRuedas [
	^ nroRuedas.
]

{ #category : #announcement }
Moto >> tipo [
	^ 'Soy una moto'.
]
