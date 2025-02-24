package Projetos.Loja_Online;

import javax.swing.*; 
import java.awt.*;

public class Interface {
    public static void main(String[] args) {
        // Criação da janela principal do aplicativo
        JFrame janelaFrame = new JFrame("LOJA ONLINE");
        janelaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaFrame.setSize(new Dimension(420, 720));
        janelaFrame.setMinimumSize(new Dimension(375, 667));

        // Criação do painel principal da loja
        JPanel homePanel = createHomePanel();
        janelaFrame.add(homePanel);

        janelaFrame.setVisible(true);
    }

    // Método para criar o painel principal da loja
    public static JPanel createHomePanel() {
        JPanel homePanel = new JPanel();
        homePanel.setLayout(new BoxLayout(homePanel, BoxLayout.Y_AXIS));
        homePanel.setBackground(new Color(224, 255, 255));

        // Criação do painel superior
        JPanel topPanel = createTopPanel();
        homePanel.add(topPanel);

        // Criação do painel central
        JPanel centerPanel = createcenterPanel();
        homePanel.add(centerPanel);
        

        return homePanel; // Retorna o painel principal
    }

    // Método para criar o painel superior
    private static JPanel createTopPanel() {
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(224, 255, 255));

        JButton menuButton = createImageButton("Projetos/Loja_Online/img/menu.blue.png", 40, 40);
        menuButton.setPreferredSize(new Dimension(40, 40));
        menuButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        menuButton.setContentAreaFilled(false);
        menuButton.setFocusPainted(false);
        menuButton.setBorderPainted(false);

        JLabel titleLabel = new JLabel("Loja Online");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setForeground(new Color(0,191,255));
        titleLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JButton shopButton = createImageButton("Projetos/Loja_Online/img/shop.blue.png", 40, 40);
        shopButton.setPreferredSize(new Dimension(40, 40));
        shopButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        shopButton.setContentAreaFilled(false);
        shopButton.setFocusPainted(false);
        shopButton.setBorderPainted(false);

        // Adição dos componentes ao painel
        topPanel.add(Box.createVerticalStrut(10));
        topPanel.add(menuButton);
        topPanel.add(Box.createHorizontalStrut(30));
        topPanel.add(titleLabel);
        topPanel.add(Box.createHorizontalStrut(30));
        topPanel.add(shopButton);

        return topPanel; // Retorna o painel superior
    }

    // Método para criar o painel central
    private static JPanel createcenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(new Color(224, 255, 255));
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.X_AXIS)); 

        JTextField searchField = new JTextField("");
        searchField.setMaximumSize(new Dimension(400, 50));
        searchField.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        JButton productsButton = createImageButton("Projetos/Loja_Online/img/sacola_blue.png", 60, 50);
        productsButton.setContentAreaFilled(false);
        productsButton.setFocusPainted(false);
        productsButton.setBorderPainted(false);

        // Adição dos componentes ao painel
        centerPanel.add(Box.createHorizontalStrut(30));
        centerPanel.add(searchField);
        centerPanel.add(Box.createHorizontalStrut(20));
        centerPanel.add(productsButton);

        return centerPanel; // Retorna o painel central
    }

    // Método para criar um botão com imagem redimensionada
    private static JButton createImageButton(String imagePath, int width, int height) {
        // Carregar a imagem
        ImageIcon icon = new ImageIcon(imagePath);
            
        // Redimensionar a imagem para caber no botão
        Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            
        // Criar um novo ImageIcon com a imagem redimensionada
        JButton button = new JButton(new ImageIcon(image));
        button.setPreferredSize(new Dimension(width, height)); // Define o tamanho preferido do botão
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
    
        return button; // Retorna o botão
    }
}