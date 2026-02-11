package com.streams;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Painter {
    private final String name;
    private final String paintingStyle;
    private final String theme;

    public Painter(String name, String paintingStyle, String theme) {
        this.name = name;
        this.paintingStyle = paintingStyle;
        this.theme = theme;
    }

    public String getName() {
        return name;
    }

    public String getPaintingStyle() {
        return paintingStyle;
    }

    public String getTheme() {
        return theme;
    }

    // concrete classes can implement painting logic if needed
    public abstract void paint(Graphics2D g, Object object, int width, int height);

    public static void main(String[] args) {
        List<Painter> painterList = new ArrayList<>();
        Random random = new Random();
        int size = 3_000_000; // change as needed for testing
        String[] names = {"John", "Rakeeb", "Jane", "David", "Rahul", "Peter", "Leo", "Zack", "Anita", "Samaira"};
        String[] style = {"oil", "charcole", "pencil", "colored", "ink", "glass", "sand", "spray", "digital", "watrecolor"};
        String[] themes = {"Environment", "Industry", "Social", "Invention", "Adversity", "Humans", "Progress"};

        for (int i = 0; i < size; i++) {
            int randomName = random.nextInt(names.length);
            int randomStyle = random.nextInt(style.length);
            int randomTheme = random.nextInt(themes.length);

            // create a lightweight anonymous Painter implementation
            painterList.add(new Painter(names[randomName], style[randomStyle], themes[randomTheme]) {
                @Override
                public void paint(Graphics2D g, Object object, int width, int height) {
                    // no-op for this demo
                }
            });
        }

        long t1 = System.currentTimeMillis();
        long count1 = painterList.stream()
                .filter(x -> (x.getName().equals("John") || x.getPaintingStyle().equals("charcole")))
                .filter(x -> x.getTheme().equals("Invention"))
                .filter(x -> x.getName().startsWith("J"))
                .count();
        long t2 = System.currentTimeMillis();
        System.out.println("Count = " + count1 + " sequential Stream Takes " + (t2 - t1) + " ms");

        long t3 = System.currentTimeMillis();
        long count2 = painterList.parallelStream()
                .filter(x -> (x.getName().equals("John") || x.getPaintingStyle().equals("charcole")))
                .filter(x -> x.getTheme().equals("Invention"))
                .filter(x -> x.getName().startsWith("J"))
                .count();
        long t4 = System.currentTimeMillis();
        System.out.println("Count = " + count2 + " Parallel Stream Takes " + (t4 - t3) + " ms");
    }
}