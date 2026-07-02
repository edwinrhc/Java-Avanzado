public class ejemplo {
    public static int modificar(int n){
        n = n + 10;
                return n;
    }

    public static void main(String[] args){
        int resultado = modificar(20);
        System.out.println(resultado);
    }

}
