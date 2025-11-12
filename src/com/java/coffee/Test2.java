package com.java.coffee;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

// Clase que representa un café individual
class Cafe {
    private String tamaño;
    private String sabor;

    public Cafe(String tamaño, String sabor) {
        this.tamaño = tamaño;
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return tamaño + " - " + sabor;
    }
}

// Clase que representa el pedido completo
class Pedido {
    private ArrayList<Cafe> cafes;

    public Pedido() {
        cafes = new ArrayList<>();
    }

    public void agregarCafe(Cafe cafe) {
        cafes.add(cafe);
    }

    public String generarResumen() {
        String resumen = "Resumen de pedido:\n";
        for (int i = 0; i < cafes.size(); i++) {
            resumen += "Café #" + (i + 1) + ": " + cafes.get(i) + "\n";
        }
        return resumen;
    }
}

// Clase principal renombrada a Test2
public class Test2 {

    public static void main(String[] args) {
        // Paso 1: preguntar cuántos cafés
        int totalCafes = Integer.parseInt(
                JOptionPane.showInputDialog("¿Cuántos cafés deseas?")
        );

        // Paso 2: ventana para elegir tamaños
        int[] tamanosSeleccion = seleccionarTamaños(totalCafes);

        // Paso 3: pedir sabores para cada café usando botones
        Pedido pedido = pedirSabores(tamanosSeleccion);

        // Paso 4: mostrar resumen final
        JOptionPane.showMessageDialog(null, pedido.generarResumen());
    }

    // Método para mostrar ventana de selección de tamaños
    private static int[] seleccionarTamaños(int totalCafes) {
        JFrame frame = new JFrame("Selecciona tamaños de café");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(4, 3));

        String[] tamaños = {"Chico", "Mediano", "Grande"};
        int[] contador = {0, 0, 0};
        JLabel[] labels = new JLabel[3];

        for (int i = 0; i < tamaños.length; i++) {
            JLabel nombre = new JLabel(tamaños[i]);
            labels[i] = new JLabel("0", SwingConstants.CENTER);

            JButton mas = new JButton("+");
            JButton menos = new JButton("-");

            final int index = i;

            mas.addActionListener(e -> {
                int sumaActual = contador[0] + contador[1] + contador[2];
                if (sumaActual < totalCafes) {
                    contador[index]++;
                    labels[index].setText(String.valueOf(contador[index]));
                } else {
                    JOptionPane.showMessageDialog(frame,
                            "Ya pediste " + totalCafes + " cafés en total.");
                }
            });

            menos.addActionListener(e -> {
                if (contador[index] > 0) {
                    contador[index]--;
                    labels[index].setText(String.valueOf(contador[index]));
                }
            });

            frame.add(nombre);
            frame.add(labels[i]);
            JPanel botones = new JPanel(new GridLayout(1, 2));
            botones.add(menos);
            botones.add(mas);
            frame.add(botones);
        }

        JButton confirmar = new JButton("Confirmar pedido");
        final int[] result = new int[3];
        confirmar.addActionListener(e -> {
            int sumaFinal = contador[0] + contador[1] + contador[2];
            if (sumaFinal == totalCafes) {
                result[0] = contador[0];
                result[1] = contador[1];
                result[2] = contador[2];
                frame.dispose();
            } else {
                JOptionPane.showMessageDialog(frame,
                        "Debes asignar exactamente " + totalCafes + " cafés.\n" +
                        "Actualmente llevas " + sumaFinal + ".");
            }
        });

        frame.add(new JLabel(""));
        frame.add(confirmar);
        frame.setVisible(true);

        // Esperar a que se cierre la ventana
        while (frame.isDisplayable()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    // Método para preguntar sabores usando botones
    private static Pedido pedirSabores(int[] tamañosSeleccion) {
        String[] sabores = {"Capuchino", "Americano", "Latte", "Expreso"};
        Pedido pedido = new Pedido();
        String[] nombresTamaños = {"Chico", "Mediano", "Grande"};

        for (int i = 0; i < tamañosSeleccion.length; i++) {
            for (int j = 0; j < tamañosSeleccion[i]; j++) {
                int opcion = JOptionPane.showOptionDialog(
                        null,
                        "¿Qué sabor quieres para el café " + nombresTamaños[i] + " #" + (j + 1) + "?",
                        "Selección de sabor",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        sabores,
                        sabores[0]
                );

                if (opcion >= 0) {
                    pedido.agregarCafe(new Cafe(nombresTamaños[i], sabores[opcion]));
                }
            }
        }

        return pedido;
    }
}

