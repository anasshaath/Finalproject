/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class AdminLogin extends Stage {

    AdminLogin() throws IOException {
        FXMLLoader lode = new FXMLLoader(getClass().getResource("AdminLogin.fxml"));
        Parent root = lode.load();

        Scene sc = new Scene(root);
        this.setScene(sc);
        this.show();
        this.setTitle("Admin Login");

    }
}
