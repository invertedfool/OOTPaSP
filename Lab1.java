
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Animal {
    String name;
    String imagePath;

    public Animal() {
        this.name = "Animal";
        this.imagePath = "animal.jpg";
    }

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }
}

class Mammal extends Animal {
    public Mammal() {
        this.name = "Mammal";
        this.imagePath = "Mammal.jpg";
    }
}

class Bird extends Animal {
    public Bird() {
        this.name = "Bird";
        this.imagePath = "Bird.jpg";
    }
}

class Reptile extends Animal {
    public Reptile() {
        this.name = "Reptile";
        this.imagePath = "Reptile.jpg";
    }
}

class Dog extends Mammal {
    public Dog() {
        this.name = "Dog";
        this.imagePath = "Dog.jpg";
    }
}

class Raven extends Bird {
    public Raven() {
        this.name = "Raven";
        this.imagePath = "Raven.jpg";
    }
}

class Snake extends Reptile {
    public Snake() {
        this.name = "Snake";
        this.imagePath = "Snake.jpg";
    }
}

public class Lab1 extends JFrame {

    public Lab1() {
        setTitle("Animal Display");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Mammal());
        animals.add(new Bird());
        animals.add(new Reptile());
        animals.add(new Dog());
        animals.add(new Raven());
        animals.add(new Snake());

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(createLabel(animals.get(0)));

        JPanel middlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        for (int i = 1; i <= 3; i++) {
            middlePanel.add(createLabel(animals.get(i)));
        }

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        for (int i = 4; i < animals.size(); i++) {
            bottomPanel.add(createLabel(animals.get(i)));
        }

        add(topPanel);
        add(middlePanel);
        add(bottomPanel);

        setVisible(true);
    }

    private JLabel createLabel(Animal animal) {
        JLabel label = new JLabel(animal.getName(), new ImageIcon(animal.getImagePath()), JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIconTextGap(10);
        return label;
    }

    public static void main(String[] args) {
        new Lab1();
    }
}