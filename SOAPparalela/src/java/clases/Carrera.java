
package clases;


public class Carrera { //Clase carrera   
    int codigo; //a, Código de la carrera
    String nombre; //b, Nombre de la carrera
    double pnem; //c, Porcentaje de puntaje nem de la carrera
    double pranking; //d, Porcentaje de puntaje ranking de la carrera
    double plenguaje; //e, Porcentaje de puntaje lenguaje de la carrera
    double pmatematica; //f, Porcentaje de puntaje matematica de la carrera
    double pcienciahistoria; //g, Porcentaje de puntaje ciencia/historia de la carrera
    double puntajeprom; //h, Puntaje promedio minimo de postulación PSU entre lenguaje y matemática
    double puntajeminimo; //i, Puntaje mínimo ponderado, claramente UTEM no cuenta con ello
    int vacantes; //j, Cantidad de vacantes
    double primerpuntaje; //k, Primer puntaje matriculado
    double ultimopuntaje; //l, Ultimo puntaje matriculado

    //Constructor necesario
    public Carrera(int a, String b, double d, double e, double f, double g, double k, double h, double i, int j, double m, double l) {
        codigo = a;
        nombre = b;
        pnem = d;
        pranking = e;
        plenguaje = f;
        pmatematica = g;
        pcienciahistoria = k;
        puntajeprom = h;
        puntajeminimo = i;
        vacantes = j;
        primerpuntaje = m;
        ultimopuntaje = l;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPnem() {
        return pnem;
    }

    public double getPranking() {
        return pranking;
    }

    public double getPlenguaje() {
        return plenguaje;
    }

    public double getPmatematica() {
        return pmatematica;
    }

    public double getPcienciahistoria() {
        return pcienciahistoria;
    }

    public double getPuntajeprom() {
        return puntajeprom;
    }

    public double getPuntajeminimo() {
        return puntajeminimo;
    }

    public int getVacantes() {
        return vacantes;
    }

    public double getPrimerpuntaje() {
        return primerpuntaje;
    }

    public double getUltimopuntaje() {
        return ultimopuntaje;
    }
    
}
