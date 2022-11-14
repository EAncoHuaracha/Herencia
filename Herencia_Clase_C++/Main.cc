#include "Vehiculo.h"
#include "Coche.h"
#include "Moto.h"
#include <iostream>
int main(){
  Vehiculo* veh = new Vehiculo();
  veh -> tipo();
  veh -> sonido();

  veh = new Coche();
  veh -> tipo();
  veh -> sonido();

  veh = new Moto();
  veh -> tipo();
  veh -> sonido();
  
  delete veh;  
}
