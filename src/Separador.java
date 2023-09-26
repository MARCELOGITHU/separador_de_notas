public class Separador {
    private double [] listaDeNotas;

    public Separador() {
        listaDeNotas = new double[]{200,100,50,20,10,5,2,1,0.5,0.25,0.1,0.05, 0.01};
    }

    public double[] getListaDeNotas() {
        return listaDeNotas;
    }

    public double mostrarListaDeNotas() {
        for (int i = 0; i < listaDeNotas.length; i++) {
            System.out.println(listaDeNotas[i]);
        }
        return 0;
    }
}
