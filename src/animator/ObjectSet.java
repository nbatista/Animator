package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.ArrayList;

// Conjunto de objetos da animacao.
class ObjectSet {
    
    private Image[] images;
    private ArrayList<Rectangle> rectangles;
    private Dimension D;
    private Motion move;
    
    Random rnd;

    ObjectSet(Dimension D) {
        this.D = D;
        move = new Motion(0,0,D);
        rnd = new Random();
        rectangles = new ArrayList<Rectangle>();
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
       for (int i = 0; i < n; i++)
        {
            int a = rnd.nextInt(dim.width);
            int b = rnd.nextInt(dim.height);
            rectangles.add(new Rectangle( a, b, path));
        }
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addCircles(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d quadrados\n", n);
        System.out.printf("Test: motion path %s\n", path);
    }
    
    // Desenha cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void drawAll(Graphics g) {
        for (int i = 0; i < images.length; i++)
        {
            images[i].draw(g);
        }
        for (int i = 0; i < rectangles.size(); i++)
        {
            rectangles.get(i).draw(g);
        }
    }

    // Move cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void moveAll() {
        
        
            if (images!=null)
                for (int i = 0; i < images.length; i++)
                images[i].seti(move.linear(images[i].geti(),images[i].getj()));
            
           
            if(rectangles!=null)
                for (int i = 0; i < rectangles.size(); i++)
                rectangles.get(i).seti(move.linear(rectangles.get(i).geti(), rectangles.get(i).getj()));
                   
        
    }
    }
