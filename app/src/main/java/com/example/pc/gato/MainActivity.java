package com.example.pc.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextView turnos, ganar;
    public int turn;
    public int p1[]=new int[10], p2[]=new int[10], p3[]=new int[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.boton1);
        b2=(Button)findViewById(R.id.boton2);
        b3=(Button)findViewById(R.id.boton3);
        b4=(Button)findViewById(R.id.boton4);
        b5=(Button)findViewById(R.id.boton5);
        b6=(Button)findViewById(R.id.boton6);
        b7=(Button)findViewById(R.id.boton7);
        b8=(Button)findViewById(R.id.boton8);
        b9=(Button)findViewById(R.id.boton9);
        turnos = (TextView)findViewById(R.id.turno);
        ganar = (TextView)findViewById(R.id.ganador);
        turn=1;
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        if(!gano1()&&!gano2()) {
                            if (!pulsado(1)) {
                                if (turn==1) {
                                    b1.setText("X");
                                    p1[1] = 1;
                                    turn=2;
                                    turnos.setText("O");
                                } else {
                                    b1.setText("O");
                                    p2[1] = 1;
                                    turn=1;
                                    turnos.setText("X");
                                }
                            }
                        }
                        p3[1] = 1;
                        gano1();
                        gano2();
                    }
                }
        );

        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        if(!gano1()&&!gano2()) {
                            if (!pulsado(2)) {
                                if (turn==1) {
                                    b2.setText("X");
                                    p1[2] = 1;
                                    turn=2;
                                    turnos.setText("O");
                                } else {
                                    b2.setText("O");
                                    p2[2] = 1;
                                    turn=1;
                                    turnos.setText("X");
                                }
                            }
                        }
                        p3[2] = 1;
                        gano1();
                        gano2();
                    }
                }
        );

        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        if(!gano1()&&!gano2()) {
                            if (!pulsado(3)) {
                                if (turn==1) {
                                    b3.setText("X");
                                    p1[3] = 1;
                                    turn=2;
                                    turnos.setText("O");
                                } else {
                                    b3.setText("O");
                                    p2[3] = 1;
                                    turn=1;
                                    turnos.setText("X");
                                }
                            }
                        }
                        p3[3] = 1;
                        gano1();
                        gano2();
                    }
                }
        );

        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        if(!gano1()&&!gano2()) {
                            if (!pulsado(4) ) {
                                if (turn==1) {
                                    b4.setText("X");
                                    p1[4] = 1;
                                    turn=2;
                                    turnos.setText("O");
                                } else {
                                    b4.setText("O");
                                    p2[4] = 1;
                                    turn=1;
                                    turnos.setText("X");
                                }
                            }
                        }
                        p3[4] = 1;
                        gano1();
                        gano2();
                    }
                }
        );

        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        if(!gano1()&&!gano2()) {
                            if (!pulsado(5) ) {
                                if (turn==1) {
                                    b5.setText("X");
                                    p1[5] = 1;
                                    turn=2;
                                    turnos.setText("O");
                                } else {
                                    b5.setText("O");
                                    p2[5] = 1;
                                    turn=1;
                                    turnos.setText("X");
                                }
                            }
                        }
                        p3[5] = 1;
                        gano1();
                        gano2();
                    }
                }
        );

        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        if(!gano1()&&!gano2()) {
                            if (!pulsado(6)) {
                                if (turn==1) {
                                    b6.setText("X");
                                    p1[6] = 1;
                                    turn=2;
                                    turnos.setText("O");
                                } else {
                                    b6.setText("O");
                                    p2[6] = 1;
                                    turn=1;
                                    turnos.setText("X");
                                }
                            }
                        }
                        p3[6] = 1;
                        gano1();
                        gano2();
                    }
                }
        );

        b7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        if(!gano1()&&!gano2()) {
                            if (!pulsado(7)) {
                                if (turn==1) {
                                    b7.setText("X");
                                    p1[7] = 1;
                                    turn=2;
                                    turnos.setText("O");
                                } else {
                                    b7.setText("O");
                                    p2[7] = 1;
                                    turn=1;
                                    turnos.setText("X");
                                }
                            }
                        }
                        p3[7] = 1;
                        gano1();
                        gano2();
                    }
                }
        );

        b8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        if(!gano1()&&!gano2()) {
                            if (!pulsado(8)) {
                                if (turn==1) {
                                    b8.setText("X");
                                    p1[8] = 1;
                                    turn=2;
                                    turnos.setText("O");
                                } else {
                                    b8.setText("O");
                                    p2[8] = 1;
                                    turn=1;
                                    turnos.setText("X");
                                }
                            }
                        }
                        p3[8] = 1;
                        gano1();
                        gano2();
                    }
                }
        );

        b9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        if(!gano1()&&!gano2()) {
                            if (!pulsado(9)) {
                                if (turn==1) {
                                    b9.setText("X");
                                    p1[9] = 1;
                                    turn=2;
                                    turnos.setText("O");
                                } else {
                                    b9.setText("O");
                                    p2[9] = 1;
                                    turn=1;
                                    turnos.setText("X");
                                }
                            }
                        }
                        p3[9] = 1;
                        gano1();
                        gano2();
                    }
                }
        );
    }

    public boolean pulsado(int i){
        if (p3[i]==1){
            return true;
        }
        return false;
    }
    public boolean gano1(){
        if((p1[1]==1)&&(p1[2]==1)&&(p1[3]==1)){
            ganar.setText("X");
            return true;
        }
        if((p1[4]==1)&&(p1[5]==1)&&(p1[6]==1)){
            ganar.setText("X");
            return true;
        }
        if((p1[7]==1)&&(p1[8]==1)&&(p1[9]==1)){
            ganar.setText("X");
            return true;
        }
        if((p1[1]==1)&&(p1[4]==1)&&(p1[7]==1)){
            ganar.setText("X");
            return true;
        }
        if((p1[2]==1)&&(p1[5]==1)&&(p1[8]==1)){
            ganar.setText("X");
            return true;
        }
        if((p1[3]==1)&&(p1[6]==1)&&(p1[9]==1)){
            ganar.setText("X");
            return true;
        }
        if((p1[1]==1)&&(p1[5]==1)&&(p1[9]==1)){
            ganar.setText("X");
            return true;
        }
        if((p1[3]==1)&&(p1[5]==1)&&(p1[7]==1)){
            ganar.setText("X");
            return true;
        }
        return false;
    }

    public boolean gano2(){
        if((p2[1]==1)&&(p2[2]==1)&&(p2[3]==1)){
            ganar.setText("O");
            return true;
        }
        if((p2[4]==1)&&(p2[5]==1)&&(p2[6]==1)){
            ganar.setText("O");
            return true;
        }
        if((p2[7]==1)&&(p2[8]==1)&&(p2[9]==1)){
            ganar.setText("O");
            return true;
        }
        if((p2[1]==1)&&(p2[4]==1)&&(p2[7]==1)){
            ganar.setText("O");
            return true;
        }
        if((p2[2]==1)&&(p2[5]==1)&&(p2[8]==1)){
            ganar.setText("O");
            return true;
        }
        if((p2[3]==1)&&(p2[6]==1)&&(p2[9]==1)){
            ganar.setText("O");
            return true;
        }
        if((p2[1]==1)&&(p2[5]==1)&&(p2[9]==1)){
            ganar.setText("O");
            return true;
        }
        if((p2[3]==1)&&(p2[5]==1)&&(p2[7]==1)){
            ganar.setText("O");
            return true;
        }
        return false;
    }

}
