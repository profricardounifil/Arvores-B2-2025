public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria(59);
        arvoreBinaria.inserirRecursivoRedirecionamentoOtimizado(90);
        arvoreBinaria.inserirRecursivoRedirecionamentoOtimizado(-2);
        arvoreBinaria.inserirRecursivoRedirecionamentoOtimizado(10);
        arvoreBinaria.inserirRecursivoRedirecionamentoOtimizado(3);
        arvoreBinaria.visualizar();
        //System.out.println(arvoreBinaria.estaVazia());
    }
}