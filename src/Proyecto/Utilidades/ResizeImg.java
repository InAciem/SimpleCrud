package Proyecto.Utilidades;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResizeImg {

    private String imagePath;
    private JLabel label;

    public ResizeImg(String imagePath, JLabel label) {
        this.imagePath = imagePath;
        this.label = label;
        resizeImage();
    }
    
    public ResizeImg(String imagePath, JLabel label, boolean hasHoover){
        this(imagePath, label);
        
        if (hasHoover) {
            label.addMouseListener(new HoverListener());
        }
    }

    public void resizeImage() {
        try {
            ImageIcon originalImageIcon = new ImageIcon(imagePath);
            Image originalImage = originalImageIcon.getImage();

            Image scaledImage = originalImage.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);

            ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

            label.setIcon(scaledImageIcon);

            label.repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class HoverListener extends MouseAdapter {
        private final ImageIcon originalIcon;

        public HoverListener() {
            this.originalIcon = (ImageIcon) label.getIcon();
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            Image originalImage = originalIcon.getImage();

            int newWidth = (int) (originalImage.getWidth(null) * 0.9);  // 90% del tamaño original
            int newHeight = (int) (originalImage.getHeight(null) * 0.9);

            Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            label.setIcon(scaledIcon);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            label.setIcon(originalIcon);
        }
    }
}

