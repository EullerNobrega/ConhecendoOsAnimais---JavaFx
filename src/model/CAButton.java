package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

/**
 *
 * @author Euller
 */
public class CAButton extends Button {

    private final String FONT_PATH = "src/resources/fonts/kenpixel.ttf";
    private final String BUTTON_PRESSED_STYLE = "-fx-backgroud-color: transparent; -fx-background-image: url('/resources/buttons/blue_button_pressed.png');";
    private final String BUTTON_FREE_STYLE = "-fx-backgroud-color: transparent; -fx-background-image: url('/resources/buttons/blue_button.png');";
    Canvas canvas = new Canvas(1024, 720);
    GraphicsContext gc = canvas.getGraphicsContext2D(); // classe é usada para emitir chamadas de desenho para um Canvas usando um buffer.

    public CAButton(String text) {
        setText(text);
        setPrefHeight(49);
        setPrefWidth(190);
        setButtonFont();
        setStyle(BUTTON_FREE_STYLE);
        initializeButtonListeners();

    }

    private void setButtonFont() {
        try {
            setFont(Font.loadFont(new FileInputStream(FONT_PATH), 20));
        } catch (FileNotFoundException e) {
            setFont(Font.font("Verdana", 23));
        }
    }

    public void setButtonPressedStyle() {
        setStyle(BUTTON_PRESSED_STYLE);
        setPrefHeight(45);
        setLayoutY(getLayoutY() + 4);
    }

    private void setButtonReleasedStyle() {
        setStyle(BUTTON_FREE_STYLE);
        setPrefHeight(49);
        setLayoutY(getLayoutY() - 4);
    }

    public void initializeButtonListeners() {
        setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton().equals(MouseButton.PRIMARY)) {
                    setButtonPressedStyle();
                }
            }
        });

        setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton().equals(MouseButton.PRIMARY)) {
                    setButtonReleasedStyle();
                }
            }
        });

        setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                setEffect(new DropShadow());
            }
        });

        setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                setEffect(null);
            }
        });
    }

}
