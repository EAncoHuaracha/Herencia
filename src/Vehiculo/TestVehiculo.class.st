Class {
	#name : #TestVehiculo,
	#superclass : #TestCase,
	#category : #Vehiculo
}

{ #category : #tests }
TestVehiculo >> testInicializacion [
	|c m|.
	c := Coche new.
	m := Moto new.
	self assert: c nroRuedas + m nroRuedas equals: 6.
]

{ #category : #tests }
TestVehiculo >> testTipoNroRuedas [
	|tmp|
	tmp := Coche new nroRuedas + Moto new nroRuedas.
	
	self assert: tmp equals: 6.
]

{ #category : #tests }
TestVehiculo >> testVehiculoTipo [

	self assert: Vehiculo new tipo equals: 'Soy un vehiculo'.
	self assert: Coche new tipo equals: 'Soy un coche'.
	self assert: Moto new tipo equals: 'Soy una moto'.
]
