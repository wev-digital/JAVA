package Projetos.Loja_Online;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        mainPanel.setBackground(new Color(255, 240, 245));

        // Criação dos painéis
        JPanel menuPanel = createMenuPanel();
        mainPanel.add(menuPanel);

        JPanel searchPanel = createSearchPanel();
        mainPanel.add(searchPanel);

        JPanel productsPanel = createProductsPanel();
        mainPanel.add(productsPanel);

        JPanel optionsPanel = createOptionsPanel();
        mainPanel.add(optionsPanel);

        // Adiciona o painel principal ao JFrame
        janelaFrame.add(mainPanel);
        janelaFrame.setVisible(true); // Torna a janela visível
    }

    // Primeiro painel: Menu
    private static JPanel createMenuPanel() {
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(255, 240, 245));
        menuPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT); // Centraliza o painel horizontalmente

        // Criação dos componentes
        JButton logoButton = createImageButton("Projetos/Loja_Online/img/Logo.png", 40, 40);

        JLabel logoLabel = new JLabel("Shop Studio Java");
        logoLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Adição dos componentes
        menuPanel.add(Box.createVerticalStrut(50));
        menuPanel.add(logoButton);
        menuPanel.add(Box.createHorizontalStrut(20));
        menuPanel.add(logoLabel);
        menuPanel.add(Box.createHorizontalStrut(20));

        return menuPanel; // Retorna o painel
    }

    // Segundo painel: Busca
    private static JPanel createSearchPanel() {
        JPanel searchPanel = new JPanel();
        searchPanel.setBackground(new Color(255, 240, 245));
        searchPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT); // Centraliza o painel horizontalmente

        // Aqui você pode adicionar componentes de busca, como um campo de texto e um botão

        return searchPanel; // Retorna o painel
    }

    // Terceiro painel: Produtos
    private static JPanel createProductsPanel() {
        JPanel productsPanel = new JPanel();
        productsPanel.setBackground(new Color(255, 240, 245));
        productsPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT); // Centraliza o painel horizontalmente

        // Aqui você pode adicionar componentes para exibir produtos

        return productsPanel; // Retorna o painel
    }

    // Quarto painel: Opções
    private static JPanel createOptionsPanel() {
        JPanel optionsPanel = new JPanel();
        optionsPanel.setBackground(new Color(255, 240, 245));
        optionsPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT); // Centraliza o painel horizontalmente

        // Aqui você pode adicionar opções adicionais, como configurações ou informações

        return optionsPanel; // Retorna o painel
    }

    // Rendenizar as imagens dentro dos botões
    private static JButton createImageButton(String imagePath, int width, int height) {
        // Carregar a imagem
        ImageIcon icon = new ImageIcon(imagePath);
        
        // Verifica se a imagem foi carregada corretamente
        if (icon.getIconWidth() == -1) {
            System.err.println("Erro ao carregar a imagem: " + imagePath);
            return new JButton("Imagem não encontrada"); // Retorna um botão de erro
        }
        
        // Redimensionar a imagem
        Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Criar um novo JButton
        JButton button = new JButton(new ImageIcon(image));
        
        // Configurar o botão
        configureButton(button, width, height);
        
        return button;
    }

    // Método para configurar o botão
    private static void configureButton(JButton button, int width, int height) {
        button.setPreferredSize(new Dimension(width, height)); // Define o tamanho preferido do botão
        button.setBorderPainted(false); // Remove a borda do botão
        button.setContentAreaFilled(false); // Remove o preenchimento do botão
        button.setFocusPainted(false); // Remove o foco visual
    }
}