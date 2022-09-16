package com.company.util;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class OverlapImages {

    public static ImageIcon overlapImages(String filename1, String filename2, int x, int y) {

        try {

            BufferedImage large;
            BufferedImage small;

            large = ImageIO.read(new File(filename1));
            small = ImageIO.read(new File(filename2));

            int w = Math.max(large.getWidth(), small.getWidth());
            int h = Math.max(large.getHeight(), small.getHeight());

            BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

            Graphics g = combined.getGraphics();
            g.drawImage(large, 0, 0, null);
            g.drawImage(small, x, y, null);

            ImageIO.write(combined, "PNG", new File("src/CombinedPicture.png"));

            return new ImageIcon(combined);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ImageIcon();
    }
}
