import javax.swing.*;
import java.awt.*;

public class AlgoFrame extends JFrame {
    private int canvasWidth;
    private int canvasHeight;
    public AlgoFrame(String title, int canvasWidth, int canvasHeight) {
        super(title);

        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;

        AlgoCanvas canvas = new AlgoCanvas();
//        canvas.setPreferredSize(new Dimension(canvasWidth,canvasHeight));
        setContentPane(canvas);
        pack();

//        setSize(canvasWidth, canvasHeight);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public AlgoFrame(String title) {
        this(title, 1024, 768);
    }


    public int getCanvasWidth() {
        return canvasWidth;
    }

    public int getCanvasHeight() {
        return canvasHeight;
    }

    private class AlgoCanvas extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

//            g.drawOval(50,50,300,300);

            Graphics2D g2d = (Graphics2D) g;

            AlgoVisHelper.setStrokeWidth(g2d,5);

            AlgoVisHelper.setColor(g2d,Color.BLUE);
            AlgoVisHelper.fillCircle(g2d,canvasWidth/2,canvasHeight/2,200);

            g2d.setColor(Color.RED);
            AlgoVisHelper.strokeCircle(g2d,canvasWidth/2,canvasHeight/2,200);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(canvasWidth, canvasHeight);
        }
    }
}
