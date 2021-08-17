import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Solitaire extends Application
{
public void start(Stage primaryStage) throws Exception
{
    
    BorderPane Bpane= new BorderPane(); // ITs autoresizing with the scene and the stage!!
    GridPane Gpane = new GridPane();
    GridPane Gpane2 = new GridPane();
    Image image = new Image("b1fv.png");
    Gpane.setPadding(new Insets(20, 20, 20, 20));
    Gpane2.setPadding(new Insets(20, 20, 20, 15));
    ImageView imageview = new ImageView(image); 
    ImageView imageview1 = new ImageView(image); 
    ImageView imageview2 = new ImageView(image); 
    ImageView imageview3 = new ImageView(image); 
    ImageView imageview4 = new ImageView(image); 
    VBox vbox1 = new VBox(15);
    VBox vbox2 = new VBox(15);
    VBox vbox3 = new VBox(15);
    VBox vbox4 = new VBox(15);
    vbox1.setPadding(new Insets(20, 20, 20, 273));
    vbox1.getChildren().add(imageview1);
    vbox2.setPadding(new Insets(20, 20, 20, 358));
    vbox2.getChildren().add(imageview2);
    vbox3.setPadding(new Insets(20, 20, 20, 443));
    vbox3.getChildren().add(imageview3);
    vbox4.setPadding(new Insets(20, 20, 20, 528));
    vbox4.getChildren().add(imageview4);
    Gpane.getChildren().addAll(imageview, vbox1, vbox2, vbox3, vbox4);
    Bpane.setTop(Gpane);
    Image image2 = new Image("10.png");
    ImageView imageview5 = new ImageView(image2);
    //Image image3 = new Image("b1fv.png");
    ImageView imageview6 = new ImageView(image);
   // Image image4 = new Image("b1fv.png");
    ImageView imageview7 = new ImageView(image);
   // Image image5 = new Image("b1fv.png");
    ImageView imageview8 = new ImageView(image);
   // Image image6 = new Image("b1fv.png");
    ImageView imageview9 = new ImageView(image);
   // Image image7 = new Image("b1fv.png");
    ImageView imageview10 = new ImageView(image);
    //Image image8 = new Image("b1fv.png");
    ImageView imageview11 = new ImageView(image);


    Image image9 = new Image("26.png");
    ImageView imageview12 = new ImageView(image9);
    //Image image10 = new Image("b1fv.png");
    ImageView imageview13 = new ImageView(image);
    //Image image11 = new Image("b1fv.png");
    ImageView imageview14 = new ImageView(image);
    //Image image12 = new Image("b1fv.png");
    ImageView imageview15 = new ImageView(image);
    //Image image13 = new Image("b1fv.png");
    ImageView imageview16 = new ImageView(image);
   // Image image14 = new Image("b1fv.png");
    ImageView imageview17 = new ImageView(image);

    Image image10 = new Image("50.png");
    ImageView imageview18 = new ImageView(image10);
   // Image image16 = new Image("b1fv.png");
    ImageView imageview19 = new ImageView(image);
    //Image image17 = new Image("b1fv.png");
    ImageView imageview20 = new ImageView(image);
    //Image image18 = new Image("b1fv.png");
    ImageView imageview21 = new ImageView(image);
    //Image image19 = new Image("b1fv.png");
    ImageView imageview22 = new ImageView(image);

    Image image11 = new Image("27.png");
    ImageView imageview23 = new ImageView(image11);
    //Image image21 = new Image("b1fv.png");
    ImageView imageview24 = new ImageView(image);
    //Image image22 = new Image("b1fv.png");
    ImageView imageview25 = new ImageView(image);
   // Image image23 = new Image("b1fv.png");
    ImageView imageview26 = new ImageView(image);

    Image image12 = new Image("46.png");
    ImageView imageview27 = new ImageView(image12);
    //Image image25 = new Image("b1fv.png");
    ImageView imageview28 = new ImageView(image);
    //Image image26 = new Image("b1fv.png");
    ImageView imageview29 = new ImageView(image);

    Image image13 = new Image("24.png");
    ImageView imageview30 = new ImageView(image13);
    //Image image28 = new Image("b1fv.png");
    ImageView imageview31 = new ImageView(image);

    Image image14 = new Image("36.png");
    ImageView imageview32 = new ImageView(image14);

    //imageview11.setScaleX(1.1);
    //imageview11.setScaleY(1.1); // same for everything! One ideal size for everything... height and width property event driven!
    VBox vbox5 = new VBox(15);
    VBox vbox6 = new VBox(15);
    VBox vbox7 = new VBox(15);
    VBox vbox8 = new VBox(15);
    VBox vbox9 = new VBox(15);
    VBox vbox10 = new VBox(15);
    VBox vbox11 = new VBox(15);
    VBox vbox12 = new VBox(15);
    VBox vbox13 = new VBox(15);
    VBox vbox14 = new VBox(15);
    VBox vbox15 = new VBox(15);
    VBox vbox16 = new VBox(15);
    VBox vbox17 = new VBox(15);
    VBox vbox18 = new VBox(15);
    VBox vbox19 = new VBox(15);
    VBox vbox20 = new VBox(15);
    VBox vbox21 = new VBox(15);
    VBox vbox22 = new VBox(15);
    VBox vbox23 = new VBox(15);
    VBox vbox24 = new VBox(15);
    VBox vbox25 = new VBox(15);
    VBox vbox26 = new VBox(15);
    VBox vbox27 = new VBox(15);
    VBox vbox28 = new VBox(15);
    VBox vbox29 = new VBox(15);
    VBox vbox30 = new VBox(15);
    VBox vbox31 = new VBox(15);
    VBox vbox32 = new VBox(15);
    
    vbox5.setPadding(new Insets(40, 40, 40, 20));
    vbox5.getChildren().add(imageview5);
    vbox6.setPadding(new Insets(40, 40, 40, 110));
    vbox6.getChildren().add(imageview6);
    vbox7.setPadding(new Insets(40, 40, 40, 195));
    vbox7.getChildren().add(imageview7);
    vbox8.setPadding(new Insets(40, 40, 40, 280));
    vbox8.getChildren().add(imageview8);
    vbox9.setPadding(new Insets(40, 40, 40, 365));
    vbox9.getChildren().add(imageview9);
    vbox10.setPadding(new Insets(40, 40, 40, 450));
    vbox10.getChildren().add(imageview10);
    vbox11.setPadding(new Insets(40, 40, 40, 535));
    vbox11.getChildren().add(imageview11);

    vbox12.setPadding(new Insets(60, 40, 40, 110));
    vbox12.getChildren().add(imageview12);
    vbox13.setPadding(new Insets(60, 40, 40, 195));
    vbox13.getChildren().add(imageview13);
    vbox14.setPadding(new Insets(60, 40, 40, 280));
    vbox14.getChildren().add(imageview14);
    vbox15.setPadding(new Insets(60, 40, 40, 365));
    vbox15.getChildren().add(imageview15);
    vbox16.setPadding(new Insets(60, 40, 40, 450));
    vbox16.getChildren().add(imageview16);
    vbox17.setPadding(new Insets(60, 40, 40, 535));
    vbox17.getChildren().add(imageview17);
    
    vbox18.setPadding(new Insets(80, 40, 40, 195));
    vbox18.getChildren().add(imageview18);
    vbox19.setPadding(new Insets(80, 40, 40, 280));
    vbox19.getChildren().add(imageview19);
    vbox20.setPadding(new Insets(80, 40, 40, 365));
    vbox20.getChildren().add(imageview20);
    vbox21.setPadding(new Insets(80, 40, 40, 450));
    vbox21.getChildren().add(imageview21);
    vbox22.setPadding(new Insets(80, 40, 40, 535));

    vbox22.getChildren().add(imageview22);
    vbox23.setPadding(new Insets(100, 40, 40, 280));
    vbox23.getChildren().add(imageview23);
    vbox24.setPadding(new Insets(100, 40, 40, 365));
    vbox24.getChildren().add(imageview24);
    vbox25.setPadding(new Insets(100, 40, 40, 450));
    vbox25.getChildren().add(imageview25);
    vbox26.setPadding(new Insets(100, 40, 40, 535));

    vbox26.getChildren().add(imageview26);
    vbox27.setPadding(new Insets(120, 40, 40, 365));
    vbox27.getChildren().add(imageview27);
    vbox28.setPadding(new Insets(120, 40, 40, 450));
    vbox28.getChildren().add(imageview28);
    vbox29.setPadding(new Insets(120, 40, 40, 535));

    vbox29.getChildren().add(imageview29);
    vbox30.setPadding(new Insets(140, 40, 40, 450));
    vbox30.getChildren().add(imageview30);
    vbox31.setPadding(new Insets(140, 40, 40, 535));

    vbox31.getChildren().add(imageview31);
    vbox32.setPadding(new Insets(160, 40, 40, 535));
    vbox32.getChildren().add(imageview32);
    

    Gpane2.getChildren().addAll(vbox5,vbox6,vbox7,vbox8,vbox9,vbox10,vbox11,vbox12,vbox13,vbox14,vbox15,vbox16,vbox17,vbox18,vbox19,vbox20,vbox21,vbox22,vbox23,vbox24,vbox25,vbox26,vbox27,vbox28,vbox29,vbox30,vbox31,vbox32);
    Bpane.setCenter(Gpane2);
    Scene scene = new Scene(Bpane,650,650);
    scene.setFill(Color.GREEN);
    primaryStage.setTitle("Solitaire");
    primaryStage.setScene(scene);
    primaryStage.setResizable(false);
    primaryStage.show();
}
public static void main(String[] args)
{
    Application.launch(args);
}
}