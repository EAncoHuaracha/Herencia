#include "Cuadrado.h"
#include <iostream>

Cuadrado::Cuadrado(double lado){
  this->lado = lado;
}
double Cuadrado::area(){
  return lado * lado;
}

double Cuadrado::perimetro(){
  return 4 * lado;
}
