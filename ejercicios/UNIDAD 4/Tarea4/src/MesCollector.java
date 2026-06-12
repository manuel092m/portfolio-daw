public class MesCollector {
    private int mes;
    private int anyo;
    private int diasMes;
    private int[] temperatura;

    public MesCollector(int mes, int anyo) {
        this.mes = mes;
        this.anyo = anyo;
        this.temperatura = new int[31];

        if (mes<1 || mes >12){
            diasMes =0;
        }else if (mes == 2){
            diasMes = 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            diasMes = 30;
        } else {
            diasMes =31;
        }
    }

    public int getTemperatura(int dia) {
        if (dia<1 || dia>diasMes){
            return -1;
        }
        return temperatura[dia - 1];
    }

    public void setTemperatura(int dia, int temp){
        if (dia<1 || dia>diasMes){
            return;
        }
        temperatura[dia-1] = temp;
    }

    @Override
    public String toString(){

        String resultado = "Mes: "+mes +
                            "\nAño: "+anyo +
                            "\nDías del mes: "+diasMes+ "\n";

        for (int i = 0;i<diasMes;i++){
            resultado = resultado + "Dia "+ (i + 1) + ": ";

            if (temperatura[i] == 0){
                resultado = resultado + "no hay datos\n";
            }else {
                resultado = resultado + temperatura[i] + "º\n";
            }
        }
            return resultado;
    }
}
