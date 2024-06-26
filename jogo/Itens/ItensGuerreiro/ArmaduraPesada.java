package jogo.Itens.ItensGuerreiro;

import jogo.personagens.herois.Personagem;

public class ArmaduraPesada extends ItemGuerreiro
{
    private int aumentoDefesa;

    public ArmaduraPesada()
    {
        this.aumentoDefesa = 4;
    }

    @Override
    public void Usar(Personagem usuario)
    {
        usuario.setClasseDeArmaduraPersonagem(aumentoDefesa + usuario.getClasseDeArmaduraPersonagem());        
        System.out.println("Armadura pesada foi equipada, defesa aumentou consideravelmente.");
    }

    @Override
    public String getNome() {
        return "Armadura Pesada";
    }
}
