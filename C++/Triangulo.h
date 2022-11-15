#ifndef TRIANGULO_H
#define TRIANGULO_H
#include "Calculo.h"

class Triangulo: public Calculo{
  private:
    double base;
    double altura;
  public:
    Triangulo(double, double);
    double area();
    double perimetro();
};

#endif
