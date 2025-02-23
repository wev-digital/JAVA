package Projetos.Loja_Online;

import javax.swing.JFrame;
import javax.swing.plaf.DimensionUIResource;

public class Interface{
    public static void main(String[] args) {
        JFrame janelaFrame = new JFrame("LOJA ONLINE");
        janelaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaFrame.setSize(new DimensionUIResource(420, 720)); // Tamanho médio dos maiores
        janelaFrame.setMinimumSize(new DimensionUIResource(375, 667)); // Tamanho médio dos menores

        janelaFrame.setVisible(true); // Visibilidade da janela ON
    }
}