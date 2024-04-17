public class Personagem{
    int posX = 0;
    int posY = 0;
    String desenho;

    Personagem(int px, int py, String imagem){
        posX = px;
        posY = py;
        desenho = imagem;
    }

    int pos1(){
        return  posX;
    }

    int pos2(){
        return  posY;
    }

    String imagem(){
        return desenho;
    }


}
