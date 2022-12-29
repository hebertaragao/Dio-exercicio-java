public class Operadores {
    public static void main(String[] args) {
        String nomeUm = "Hebert";
        String nomeDois = new String("Hebert");
        System.out.println(nomeUm.equals(nomeDois));


        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        int numero = 5;
        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);


        //repetição
        //numero++;
        System.out.println(numero ++);
        System.out.println(++ numero);
        System.out.println(numero);

        System.out.println(numero --);
        System.out.println(-- numero);
        System.out.println(numero);
        
        //unário
        boolean variavel = true;
        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel);

        //Ternario
        int a, b;

        a = 6;
        b = 6;
        String resultado = a==b ?"verdadeira" : "Falso";
       
        System.out.println(resultado);

        //relacionais
        int numero1 = 1;
        int numero2 = 2;


        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }
        System.out.println("numero um é igual ao número dois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero um é diferente ao número dois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero um é maior ao número dois? " + simNao);

        // Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;
        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");    
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("fim");
    }
}
