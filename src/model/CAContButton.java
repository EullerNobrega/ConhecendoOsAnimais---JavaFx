package model;

import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Euller
 */
public class CAContButton extends ImageView {

    public CAContButton(Image img) {
        setImage(img);
        initializeButtonListeners();
    }

    public void setIconeEntrou(ImageView userIcon) {
        setEffect(new DropShadow());
    }

    public void setIconeSaiu(ImageView userIcon) {
        setEffect(null);
    }

    public void setButtonPressedStyle() {
        setLayoutY(getLayoutY() + 4);
    }

    private void setButtonReleasedStyle() {
        setLayoutY(getLayoutY() - 4);
    }

    public void initializeButtonListeners() {
        setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.ENTER)) {
                    setButtonPressedStyle();
                }
            }
        });

        setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.ENTER)) {
                    setButtonReleasedStyle();
                }
            }
        });
    }

}
