#include "Triangulo.h"
#include <iostream>

Triangulo::Triangulo(double base, double altura){
  this->base = base;
  this->altura = altura;
}

double Triangulo::area(){
  return base * altura / 2;
}

double Triangulo::perimetro(){
  return 3 * base;
}
