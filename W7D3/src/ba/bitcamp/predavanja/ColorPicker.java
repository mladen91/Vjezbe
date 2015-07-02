package ba.bitcamp.predavanja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorPicker extends JPanel {

	private int red;
	private int green;
	private int blue;
	private JButton click;
	private JButton[] colorButton = new JButton[13];
	JPanel buttonPanel = new JPanel();
	JPanel sliderPanel = new JPanel();
	JPanel colorPanel = new JPanel();
	private static Color[] supportedColors = new Color[] { Color.BLACK,
			Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
			Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
			Color.RED, Color.WHITE, Color.YELLOW };

	public ColorPicker(int width, int height) {

		setLayout(new FlowLayout());
		int sliderHeigth = (height / 7);
		Dimension sliderDimension = new Dimension(width - 50, sliderHeigth);
		JSlider redSlider = new JSlider(0, 255);

		initButton(width, height);

		for (int i = 0; i < supportedColors.length; i++) {
			colorButton[i] = new JButton("" + i);
			colorPanel.add(colorButton[i]);

			colorButton[i].setBackground(supportedColors[i]);
			colorButton[i].setOpaque(true);
			colorButton[i].setPreferredSize(new Dimension(50, 50));
			colorButton[i].setBorder(BorderFactory.createRaisedBevelBorder());
			colorPanel.setLayout(new GridLayout(5, 5));

			final int j = i;
			colorButton[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					if (e.getSource() == colorButton[j]) {
						colorButton[j].setBorder(BorderFactory.createLoweredBevelBorder());
						click.setBackground(supportedColors[j]);
					}

				}
			});

		}

		initSlider(redSlider, "red", sliderDimension);
		add(colorPanel);
		add(buttonPanel);
		add(sliderPanel);
		sliderPanel.setPreferredSize(new Dimension(200, height / 2));

		sliderPanel.setBackground(Color.GREEN);
		
		colorPanel.setBackground(Color.BLUE);

		buttonPanel.add(click);
		sliderPanel.setLayout(new GridLayout(1, 3));

		sliderPanel.add(redSlider);

		JSlider greenSlider = new JSlider(0, 255);
		initSlider(greenSlider, "green", sliderDimension);

		sliderPanel.add(greenSlider);

		JSlider blueSlider = new JSlider(0, 255);
		initSlider(blueSlider, "blue", sliderDimension);

		sliderPanel.add(blueSlider);

		// labels

	}

	private void initSlider(JSlider slider, String name, Dimension d) {
		slider.setName(name);
		slider.setPreferredSize(d);
		slider.setValue(0);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(25);
		slider.setPaintTicks(true);
		slider.setOrientation(JSlider.VERTICAL);
		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider changed = (JSlider) e.getSource();
				String name = changed.getName();
				switch (name) {
				case "red":
					red = changed.getValue();
					break;
				case "green":
					green = changed.getValue();
					break;
				case "blue":
					blue = changed.getValue();
					break;
				}
				updateButton();
			}
		});

	}

	private void updateButton() {
		click.setBackground(new Color(red, green, blue));
		click.setForeground(new Color(255 - red, 255 - green, 255 - blue));
	}

	private void initButton(int width, int height) {
		click = new JButton("Click me!");
		click.setFont(new Font("Serif", Font.BOLD, 20));
		click.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Clipboard clip = Toolkit.getDefaultToolkit()
						.getSystemClipboard();

				String copy = String.format("%d, %d, %d", red, green, blue);
				clip.setContents(new StringSelection(copy), null);

			}
		});
		click.setPreferredSize(new Dimension(width, height / 2));

		click.setOpaque(true);
		click.setBorderPainted(false);
		updateButton();
	}

}
