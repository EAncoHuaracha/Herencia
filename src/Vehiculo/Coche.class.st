Class {
	#name : #Coche,
	#superclass : #Vehiculo,
	#category : #Vehiculo
}

{ #category : #initialization }
Coche >> initialize [ 
	nroRuedas:=4.
]

{ #category : #accessing }
Coche >> nroRuedas [
	^ nroRuedas.
]

{ #category : #announcement }
Coche >> tipo [
	^ 'Soy un coche'.
]
