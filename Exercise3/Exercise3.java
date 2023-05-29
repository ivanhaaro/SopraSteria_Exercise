package Exercise3;

public class Exercise3 {
    
    //He asumido varias cosas para simplificar el algoritmo:
    //Los metodos leerTarifa() y leerHorasTrabajadas() no he de implementarlos
    //Las horas trabajadas y la tarifa nunca pueden ser negativas

    public double CalcularSalario() {
        int horasTrabajadas = leerHorasTrabajadas();
        double tarifa = leerTarifa();
        int horasExtra = horasTrabajadas > 40 ? horasTrabajadas - 40 : 0;

        return (horasTrabajadas * tarifa) + (horasExtra * tarifa * 1.5);
    }
}
