public class Arqueiro extends Personagem{
    //lista de itens arqueiro
    public void Suprema(inimigo){
        int ataque = numeroAleatorio() + getModificadorAtaquePersonagem() + 2;

        if(ataque > inimigo.getClasseDeArmadura()) {
            inimigo.setInimigoVida(inimigo.getInimigoVida -= (this.danoPersonagem * 2));
            System.out.println("ACERTOU!");
            System.out.println("O Arqueiro se prepara e usa uma grande rajada de flechas no inimigo, causando "+ (danoPersonagem*2) + " de dano");
        }
        else {
            System.out.println("ERROU!");
        }
    }
}
