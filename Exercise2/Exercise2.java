package Exercise2;

public class Exercise2 {

    //He asumido varias cosas para simplificar el algoritmo:
    //Las personas solo pueden ser hombres o mujeres (Por eso he usado un boolean en la clase Persona true == hombre, false == mujer), esto se podría cambiar usando otro tipo de datos.
    //Lo he implementado de dos maneras:
    //La primera no es la más eficiente puesto que se podría hacer todo dentro de un mismo bucle, sin embargo creo que de esta forma es más mantenible y reutilizable.
    //La segunda sin embargo, es la más eficiente.
    //Que el metodo leerPersonas() no lo tenía que implementar.

    public void clasificarPersonas() {
        Persona [] personas = new Persona[50];
        int n = personas.length;
        personas = leerPersonas();

        int numAdultos = getNumAdultos(personas);
        int numMenores = Math.abs(numAdultos - n);
        int numHombres = getNumHombres(personas);
        int numMujeres = Math.abs(numHombres - n);

        System.out.println("Adultos: " + numAdultos);
        System.out.println("Menores: " + numMenores);
        System.out.println("Porcentaje de personas adultas: " + (numAdultos * 100) / n);
        System.out.println("Hombres: " + numHombres);
        System.out.println("Mujeres: " + numMujeres);
        System.out.println("Porcentaje de mujeres: " + (numMujeres * 100) / n);

    }

    public void clasificarPersonasEficiente() {
        Persona[] personas = new Persona[50];
        int n = personas.length;
        personas = leerPersonas();

        int numAdultos = 0;
        int numHombres = 0;

        for(int i = 0; i < n; i++) {
            if(personas[i].getEdad() >= 18) numAdultos++;
            if(personas[i].getSexo()) numHombres++;
        }

        int numMujeres = Math.abs(numHombres - n);
        int numMenores = Math.abs(numAdultos - n);

        System.out.println("Adultos: " + numAdultos);
        System.out.println("Menores: " + numMenores);
        System.out.println("Porcentaje de personas adultas: " + (numAdultos * 100) / n);
        System.out.println("Hombres: " + numHombres);
        System.out.println("Mujeres: " + numMujeres);
        System.out.println("Porcentaje de mujeres: " + (numMujeres * 100) / n);
    }

    private int getNumAdultos(Persona[] personas) {
        int res = 0;

        for(int i = 0; i < personas.length; i++) {
            if(personas[i].getEdad() >= 18) res++;
        }

        return res;
    } 

    private int getNumHombres(Persona[] personas) {
        int res = 0;

        for(int i = 0; i < personas.length; i++) {
            if(personas[i].getSexo()) res++;
        }

        return res;
    }



}
