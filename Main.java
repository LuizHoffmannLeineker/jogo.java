import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET =  "\u001B[0m";


    static void tabuleiro(int linhas, int colunas,int [] posX, int [] posY, String [] imagem){
        System.out.printf("\n--~--~--~--~--~--~--~--~--~--~--~--\n");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++){
                if(posX[0] - 1 == i && posY[0] - 1 == j)
                    System.out.print("[ " + ANSI_RED +  imagem[0] + ANSI_RESET + " ]" );

                else if(posX[1] - 1 == i && posY[1] - 1 == j)
                    System.out.print("[ " + ANSI_GREEN +  imagem[1] + ANSI_RESET + " ]" );

                else if(posX[2] - 1 == i && posY[2] - 1 == j)
                    System.out.print("[ " + ANSI_GREEN +  imagem[2] + ANSI_RESET + " ]" );

                else
                    System.out.printf("[ . ]");

            }
            System.out.printf("\n");
        }


        System.out.printf("--~--~--~--~--~--~--~--~--~--~--~--\n");
        System.out.printf("    [W]\n");
        System.out.printf("[A] [S] [D]\n");
        System.out.printf("[5] - Sair do Menu\n");

    }



    public static void main(String[] args){
            List<Personagem> personagens = new ArrayList<Personagem>();
            Scanner leitor = new Scanner(System.in);
            int [] pos1 = new int[3];
            int [] pos2 = new int[3];
            String [] simbolo = new String[3];
            String opcao;
            int aux = 0;

            personagens.add(new Personagem(4, 4, "X"));
            personagens.add(new Personagem(2, 6, "$"));
            personagens.add(new Personagem(6, 7, "$"));

            for(int i = 0; i < 3; i++) {
                pos1[i] = personagens.get(i).pos1();
                pos2[i] = personagens.get(i).pos2();
                simbolo[i] = personagens.get(i).imagem();
            }


            do {
                tabuleiro(7, 7, pos1, pos2, simbolo);

                System.out.printf("--~--~--~--~--~--~--~--~--~--~--~--\n");
                System.out.printf("Informe um caracter de acordo com as opçoes: ");
                opcao = leitor.nextLine();

                switch (opcao){

                    case "W":
                        pos1[0]--;
                    break;

                    case "S":
                        pos1[0]++;
                    break;

                    case "A":
                        pos2[0]--;
                    break;

                    case "D":
                        pos2[0]++;
                    break;

                    default:
                    break;


                }


                if(opcao.equals("5")){
                    aux = 5;
                }
                else{
                    tabuleiro(7, 7, pos1, pos2, simbolo);
                }

            }while(aux != 5);
    }



}