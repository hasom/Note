 package com.hasom.examabstractfactory2;

 import android.os.Bundle;
 import android.support.v7.app.AppCompatActivity;

 import com.hasom.examabstractfactory2.abst.Button;
 import com.hasom.examabstractfactory2.abst.GuiFactory;
 import com.hasom.examabstractfactory2.abst.TextArea;
 import com.hasom.examabstractfactory2.mac.MacGuiFactory;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        GuiFactory fac = new LinuxGuiFactory();
        GuiFactory fac = new MacGuiFactory();

        Button button = fac.createButton();
        TextArea area = fac.createTetArea();

        button.click();
        System.out.println(area.getText());
    }
}
