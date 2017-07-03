package com.hasom.examabstractfactory3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.hasom.examabstractfactory3.BestBoard.BestBoard;
import com.hasom.examabstractfactory3.FavoriteBoard.FavoriteBoard;
import com.hasom.examabstractfactory3.abst.Board;
import com.hasom.examabstractfactory3.abst.ListModel;
import com.hasom.examabstractfactory3.abst.WriteModel;

public class MainActivity extends AppCompatActivity {

    private boolean isBest = true;
    private TextView tvText;
    private Board board = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = (TextView) findViewById(R.id.tvText);

        board = new BestBoard();


        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBest == true) {
                    isBest = false;
                    board = new FavoriteBoard();

                } else {
                    isBest = true;
                    board = new BestBoard();
                }

                showmodelText();
            }
        });
    }

    private void showmodelText() {
        ListModel listModel = board.createListModel();
        WriteModel writeModel = board.createWriteModel();

        String result = listModel.getList();
        result = result + " | " + writeModel.write();

        tvText.setText(result);
    }
}
