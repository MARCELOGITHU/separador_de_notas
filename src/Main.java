import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Separador separador = new Separador();
        //System.out.println(separador.mostrarListaDeNotas());

        ArrayList<Double> listaNotasQueDaoOTotal = new ArrayList<>();

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor em dinheiro");
        double respotaNotaInicial = leitura.nextDouble();

        for (int i = 0; i < separador.getListaDeNotas().length; i++) {
            double[] lista = separador.getListaDeNotas();

            if (respotaNotaInicial >= lista[i]){
                System.out.println("subtraindo " + respotaNotaInicial + " por " + lista[i] );
                double sobra = respotaNotaInicial - lista[i];
                listaNotasQueDaoOTotal.add(lista[i]);
                sobra = Math.round(sobra*100.0)/100.0;//expressão para arredondar double para duas casas decimais
                respotaNotaInicial = sobra;
                System.out.println(sobra);
                if (sobra == 0){
                    break;
                }
                i = -1;
            }
        }
        System.out.println("Valor separado em notas de: " + listaNotasQueDaoOTotal);
    }
}