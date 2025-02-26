package Projetos.Loja_Online;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Interface {
    public static void main(String[] args) {
        // Criação do JFrame
        JFrame janelaFrame = new JFrame("LOJA ONLINE");
        janelaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janelaFrame.setMinimumSize(new Dimension(420, 720));
        janelaFrame.setLayout(new BorderLayout());

        // Criação do painel principal com BoxLayout vertical
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(255,240,245));

        // Criação do primeiro painel
        JPanel menuPanel = createMenuPanel();
        mainPanel.add(menuPanel);

        // Criação do segundo painel
        JPanel searchPanel = createSearchPanel();
        mainPanel.add(searchPanel);

        // Criação do terceiro painel
        JPanel productsPanel = createProductsPanel();
        mainPanel.add(productsPanel);

        // Criação do quarto painel
        JPanel optionsPanel = createOptionsPanel();
        mainPanel.add(optionsPanel);

        // Adiciona o painel principal ao JFrame
        janelaFrame.add(mainPanel);
        janelaFrame.setVisible(true); // Torna a janela visível
    }

    // Primeiro painel
    private static JPanel createMenuPanel() {
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(255,240,245));
        menuPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT); // Centraliza o painel horizontalmente

        return menuPanel; // Retorna o painel
    }

    // Segundo painel
    private static JPanel createSearchPanel() {
        JPanel searchPanel = new JPanel();
        searchPanel.setBackground(new Color(255,240,245));
        searchPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT); // Centraliza o painel horizontalmente

        return searchPanel; // Retorna o painel
    }

    // Terceiro painel
    private static JPanel createProductsPanel() {
        JPanel productsPanel = new JPanel();
        productsPanel.setBackground(new Color(255,240,245));
        productsPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT); // Centraliza o painel horizontalmente

        return productsPanel; // Retorna o painel
    }

    // Quarto painel
    private static JPanel createOptionsPanel() {
        JPanel optionsPanel = new JPanel();
        optionsPanel.setBackground(new Color(255,240,245));
        optionsPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT); // Centraliza o painel horizontalmente

        return optionsPanel; // Retorna o painel
    }
}