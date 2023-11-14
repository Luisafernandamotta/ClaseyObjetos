public class Television {
    //atributos
    String nombre;
    String dimension;
    String textura;
    String forma;

    public static void main(String[] args) {
        Television Television1 = new Television();

        Television1.nombre= "samsung";
        Television1.dimension= "32-82 cm";
        Television1.textura= "plastico";
        Television1.forma= "cuadrada";

        System.out.println("el nombre de su Television1 es:"+Television1.nombre);
        System.out.println("la dimension de su Television1 es:"+Television1.dimension);
        System.out.println("la textura de la Television1 es:"+Television1.textura);
        System.out.println("la forma del Television1 es:"+Television1.forma);

        Television Television2 =new Television();

        Television2.nombre= "sony";
        Television2.dimension="51-74 cm";
        Television2.textura="plastico";
        Television2.forma="redondo";

        System.out.println("el nombre de su Television2 es:"+Television2.nombre);
        System.out.println("la dimension de su Television2 es:"+Television2.dimension);
        System.out.println("la textura de su Television2 es:"+Television2.textura);
        System.out.println("la forma de su Television2 es:"+Television2.forma);

        Television Television3 = new Television();

        Television3.nombre= "LG";
        Television3.dimension= "22-66";
        Television3.textura= "plastico";
        Television3.forma= "plano";

        System.out.println("el nombre de su Television3 es:"+Television3.nombre);
        System.out.println("la dimension de su Television3 es:"+Television3.dimension);
        System.out.println("la textura de su Television3 es:"+Television3.textura);
        System.out.println("la forma de su Television3 es:"+Television3.forma);



    }

}
