package com.example.user.minesweeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

// TODO:

public class MainActivity extends AppCompatActivity {

    private Button btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19,
            btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29,
            btn31, btn32, btn33, btn34, btn35, btn36, btn37, btn38, btn39,
            btn41, btn42, btn43, btn44, btn45, btn46, btn47, btn48, btn49,
            btn51, btn52, btn53, btn54, btn55, btn56, btn57, btn58, btn59,
            btn61, btn62, btn63, btn64, btn65, btn66, btn67, btn68, btn69,
            btn71, btn72, btn73, btn74, btn75, btn76, btn77, btn78, btn79,
            btn81, btn82, btn83, btn84, btn85, btn86, btn87, btn88, btn89,
            btn91, btn92, btn93, btn94, btn95, btn96, btn97, btn98, btn99;

    private ImageButton btnReset ,btnSign;
    private EditText etBombs;
    private int sign;    //1 = bombs. 0 = flag.
    private int counter; //counter for number of bombs.
    private Button[][] buttons = new Button[9][9];
    private int x,y;
    private BombPlace[] Bombs = new BombPlace[15];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        buttons[0][0] = btn11 = (Button) findViewById(R.id.btn11);
        buttons[0][1] = btn12 = (Button) findViewById(R.id.btn12);
        buttons[0][2] = btn13 = (Button) findViewById(R.id.btn13);
        buttons[0][3] = btn14 = (Button) findViewById(R.id.btn14);
        buttons[0][4] = btn15 = (Button) findViewById(R.id.btn15);
        buttons[0][5] = btn16 = (Button) findViewById(R.id.btn16);
        buttons[0][6] = btn17 = (Button) findViewById(R.id.btn17);
        buttons[0][7] = btn18 = (Button) findViewById(R.id.btn18);
        buttons[0][8] = btn19 = (Button) findViewById(R.id.btn19);
        buttons[1][0] = btn21 = (Button) findViewById(R.id.btn21);
        buttons[1][1] = btn22 = (Button) findViewById(R.id.btn22);
        buttons[1][2] = btn23 = (Button) findViewById(R.id.btn23);
        buttons[1][3] = btn24 = (Button) findViewById(R.id.btn24);
        buttons[1][4] = btn25 = (Button) findViewById(R.id.btn25);
        buttons[1][5] = btn26 = (Button) findViewById(R.id.btn26);
        buttons[1][6] = btn27 = (Button) findViewById(R.id.btn27);
        buttons[1][7] = btn28 = (Button) findViewById(R.id.btn28);
        buttons[1][8] = btn29 = (Button) findViewById(R.id.btn29);
        buttons[2][0] = btn31 = (Button) findViewById(R.id.btn31);
        buttons[2][1] = btn32 = (Button) findViewById(R.id.btn32);
        buttons[2][2] = btn33 = (Button) findViewById(R.id.btn33);
        buttons[2][3] = btn34 = (Button) findViewById(R.id.btn34);
        buttons[2][4] = btn35 = (Button) findViewById(R.id.btn35);
        buttons[2][5] = btn36 = (Button) findViewById(R.id.btn36);
        buttons[2][6] = btn37 = (Button) findViewById(R.id.btn37);
        buttons[2][7] = btn38 = (Button) findViewById(R.id.btn38);
        buttons[2][8] = btn39 = (Button) findViewById(R.id.btn39);
        buttons[3][0] = btn41 = (Button) findViewById(R.id.btn41);
        buttons[3][1] = btn42 = (Button) findViewById(R.id.btn42);
        buttons[3][2] = btn43 = (Button) findViewById(R.id.btn43);
        buttons[3][3] = btn44 = (Button) findViewById(R.id.btn44);
        buttons[3][4] = btn45 = (Button) findViewById(R.id.btn45);
        buttons[3][5] = btn46 = (Button) findViewById(R.id.btn46);
        buttons[3][6] = btn47 = (Button) findViewById(R.id.btn47);
        buttons[3][7] = btn48 = (Button) findViewById(R.id.btn48);
        buttons[3][8] = btn49 = (Button) findViewById(R.id.btn49);
        buttons[4][0] = btn51 = (Button) findViewById(R.id.btn51);
        buttons[4][1] = btn52 = (Button) findViewById(R.id.btn52);
        buttons[4][2] = btn53 = (Button) findViewById(R.id.btn53);
        buttons[4][3] = btn54 = (Button) findViewById(R.id.btn54);
        buttons[4][4] = btn55 = (Button) findViewById(R.id.btn55);
        buttons[4][5] = btn56 = (Button) findViewById(R.id.btn56);
        buttons[4][6] = btn57 = (Button) findViewById(R.id.btn57);
        buttons[4][7] = btn58 = (Button) findViewById(R.id.btn58);
        buttons[4][8] = btn59 = (Button) findViewById(R.id.btn59);
        buttons[5][0] = btn61 = (Button) findViewById(R.id.btn61);
        buttons[5][1] = btn62 = (Button) findViewById(R.id.btn62);
        buttons[5][2] = btn63 = (Button) findViewById(R.id.btn63);
        buttons[5][3] = btn64 = (Button) findViewById(R.id.btn64);
        buttons[5][4] = btn65 = (Button) findViewById(R.id.btn65);
        buttons[5][5] = btn66 = (Button) findViewById(R.id.btn66);
        buttons[5][6] = btn67 = (Button) findViewById(R.id.btn67);
        buttons[5][7] = btn68 = (Button) findViewById(R.id.btn68);
        buttons[5][8] = btn69 = (Button) findViewById(R.id.btn69);
        buttons[6][0] = btn71 = (Button) findViewById(R.id.btn71);
        buttons[6][1] = btn72 = (Button) findViewById(R.id.btn72);
        buttons[6][2] = btn73 = (Button) findViewById(R.id.btn73);
        buttons[6][3] = btn74 = (Button) findViewById(R.id.btn74);
        buttons[6][4] = btn75 = (Button) findViewById(R.id.btn75);
        buttons[6][5] = btn76 = (Button) findViewById(R.id.btn76);
        buttons[6][6] = btn77 = (Button) findViewById(R.id.btn77);
        buttons[6][7] = btn78 = (Button) findViewById(R.id.btn78);
        buttons[6][8] = btn79 = (Button) findViewById(R.id.btn79);
        buttons[7][0] = btn81 = (Button) findViewById(R.id.btn81);
        buttons[7][1] = btn82 = (Button) findViewById(R.id.btn82);
        buttons[7][2] = btn83 = (Button) findViewById(R.id.btn83);
        buttons[7][3] = btn84 = (Button) findViewById(R.id.btn84);
        buttons[7][4] = btn85 = (Button) findViewById(R.id.btn85);
        buttons[7][5] = btn86 = (Button) findViewById(R.id.btn86);
        buttons[7][6] = btn87 = (Button) findViewById(R.id.btn87);
        buttons[7][7] = btn88 = (Button) findViewById(R.id.btn88);
        buttons[7][8] = btn89 = (Button) findViewById(R.id.btn89);
        buttons[8][0] = btn91 = (Button) findViewById(R.id.btn91);
        buttons[8][1] = btn92 = (Button) findViewById(R.id.btn92);
        buttons[8][2] = btn93 = (Button) findViewById(R.id.btn93);
        buttons[8][3] = btn94 = (Button) findViewById(R.id.btn94);
        buttons[8][4] = btn95 = (Button) findViewById(R.id.btn95);
        buttons[8][5] = btn96 = (Button) findViewById(R.id.btn96);
        buttons[8][6] = btn97 = (Button) findViewById(R.id.btn97);
        buttons[8][7] = btn98 = (Button) findViewById(R.id.btn98);
        buttons[8][8] = btn99 = (Button) findViewById(R.id.btn99);
        btnReset = (ImageButton) findViewById(R.id.btnReset);
        btnSign = (ImageButton) findViewById(R.id.btnSign);
        etBombs = (EditText) findViewById(R.id.etBombs);
        sign = 1;
        counter = 0;
        x=0;
        y=0;
        for(int i=0;i<15;i++) {
            Bombs[i]=new BombPlace(20,20);
        }

        // bomb creation on board
        boolean b = true;
        while (counter<=15 ){
            for(int i=0;i<15;i++) {
                if (x == Bombs[counter].getX() && y == Bombs[counter].getY())
                {
                    b = false;
                }
            }
            x = (int)(Math.random()*8);
            y = (int)(Math.random()*8);
            Bombs[counter] = new BombPlace (x,y);
            if (b == false)
                continue;
            else
                counter++;
        }


        // TODO: Create numbers,empty, bombs on board
            // if cell is bomb then btn[x,y].setTag("X")
            // if cell is not bomb but beside there are bombs setTag of button with the number of bombs
            // if cell has no bombs beside just set the tag to " "

    }

    public void click(View view)
    {
        if (((Button)view).getId()==btn11.getId())
        {
            //if  Bomb then end)
            // if Empty then....
            // if Number...
            // update image of button and button and game status
        }
        else {

        }
    }
}
