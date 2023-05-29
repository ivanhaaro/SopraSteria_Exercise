package Exercise1;

public class Exercise1 {

    //He asumido que el metodo leerNumero no era necesario implementarlo.

    public boolean isEven() {
        int numero = leerNumero();

        for(int i = numero; i >= 0; i-=2) {
            System.out.println(i);
        }

        return numero % 2 == 0;      
    }
}