#ifndef CUADRADO_H
#define CUADRADO_H
#include "Calculo.h"
class Cuadrado: public Calculo {
  private:
    double lado;
  
  public:
    Cuadrado(double);
    double area();
    double perimetro();
};

#endif
