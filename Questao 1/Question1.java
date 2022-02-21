public class Question1 {
    public static void main(String[] args) {
        int n = 6;
        int asterisk = 1;
        int spaces = n-1;

        //validacão
        if (n>0) {
            for (int i = 0; i < n; i++) {

                //imprime espacos
                for (int j=0; j < spaces; j++){
                    System.out.print(" ");
                }

                //imprime asteriscos
                for (int j = 0; j < asterisk; j++){
                    System.out.print("*");
                }

                //remover espacos
                spaces--;
                //adicionar asteriscos
                asterisk++;

                //pular linha
                System.out.println("");
            }
        }else {
            System.out.print("insira um número positivo");
        }

    }
}
