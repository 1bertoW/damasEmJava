package br.edu.principal.Damas;
import javax.swing.*;
import java.awt.*;

public class tabuleiro extends JPanel {
  private static final int LINHAS = 8;
  private static final int COLUNAS = 8;

  public tabuleiro() {
    setPreferredSize(new Dimension(800, 800));
    setBackground(Color.WHITE);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (int linha = 0; linha < LINHAS; linha++) {
      for (int coluna = 0; coluna < COLUNAS; coluna++) {
        if ((linha + coluna) % 2 == 0) {
          g.setColor(Color.BLACK);
        } else {
          g.setColor(Color.WHITE);
        }
        g.fillRect(coluna * 100, linha * 100, 100, 100);
      }
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Jogo de Dama");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new tabuleiro());
    frame.pack();
    frame.setVisible(true);
  }
}