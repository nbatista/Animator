package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.Random;

// Conjunto de objetos da animacao.
class ObjectSet {
    
    private Image[] images;
    private Dimension D;
    private Motion move;
    
    Random rnd;

    ObjectSet(Dimension dim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    // Adiciona objetos da classe Image ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addImages(int n, Dimension dim, BufferedImage image, String path) {
        //System.out.printf("Test: adding %d images\n", n);
        //System.out.printf("Test: motion path %s\n", path);
        images = new Image[n];
        for (int i = 0; i < images.length; i++)
        {
            int a = rnd.nextInt(dim.width);
            int b = rnd.nextInt(dim.height);
            images[i] = new Image( a, b, image, path);
        }
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addStars(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d stars\n", n);
        System.out.printf("Test: motion path %s\n", path);

    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addRectangles(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d rectangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addCircles(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d rectangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
    }
    
    // Desenha cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void drawAll(Graphics g) {
        for (int i = 0; i < images.length; i++)
        {
            images[i].draw(g);
        }
    }

    // Move cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void moveAll() {
        for (int i = 0; i < images.length; i++)
        {
            if (images[i].rout.equalsIgnoreCase("Line"))
            {
                images[i].seti(move.linear(images[i].geti(),images[i].getj()));
            }
           
        }
    }
    }
