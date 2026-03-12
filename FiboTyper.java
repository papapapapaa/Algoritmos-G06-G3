import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FiboTyper extends JFrame {
    private long t1 = 0, t2 = 1;
    private int combo = 0;
    private int tiempoMaximoMs = 5000;
    private int tiempoRestante = 5000;

    private JLabel lblNumeroObjetivo;
    private JTextField txtEntrada;
    private JProgressBar barraTiempo;
    private JLabel lblCombo;
    private Timer timer;

    public FiboTyper() {
        setTitle("Fibonacci jueguito raro");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10));
        setLocationRelativeTo(null);

        lblCombo = new JLabel("Combo: 0", SwingConstants.CENTER);
        lblCombo.setFont(new Font("Arial", Font.BOLD, 18));

        lblNumeroObjetivo = new JLabel(String.valueOf(t1), SwingConstants.CENTER);
        lblNumeroObjetivo.setFont(new Font("Monospaced", Font.BOLD, 48))
        lblNumeroObjetivo.setForeground(Color.BLUE);

        txtEntrada = new JTextField();
        txtEntrada.setFont(new Font("Arial", Font.PLAIN, 32));
        txtEntrada.setHorizontalAlignment(JTextField.CENTER);

        barraTiempo = new JProgressBar(0, tiempoMaximoMs);
        barraTiempo.setValue(tiempoRestante);
        barraTiempo.setForeground(Color.RED);

        add(lblCombo);
        add(lblNumeroObjetivo);
        add(txtEntrada);
        add(barraTiempo);

        txtEntrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarEntrada();
            }
        });

        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempoRestante -= 50;
                barraTiempo.setValue(tiempoRestante);

                if (tiempoRestante <= 0) {
                    terminarJuego("se acabo el tiempo");
                }
            }
        });

        timer.start();
    }

    private void verificarEntrada() {
        try {
            long numeroEscrito = Long.parseLong(txtEntrada.getText().trim());

            if (numeroEscrito == t1) {
                combo++;
                lblCombo.setText("Combo: " + combo);
                txtEntrada.setText("");


                long siguiente = t1 + t2;
                t1 = t2;
                t2 = siguiente;
                lblNumeroObjetivo.setText(String.valueOf(t1));


                tiempoMaximoMs = Math.max(1500, tiempoMaximoMs - 150);
                tiempoRestante = tiempoMaximoMs;

                barraTiempo.setMaximum(tiempoMaximoMs);
                barraTiempo.setValue(tiempoRestante);
            } else {
                terminarJuego("numero equivocado ");
            }
        } catch (NumberFormatException ex) {

            txtEntrada.setText("");
        }
    }

    private void terminarJuego(String motivo) {
        timer.stop();
        txtEntrada.setEnabled(false);
        JOptionPane.showMessageDialog(this, motivo + "\ncombo final alcanzado: " + combo, "game over", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FiboTyper().setVisible(true);
        });
    }
}
