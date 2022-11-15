#include "Triangulo.h"
#include "Cuadrado.h"
#include <iostream>
using namespace std;

void area(Calculo* f){
  cout << "El area es: " << f->area() << "\n";
}

void perimetro(Calculo* f){
  cout << "El perimetro es: " << f->perimetro() << "\n";
}

int main(){
  Calculo* figura = new Cuadrado(5);
  area(figura);
  perimetro(figura);
  
  figura = new Triangulo(5,6);
  area(figura);
  perimetro(figura);
}

