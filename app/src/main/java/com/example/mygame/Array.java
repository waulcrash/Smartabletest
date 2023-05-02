package com.example.mygame;

public class Array {
    //массив
//ответы и задания
    final int [] stringbtn1 = {
            R.string.o1_1_1,R.string.o1_1_2,R.string.o1_1_3,R.string.o1_1_4,R.string.q1_1, //
            R.string.o1_2_1,R.string.o1_2_2,R.string.o1_2_3,R.string.o1_2_4,R.string.q1_2, //
            R.string.o1_3_1,R.string.o1_3_2,R.string.o1_3_3,R.string.o1_3_4,R.string.q1_3, //
            R.string.o1_4_1,R.string.o1_4_2,R.string.o1_4_3,R.string.o1_4_4,R.string.q1_4, //
            R.string.o1_5_1,R.string.o1_5_2,R.string.o1_5_3,R.string.o1_5_4,R.string.q1_5, //
            R.string.o1_6_1,R.string.o1_6_2,R.string.o1_6_3,R.string.o1_6_4,R.string.q1_6, //
            R.string.o1_7_1,R.string.o1_7_2,R.string.o1_7_3,R.string.o1_7_4,R.string.q1_7, //
            R.string.o1_8_1,R.string.o1_8_2,R.string.o1_8_3,R.string.o1_8_4,R.string.q1_8, //
            R.string.o1_9_1,R.string.o1_9_2,R.string.o1_9_3,R.string.o1_9_4,R.string.q1_9, //
            R.string.o1_10_1,R.string.o1_10_2,R.string.o1_10_3,R.string.o1_10_4,R.string.q1_10, //
            R.string.o1_11_1,R.string.o1_11_2,R.string.o1_11_3,R.string.o1_11_4,R.string.q1_11, //
            R.string.o1_12_1,R.string.o1_12_2,R.string.o1_12_3,R.string.o1_12_4,R.string.q1_12, //
            R.string.o1_13_1,R.string.o1_13_2,R.string.o1_13_3,R.string.o1_13_4,R.string.q1_13, //
            R.string.o1_14_1,R.string.o1_14_2,R.string.o1_14_3,R.string.o1_14_4,R.string.q1_14, //
            R.string.o1_15_1,R.string.o1_15_2,R.string.o1_15_3,R.string.o1_15_4,R.string.q1_15, //
            R.string.o1_16_1,R.string.o1_16_2,R.string.o1_16_3,R.string.o1_16_4,R.string.q1_16, //
            R.string.o1_17_1,R.string.o1_17_2,R.string.o1_17_3,R.string.o1_17_4,R.string.q1_17, //
            R.string.o1_18_1,R.string.o1_18_2,R.string.o1_18_3,R.string.o1_18_4,R.string.q1_18, //
            R.string.o1_19_1,R.string.o1_19_2,R.string.o1_19_3,R.string.o1_19_4,R.string.q1_19, //
            R.string.o1_20_1,R.string.o1_20_2,R.string.o1_20_3,R.string.o1_20_4,R.string.q1_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power1 ={
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,4  //заглушка для 1
    };

    final int [] stringbtn2 = {
            R.string.o2_1_1,R.string.o2_1_2,R.string.o2_1_3,R.string.o2_1_4,R.string.q2_1, //
            R.string.o2_2_1,R.string.o2_2_2,R.string.o2_2_3,R.string.o2_2_4,R.string.q2_2, //
            R.string.o2_3_1,R.string.o2_3_2,R.string.o2_3_3,R.string.o2_3_4,R.string.q2_3, //
            R.string.o2_4_1,R.string.o2_4_2,R.string.o2_4_3,R.string.o2_4_4,R.string.q2_4, //
            R.string.o2_5_1,R.string.o2_5_2,R.string.o2_5_3,R.string.o2_5_4,R.string.q2_5, //
            R.string.o2_6_1,R.string.o2_6_2,R.string.o2_6_3,R.string.o2_6_4,R.string.q2_6, //
            R.string.o2_7_1,R.string.o2_7_2,R.string.o2_7_3,R.string.o2_7_4,R.string.q2_7, //
            R.string.o2_8_1,R.string.o2_8_2,R.string.o2_8_3,R.string.o2_8_4,R.string.q2_8, //
            R.string.o2_9_1,R.string.o2_9_2,R.string.o2_9_3,R.string.o2_9_4,R.string.q2_9, //
            R.string.o2_10_1,R.string.o2_10_2,R.string.o2_10_3,R.string.o2_10_4,R.string.q2_10, //
            R.string.o2_11_1,R.string.o2_11_2,R.string.o2_11_3,R.string.o2_11_4,R.string.q2_11, //
            R.string.o2_12_1,R.string.o2_12_2,R.string.o2_12_3,R.string.o2_12_4,R.string.q2_12, //
            R.string.o2_13_1,R.string.o2_13_2,R.string.o2_13_3,R.string.o2_13_4,R.string.q2_13, //
            R.string.o2_14_1,R.string.o2_14_2,R.string.o2_14_3,R.string.o2_14_4,R.string.q2_14, //
            R.string.o2_15_1,R.string.o2_15_2,R.string.o2_15_3,R.string.o2_15_4,R.string.q2_15, //
            R.string.o2_16_1,R.string.o2_16_2,R.string.o2_16_3,R.string.o2_16_4,R.string.q2_16, //
            R.string.o2_17_1,R.string.o2_17_2,R.string.o2_17_3,R.string.o2_17_4,R.string.q2_17, //
            R.string.o2_18_1,R.string.o2_18_2,R.string.o2_18_3,R.string.o2_18_4,R.string.q2_18, //
            R.string.o2_19_1,R.string.o2_19_2,R.string.o2_19_3,R.string.o2_19_4,R.string.q2_19, //
            R.string.o2_20_1,R.string.o2_20_2,R.string.o2_20_3,R.string.o2_20_4,R.string.q2_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power2 ={
            0,1,2,3,1,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,4  //заглушка для 2
    };

    final int [] stringbtn3 = {
            R.string.o3_1_1,R.string.o3_1_2,R.string.o3_1_3,R.string.o3_1_4,R.string.q3_1, //
            R.string.o3_2_1,R.string.o3_2_2,R.string.o3_2_3,R.string.o3_2_4,R.string.q3_2, //
            R.string.o3_3_1,R.string.o3_3_2,R.string.o3_3_3,R.string.o3_3_4,R.string.q3_3, //
            R.string.o3_4_1,R.string.o3_4_2,R.string.o3_4_3,R.string.o3_4_4,R.string.q3_4, //
            R.string.o3_5_1,R.string.o3_5_2,R.string.o3_5_3,R.string.o3_5_4,R.string.q3_5, //
            R.string.o3_6_1,R.string.o3_6_2,R.string.o3_6_3,R.string.o3_6_4,R.string.q3_6, //
            R.string.o3_7_1,R.string.o3_7_2,R.string.o3_7_3,R.string.o3_7_4,R.string.q3_7, //
            R.string.o3_8_1,R.string.o3_8_2,R.string.o3_8_3,R.string.o3_8_4,R.string.q3_8, //
            R.string.o3_9_1,R.string.o3_9_2,R.string.o3_9_3,R.string.o3_9_4,R.string.q3_9, //
            R.string.o3_10_1,R.string.o3_10_2,R.string.o3_10_3,R.string.o3_10_4,R.string.q3_10, //
            R.string.o3_11_1,R.string.o3_11_2,R.string.o3_11_3,R.string.o3_11_4,R.string.q3_11, //
            R.string.o3_12_1,R.string.o3_12_2,R.string.o3_12_3,R.string.o3_12_4,R.string.q3_12, //
            R.string.o3_13_1,R.string.o3_13_2,R.string.o3_13_3,R.string.o3_13_4,R.string.q3_13, //
            R.string.o3_14_1,R.string.o3_14_2,R.string.o3_14_3,R.string.o3_14_4,R.string.q3_14, //
            R.string.o3_15_1,R.string.o3_15_2,R.string.o3_15_3,R.string.o3_15_4,R.string.q3_15, //
            R.string.o3_16_1,R.string.o3_16_2,R.string.o3_16_3,R.string.o3_16_4,R.string.q3_16, //
            R.string.o3_17_1,R.string.o3_17_2,R.string.o3_17_3,R.string.o3_17_4,R.string.q3_17, //
            R.string.o3_18_1,R.string.o3_18_2,R.string.o3_18_3,R.string.o3_18_4,R.string.q3_18, //
            R.string.o3_19_1,R.string.o3_19_2,R.string.o3_19_3,R.string.o3_19_4,R.string.q3_19, //
            R.string.o3_20_1,R.string.o3_20_2,R.string.o3_20_3,R.string.o3_20_4,R.string.q3_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power3 ={
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,4  //заглушка для 2
    };
    final int [] stringbtn4 = {
            R.string.o4_1_1,R.string.o4_1_2,R.string.o4_1_3,R.string.o4_1_4,R.string.q4_1, //
            R.string.o4_2_1,R.string.o4_2_2,R.string.o4_2_3,R.string.o4_2_4,R.string.q4_2, //
            R.string.o4_3_1,R.string.o4_3_2,R.string.o4_3_3,R.string.o4_3_4,R.string.q4_3, //
            R.string.o4_4_1,R.string.o4_4_2,R.string.o4_4_3,R.string.o4_4_4,R.string.q4_4, //
            R.string.o4_5_1,R.string.o4_5_2,R.string.o4_5_3,R.string.o4_5_4,R.string.q4_5, //
            R.string.o4_6_1,R.string.o4_6_2,R.string.o4_6_3,R.string.o4_6_4,R.string.q4_6, //
            R.string.o4_7_1,R.string.o4_7_2,R.string.o4_7_3,R.string.o4_7_4,R.string.q4_7, //
            R.string.o4_8_1,R.string.o4_8_2,R.string.o4_8_3,R.string.o4_8_4,R.string.q4_8, //
            R.string.o4_9_1,R.string.o4_9_2,R.string.o4_9_3,R.string.o4_9_4,R.string.q4_9, //
            R.string.o4_10_1,R.string.o4_10_2,R.string.o4_10_3,R.string.o4_10_4,R.string.q4_10, //
            R.string.o4_11_1,R.string.o4_11_2,R.string.o4_11_3,R.string.o4_11_4,R.string.q4_11, //
            R.string.o4_12_1,R.string.o4_12_2,R.string.o4_12_3,R.string.o4_12_4,R.string.q4_12, //
            R.string.o4_13_1,R.string.o4_13_2,R.string.o4_13_3,R.string.o4_13_4,R.string.q4_13, //
            R.string.o4_14_1,R.string.o4_14_2,R.string.o4_14_3,R.string.o4_14_4,R.string.q4_14, //
            R.string.o4_15_1,R.string.o4_15_2,R.string.o4_15_3,R.string.o4_15_4,R.string.q4_15, //
            R.string.o4_16_1,R.string.o4_16_2,R.string.o4_16_3,R.string.o4_16_4,R.string.q4_16, //
            R.string.o4_17_1,R.string.o4_17_2,R.string.o4_17_3,R.string.o4_17_4,R.string.q4_17, //
            R.string.o4_18_1,R.string.o4_18_2,R.string.o4_18_3,R.string.o4_18_4,R.string.q4_18, //
            R.string.o4_19_1,R.string.o4_19_2,R.string.o4_19_3,R.string.o4_19_4,R.string.q4_19, //
            R.string.o4_20_1,R.string.o4_20_2,R.string.o4_20_3,R.string.o4_20_4,R.string.q4_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power4 ={
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,4  //заглушка для 2
    };
    final int [] stringbtn5 = {
            R.string.o5_1_1,R.string.o5_1_2,R.string.o5_1_3,R.string.o5_1_4,R.string.q5_1, //
            R.string.o5_2_1,R.string.o5_2_2,R.string.o5_2_3,R.string.o5_2_4,R.string.q5_2, //
            R.string.o5_3_1,R.string.o5_3_2,R.string.o5_3_3,R.string.o5_3_4,R.string.q5_3, //
            R.string.o5_4_1,R.string.o5_4_2,R.string.o5_4_3,R.string.o5_4_4,R.string.q5_4, //
            R.string.o5_5_1,R.string.o5_5_2,R.string.o5_5_3,R.string.o5_5_4,R.string.q5_5, //
            R.string.o5_6_1,R.string.o5_6_2,R.string.o5_6_3,R.string.o5_6_4,R.string.q5_6, //
            R.string.o5_7_1,R.string.o5_7_2,R.string.o5_7_3,R.string.o5_7_4,R.string.q5_7, //
            R.string.o5_8_1,R.string.o5_8_2,R.string.o5_8_3,R.string.o5_8_4,R.string.q5_8, //
            R.string.o5_9_1,R.string.o5_9_2,R.string.o5_9_3,R.string.o5_9_4,R.string.q5_9, //
            R.string.o5_10_1,R.string.o5_10_2,R.string.o5_10_3,R.string.o5_10_4,R.string.q5_10, //
            R.string.o5_11_1,R.string.o5_11_2,R.string.o5_11_3,R.string.o5_11_4,R.string.q5_11, //
            R.string.o5_12_1,R.string.o5_12_2,R.string.o5_12_3,R.string.o5_12_4,R.string.q5_12, //
            R.string.o5_13_1,R.string.o5_13_2,R.string.o5_13_3,R.string.o5_13_4,R.string.q5_13, //
            R.string.o5_14_1,R.string.o5_14_2,R.string.o5_14_3,R.string.o5_14_4,R.string.q5_14, //
            R.string.o5_15_1,R.string.o5_15_2,R.string.o5_15_3,R.string.o5_15_4,R.string.q5_15, //
            R.string.o5_16_1,R.string.o5_16_2,R.string.o5_16_3,R.string.o5_16_4,R.string.q5_16, //
            R.string.o5_17_1,R.string.o5_17_2,R.string.o5_17_3,R.string.o5_17_4,R.string.q5_17, //
            R.string.o5_18_1,R.string.o5_18_2,R.string.o5_18_3,R.string.o5_18_4,R.string.q5_18, //
            R.string.o5_19_1,R.string.o5_19_2,R.string.o5_19_3,R.string.o5_19_4,R.string.q5_19, //
            R.string.o5_20_1,R.string.o5_20_2,R.string.o5_20_3,R.string.o5_20_4,R.string.q5_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power5 ={
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,4  //заглушка для 2
    };

    final int [] stringbtn6 = {
            R.string.o6_1_1,R.string.o6_1_2,R.string.o6_1_3,R.string.o6_1_4,R.string.q6_1, //
            R.string.o6_2_1,R.string.o6_2_2,R.string.o6_2_3,R.string.o6_2_4,R.string.q6_2, //
            R.string.o6_3_1,R.string.o6_3_2,R.string.o6_3_3,R.string.o6_3_4,R.string.q6_3, //
            R.string.o6_4_1,R.string.o6_4_2,R.string.o6_4_3,R.string.o6_4_4,R.string.q6_4, //
            R.string.o6_5_1,R.string.o6_5_2,R.string.o6_5_3,R.string.o6_5_4,R.string.q6_5, //
            R.string.o6_6_1,R.string.o6_6_2,R.string.o6_6_3,R.string.o6_6_4,R.string.q6_6, //
            R.string.o6_7_1,R.string.o6_7_2,R.string.o6_7_3,R.string.o6_7_4,R.string.q6_7, //
            R.string.o6_8_1,R.string.o6_8_2,R.string.o6_8_3,R.string.o6_8_4,R.string.q6_8, //
            R.string.o6_9_1,R.string.o6_9_2,R.string.o6_9_3,R.string.o6_9_4,R.string.q6_9, //
            R.string.o6_10_1,R.string.o6_10_2,R.string.o6_10_3,R.string.o6_10_4,R.string.q6_10, //
            R.string.o6_11_1,R.string.o6_11_2,R.string.o6_11_3,R.string.o6_11_4,R.string.q6_11, //
            R.string.o6_12_1,R.string.o6_12_2,R.string.o6_12_3,R.string.o6_12_4,R.string.q6_12, //
            R.string.o6_13_1,R.string.o6_13_2,R.string.o6_13_3,R.string.o6_13_4,R.string.q6_13, //
            R.string.o6_14_1,R.string.o6_14_2,R.string.o6_14_3,R.string.o6_14_4,R.string.q6_14, //
            R.string.o6_15_1,R.string.o6_15_2,R.string.o6_15_3,R.string.o6_15_4,R.string.q6_15, //
            R.string.o6_16_1,R.string.o6_16_2,R.string.o6_16_3,R.string.o6_16_4,R.string.q6_16, //
            R.string.o6_17_1,R.string.o6_17_2,R.string.o6_17_3,R.string.o6_17_4,R.string.q6_17, //
            R.string.o6_18_1,R.string.o6_18_2,R.string.o6_18_3,R.string.o6_18_4,R.string.q6_18, //
            R.string.o6_19_1,R.string.o6_19_2,R.string.o6_19_3,R.string.o6_19_4,R.string.q6_19, //
            R.string.o6_20_1,R.string.o6_20_2,R.string.o6_20_3,R.string.o6_20_4,R.string.q6_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power6 ={
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,4  //заглушка для 2
    };

    final int [] stringbtn7 = {
            R.string.o7_1_1,R.string.o7_1_2,R.string.o7_1_3,R.string.o7_1_4,R.string.q7_1, //
            R.string.o7_2_1,R.string.o7_2_2,R.string.o7_2_3,R.string.o7_2_4,R.string.q7_2, //
            R.string.o7_3_1,R.string.o7_3_2,R.string.o7_3_3,R.string.o7_3_4,R.string.q7_3, //
            R.string.o7_4_1,R.string.o7_4_2,R.string.o7_4_3,R.string.o7_4_4,R.string.q7_4, //
            R.string.o7_5_1,R.string.o7_5_2,R.string.o7_5_3,R.string.o7_5_4,R.string.q7_5, //
            R.string.o7_6_1,R.string.o7_6_2,R.string.o7_6_3,R.string.o7_6_4,R.string.q7_6, //
            R.string.o7_7_1,R.string.o7_7_2,R.string.o7_7_3,R.string.o7_7_4,R.string.q7_7, //
            R.string.o7_8_1,R.string.o7_8_2,R.string.o7_8_3,R.string.o7_8_4,R.string.q7_8, //
            R.string.o7_9_1,R.string.o7_9_2,R.string.o7_9_3,R.string.o7_9_4,R.string.q7_9, //
            R.string.o7_10_1,R.string.o7_10_2,R.string.o7_10_3,R.string.o7_10_4,R.string.q7_10, //
            R.string.o7_11_1,R.string.o7_11_2,R.string.o7_11_3,R.string.o7_11_4,R.string.q7_11, //
            R.string.o7_12_1,R.string.o7_12_2,R.string.o7_12_3,R.string.o7_12_4,R.string.q7_12, //
            R.string.o7_13_1,R.string.o7_13_2,R.string.o7_13_3,R.string.o7_13_4,R.string.q7_13, //
            R.string.o7_14_1,R.string.o7_14_2,R.string.o7_14_3,R.string.o7_14_4,R.string.q7_14, //
            R.string.o7_15_1,R.string.o7_15_2,R.string.o7_15_3,R.string.o7_15_4,R.string.q7_15, //
            R.string.o7_16_1,R.string.o7_16_2,R.string.o7_16_3,R.string.o7_16_4,R.string.q7_16, //
            R.string.o7_17_1,R.string.o7_17_2,R.string.o7_17_3,R.string.o7_17_4,R.string.q7_17, //
            R.string.o7_18_1,R.string.o7_18_2,R.string.o7_18_3,R.string.o7_18_4,R.string.q7_18, //
            R.string.o7_19_1,R.string.o7_19_2,R.string.o7_19_3,R.string.o7_19_4,R.string.q7_19, //
            R.string.o7_20_1,R.string.o7_20_2,R.string.o7_20_3,R.string.o7_20_4,R.string.q7_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power7 ={
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,4  //заглушка для 2
    };

    final int [] stringbtn8 = {
            R.string.o8_1_1,R.string.o8_1_2,R.string.o8_1_3,R.string.o8_1_4,R.string.q8_1, //
            R.string.o8_2_1,R.string.o8_2_2,R.string.o8_2_3,R.string.o8_2_4,R.string.q8_2, //
            R.string.o8_3_1,R.string.o8_3_2,R.string.o8_3_3,R.string.o8_3_4,R.string.q8_3, //
            R.string.o8_4_1,R.string.o8_4_2,R.string.o8_4_3,R.string.o8_4_4,R.string.q8_4, //
            R.string.o8_5_1,R.string.o8_5_2,R.string.o8_5_3,R.string.o8_5_4,R.string.q8_5, //
            R.string.o8_6_1,R.string.o8_6_2,R.string.o8_6_3,R.string.o8_6_4,R.string.q8_6, //
            R.string.o8_7_1,R.string.o8_7_2,R.string.o8_7_3,R.string.o8_7_4,R.string.q8_7, //
            R.string.o8_8_1,R.string.o8_8_2,R.string.o8_8_3,R.string.o8_8_4,R.string.q8_8, //
            R.string.o8_9_1,R.string.o8_9_2,R.string.o8_9_3,R.string.o8_9_4,R.string.q8_9, //
            R.string.o8_10_1,R.string.o8_10_2,R.string.o8_10_3,R.string.o8_10_4,R.string.q8_10, //
            R.string.o8_11_1,R.string.o8_11_2,R.string.o8_11_3,R.string.o8_11_4,R.string.q8_11, //
            R.string.o8_12_1,R.string.o8_12_2,R.string.o8_12_3,R.string.o8_12_4,R.string.q8_12, //
            R.string.o8_13_1,R.string.o8_13_2,R.string.o8_13_3,R.string.o8_13_4,R.string.q8_13, //
            R.string.o8_14_1,R.string.o8_14_2,R.string.o8_14_3,R.string.o8_14_4,R.string.q8_14, //
            R.string.o8_15_1,R.string.o8_15_2,R.string.o8_15_3,R.string.o8_15_4,R.string.q8_15, //
            R.string.o8_16_1,R.string.o8_16_2,R.string.o8_16_3,R.string.o8_16_4,R.string.q8_16, //
            R.string.o8_17_1,R.string.o8_17_2,R.string.o8_17_3,R.string.o8_17_4,R.string.q8_17, //
            R.string.o8_18_1,R.string.o8_18_2,R.string.o8_18_3,R.string.o8_18_4,R.string.q8_18, //
            R.string.o8_19_1,R.string.o8_19_2,R.string.o8_19_3,R.string.o8_19_4,R.string.q8_19, //
            R.string.o8_20_1,R.string.o8_20_2,R.string.o8_20_3,R.string.o8_20_4,R.string.q8_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power8 ={
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,4  //заглушка для 2
    };

    final int [] stringbtn9 = {
            R.string.o9_1_1,R.string.o9_1_2,R.string.o9_1_3,R.string.o9_1_4,R.string.q9_1, //
            R.string.o9_2_1,R.string.o9_2_2,R.string.o9_2_3,R.string.o9_2_4,R.string.q9_2, //
            R.string.o9_3_1,R.string.o9_3_2,R.string.o9_3_3,R.string.o9_3_4,R.string.q9_3, //
            R.string.o9_4_1,R.string.o9_4_2,R.string.o9_4_3,R.string.o9_4_4,R.string.q9_4, //
            R.string.o9_5_1,R.string.o9_5_2,R.string.o9_5_3,R.string.o9_5_4,R.string.q9_5, //
            R.string.o9_6_1,R.string.o9_6_2,R.string.o9_6_3,R.string.o9_6_4,R.string.q9_6, //
            R.string.o9_7_1,R.string.o9_7_2,R.string.o9_7_3,R.string.o9_7_4,R.string.q9_7, //
            R.string.o9_8_1,R.string.o9_8_2,R.string.o9_8_3,R.string.o9_8_4,R.string.q9_8, //
            R.string.o9_9_1,R.string.o9_9_2,R.string.o9_9_3,R.string.o9_9_4,R.string.q9_9, //
            R.string.o9_10_1,R.string.o9_10_2,R.string.o9_10_3,R.string.o9_10_4,R.string.q9_10, //
            R.string.o9_11_1,R.string.o9_11_2,R.string.o9_11_3,R.string.o9_11_4,R.string.q9_11, //
            R.string.o9_12_1,R.string.o9_12_2,R.string.o9_12_3,R.string.o9_12_4,R.string.q9_12, //
            R.string.o9_13_1,R.string.o9_13_2,R.string.o9_13_3,R.string.o9_13_4,R.string.q9_13, //
            R.string.o9_14_1,R.string.o9_14_2,R.string.o9_14_3,R.string.o9_14_4,R.string.q9_14, //
            R.string.o9_15_1,R.string.o9_15_2,R.string.o9_15_3,R.string.o9_15_4,R.string.q9_15, //
            R.string.o9_16_1,R.string.o9_16_2,R.string.o9_16_3,R.string.o9_16_4,R.string.q9_16, //
            R.string.o9_17_1,R.string.o9_17_2,R.string.o9_17_3,R.string.o9_17_4,R.string.q9_17, //
            R.string.o9_18_1,R.string.o9_18_2,R.string.o9_18_3,R.string.o9_18_4,R.string.q9_18, //
            R.string.o9_19_1,R.string.o9_19_2,R.string.o9_19_3,R.string.o9_19_4,R.string.q9_19, //
            R.string.o9_20_1,R.string.o9_20_2,R.string.o9_20_3,R.string.o9_20_4,R.string.q9_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power9 ={
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,4  //заглушка для 2
    };

    final int [] stringbtn10 = {
            R.string.o10_1_1,R.string.o10_1_2,R.string.o10_1_3,R.string.o10_1_4,R.string.q10_1, //
            R.string.o10_2_1,R.string.o10_2_2,R.string.o10_2_3,R.string.o10_2_4,R.string.q10_2, //
            R.string.o10_3_1,R.string.o10_3_2,R.string.o10_3_3,R.string.o10_3_4,R.string.q10_3, //
            R.string.o10_4_1,R.string.o10_4_2,R.string.o10_4_3,R.string.o10_4_4,R.string.q10_4, //
            R.string.o10_5_1,R.string.o10_5_2,R.string.o10_5_3,R.string.o10_5_4,R.string.q10_5, //
            R.string.o10_6_1,R.string.o10_6_2,R.string.o10_6_3,R.string.o10_6_4,R.string.q10_6, //
            R.string.o10_7_1,R.string.o10_7_2,R.string.o10_7_3,R.string.o10_7_4,R.string.q10_7, //
            R.string.o10_8_1,R.string.o10_8_2,R.string.o10_8_3,R.string.o10_8_4,R.string.q10_8, //
            R.string.o10_9_1,R.string.o10_9_2,R.string.o10_9_3,R.string.o10_9_4,R.string.q10_9, //
            R.string.o10_10_1,R.string.o10_10_2,R.string.o10_10_3,R.string.o10_10_4,R.string.q10_10, //
            R.string.o10_11_1,R.string.o10_11_2,R.string.o10_11_3,R.string.o10_11_4,R.string.q10_11, //
            R.string.o10_12_1,R.string.o10_12_2,R.string.o10_12_3,R.string.o10_12_4,R.string.q10_12, //
            R.string.o10_13_1,R.string.o10_13_2,R.string.o10_13_3,R.string.o10_13_4,R.string.q10_13, //
            R.string.o10_14_1,R.string.o10_14_2,R.string.o10_14_3,R.string.o10_14_4,R.string.q10_14, //
            R.string.o10_15_1,R.string.o10_15_2,R.string.o10_15_3,R.string.o10_15_4,R.string.q10_15, //
            R.string.o10_16_1,R.string.o10_16_2,R.string.o10_16_3,R.string.o10_16_4,R.string.q10_16, //
            R.string.o10_17_1,R.string.o10_17_2,R.string.o10_17_3,R.string.o10_17_4,R.string.q10_17, //
            R.string.o10_18_1,R.string.o10_18_2,R.string.o10_18_3,R.string.o10_18_4,R.string.q10_18, //
            R.string.o10_19_1,R.string.o10_19_2,R.string.o10_19_3,R.string.o10_19_4,R.string.q10_19, //
            R.string.o10_20_1,R.string.o10_20_2,R.string.o10_20_3,R.string.o10_20_4,R.string.q10_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power10 ={
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,4  //заглушка для 2
    };

    final int [] stringbtn11 = {
            R.string.o11_1_1,R.string.o11_1_2,R.string.o11_1_3,R.string.o11_1_4,R.string.q11_1, //
            R.string.o11_2_1,R.string.o11_2_2,R.string.o11_2_3,R.string.o11_2_4,R.string.q11_2, //
            R.string.o11_3_1,R.string.o11_3_2,R.string.o11_3_3,R.string.o11_3_4,R.string.q11_3, //
            R.string.o11_4_1,R.string.o11_4_2,R.string.o11_4_3,R.string.o11_4_4,R.string.q11_4, //
            R.string.o11_5_1,R.string.o11_5_2,R.string.o11_5_3,R.string.o11_5_4,R.string.q11_5, //
            R.string.o11_6_1,R.string.o11_6_2,R.string.o11_6_3,R.string.o11_6_4,R.string.q11_6, //
            R.string.o11_7_1,R.string.o11_7_2,R.string.o11_7_3,R.string.o11_7_4,R.string.q11_7, //
            R.string.o11_8_1,R.string.o11_8_2,R.string.o11_8_3,R.string.o11_8_4,R.string.q11_8, //
            R.string.o11_9_1,R.string.o11_9_2,R.string.o11_9_3,R.string.o11_9_4,R.string.q11_9, //
            R.string.o11_10_1,R.string.o11_10_2,R.string.o11_10_3,R.string.o11_10_4,R.string.q11_10, //
            R.string.o11_11_1,R.string.o11_11_2,R.string.o11_11_3,R.string.o11_11_4,R.string.q11_11, //
            R.string.o11_12_1,R.string.o11_12_2,R.string.o11_12_3,R.string.o11_12_4,R.string.q11_12, //
            R.string.o11_13_1,R.string.o11_13_2,R.string.o11_13_3,R.string.o11_13_4,R.string.q11_13, //
            R.string.o11_14_1,R.string.o11_14_2,R.string.o11_14_3,R.string.o11_14_4,R.string.q11_14, //
            R.string.o11_15_1,R.string.o11_15_2,R.string.o11_15_3,R.string.o11_15_4,R.string.q11_15, //
            R.string.o11_16_1,R.string.o11_16_2,R.string.o11_16_3,R.string.o11_16_4,R.string.q11_16, //
            R.string.o11_17_1,R.string.o11_17_2,R.string.o11_17_3,R.string.o11_17_4,R.string.q11_17, //
            R.string.o11_18_1,R.string.o11_18_2,R.string.o11_18_3,R.string.o11_18_4,R.string.q11_18, //
            R.string.o11_19_1,R.string.o11_19_2,R.string.o11_19_3,R.string.o11_19_4,R.string.q11_19, //
            R.string.o11_20_1,R.string.o11_20_2,R.string.o11_20_3,R.string.o11_20_4,R.string.q11_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power11 ={
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,4  //заглушка для 2
    };

    final int [] stringbtn12 = {
            R.string.o12_1_1,R.string.o12_1_2,R.string.o12_1_3,R.string.o12_1_4,R.string.q12_1, //
            R.string.o12_2_1,R.string.o12_2_2,R.string.o12_2_3,R.string.o12_2_4,R.string.q12_2, //
            R.string.o12_3_1,R.string.o12_3_2,R.string.o12_3_3,R.string.o12_3_4,R.string.q12_3, //
            R.string.o12_4_1,R.string.o12_4_2,R.string.o12_4_3,R.string.o12_4_4,R.string.q12_4, //
            R.string.o12_5_1,R.string.o12_5_2,R.string.o12_5_3,R.string.o12_5_4,R.string.q12_5, //
            R.string.o12_6_1,R.string.o12_6_2,R.string.o12_6_3,R.string.o12_6_4,R.string.q12_6, //
            R.string.o12_7_1,R.string.o12_7_2,R.string.o12_7_3,R.string.o12_7_4,R.string.q12_7, //
            R.string.o12_8_1,R.string.o12_8_2,R.string.o12_8_3,R.string.o12_8_4,R.string.q12_8, //
            R.string.o12_9_1,R.string.o12_9_2,R.string.o12_9_3,R.string.o12_9_4,R.string.q12_9, //
            R.string.o12_10_1,R.string.o12_10_2,R.string.o12_10_3,R.string.o12_10_4,R.string.q12_10, //
            R.string.o12_11_1,R.string.o12_11_2,R.string.o12_11_3,R.string.o12_11_4,R.string.q12_11, //
            R.string.o12_12_1,R.string.o12_12_2,R.string.o12_12_3,R.string.o12_12_4,R.string.q12_12, //
            R.string.o12_13_1,R.string.o12_13_2,R.string.o12_13_3,R.string.o12_13_4,R.string.q12_13, //
            R.string.o12_14_1,R.string.o12_14_2,R.string.o12_14_3,R.string.o12_14_4,R.string.q12_14, //
            R.string.o12_15_1,R.string.o12_15_2,R.string.o12_15_3,R.string.o12_15_4,R.string.q12_15, //
            R.string.o12_16_1,R.string.o12_16_2,R.string.o12_16_3,R.string.o12_16_4,R.string.q12_16, //
            R.string.o12_17_1,R.string.o12_17_2,R.string.o12_17_3,R.string.o12_17_4,R.string.q12_17, //
            R.string.o12_18_1,R.string.o12_18_2,R.string.o12_18_3,R.string.o12_18_4,R.string.q12_18, //
            R.string.o12_19_1,R.string.o12_19_2,R.string.o12_19_3,R.string.o12_19_4,R.string.q12_19, //
            R.string.o12_20_1,R.string.o12_20_2,R.string.o12_20_3,R.string.o12_20_4,R.string.q12_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power12 ={
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,4  //заглушка для 2
    };

    final int [] stringbtn13 = {
            R.string.o13_1_1,R.string.o13_1_2,R.string.o13_1_3,R.string.o13_1_4,R.string.q13_1, //
            R.string.o13_2_1,R.string.o13_2_2,R.string.o13_2_3,R.string.o13_2_4,R.string.q13_2, //
            R.string.o13_3_1,R.string.o13_3_2,R.string.o13_3_3,R.string.o13_3_4,R.string.q13_3, //
            R.string.o13_4_1,R.string.o13_4_2,R.string.o13_4_3,R.string.o13_4_4,R.string.q13_4, //
            R.string.o13_5_1,R.string.o13_5_2,R.string.o13_5_3,R.string.o13_5_4,R.string.q13_5, //
            R.string.o13_6_1,R.string.o13_6_2,R.string.o13_6_3,R.string.o13_6_4,R.string.q13_6, //
            R.string.o13_7_1,R.string.o13_7_2,R.string.o13_7_3,R.string.o13_7_4,R.string.q13_7, //
            R.string.o13_8_1,R.string.o13_8_2,R.string.o13_8_3,R.string.o13_8_4,R.string.q13_8, //
            R.string.o13_9_1,R.string.o13_9_2,R.string.o13_9_3,R.string.o13_9_4,R.string.q13_9, //
            R.string.o13_10_1,R.string.o13_10_2,R.string.o13_10_3,R.string.o13_10_4,R.string.q13_10, //
            R.string.o13_11_1,R.string.o13_11_2,R.string.o13_11_3,R.string.o13_11_4,R.string.q13_11, //
            R.string.o13_12_1,R.string.o13_12_2,R.string.o13_12_3,R.string.o13_12_4,R.string.q13_12, //
            R.string.o13_13_1,R.string.o13_13_2,R.string.o13_13_3,R.string.o13_13_4,R.string.q13_13, //
            R.string.o13_14_1,R.string.o13_14_2,R.string.o13_14_3,R.string.o13_14_4,R.string.q13_14, //
            R.string.o13_15_1,R.string.o13_15_2,R.string.o13_15_3,R.string.o13_15_4,R.string.q13_15, //
            R.string.o13_16_1,R.string.o13_16_2,R.string.o13_16_3,R.string.o13_16_4,R.string.q13_16, //
            R.string.o13_17_1,R.string.o13_17_2,R.string.o13_17_3,R.string.o13_17_4,R.string.q13_17, //
            R.string.o13_18_1,R.string.o13_18_2,R.string.o13_18_3,R.string.o13_18_4,R.string.q13_18, //
            R.string.o13_19_1,R.string.o13_19_2,R.string.o13_19_3,R.string.o13_19_4,R.string.q13_19, //
            R.string.o13_20_1,R.string.o13_20_2,R.string.o13_20_3,R.string.o13_20_4,R.string.q13_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power13 ={
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,4  //заглушка для 2
    };

    final int [] stringbtn14 = {
            R.string.o14_1_1,R.string.o14_1_2,R.string.o14_1_3,R.string.o14_1_4,R.string.q14_1, //
            R.string.o14_2_1,R.string.o14_2_2,R.string.o14_2_3,R.string.o14_2_4,R.string.q14_2, //
            R.string.o14_3_1,R.string.o14_3_2,R.string.o14_3_3,R.string.o14_3_4,R.string.q14_3, //
            R.string.o14_4_1,R.string.o14_4_2,R.string.o14_4_3,R.string.o14_4_4,R.string.q14_4, //
            R.string.o14_5_1,R.string.o14_5_2,R.string.o14_5_3,R.string.o14_5_4,R.string.q14_5, //
            R.string.o14_6_1,R.string.o14_6_2,R.string.o14_6_3,R.string.o14_6_4,R.string.q14_6, //
            R.string.o14_7_1,R.string.o14_7_2,R.string.o14_7_3,R.string.o14_7_4,R.string.q14_7, //
            R.string.o14_8_1,R.string.o14_8_2,R.string.o14_8_3,R.string.o14_8_4,R.string.q14_8, //
            R.string.o14_9_1,R.string.o14_9_2,R.string.o14_9_3,R.string.o14_9_4,R.string.q14_9, //
            R.string.o14_10_1,R.string.o14_10_2,R.string.o14_10_3,R.string.o14_10_4,R.string.q14_10, //
            R.string.o14_11_1,R.string.o14_11_2,R.string.o14_11_3,R.string.o14_11_4,R.string.q14_11, //
            R.string.o14_12_1,R.string.o14_12_2,R.string.o14_12_3,R.string.o14_12_4,R.string.q14_12, //
            R.string.o14_13_1,R.string.o14_13_2,R.string.o14_13_3,R.string.o14_13_4,R.string.q14_13, //
            R.string.o14_14_1,R.string.o14_14_2,R.string.o14_14_3,R.string.o14_14_4,R.string.q14_14, //
            R.string.o14_15_1,R.string.o14_15_2,R.string.o14_15_3,R.string.o14_15_4,R.string.q14_15, //
            R.string.o14_16_1,R.string.o14_16_2,R.string.o14_16_3,R.string.o14_16_4,R.string.q14_16, //
            R.string.o14_17_1,R.string.o14_17_2,R.string.o14_17_3,R.string.o14_17_4,R.string.q14_17, //
            R.string.o14_18_1,R.string.o14_18_2,R.string.o14_18_3,R.string.o14_18_4,R.string.q14_18, //
            R.string.o14_19_1,R.string.o14_19_2,R.string.o14_19_3,R.string.o14_19_4,R.string.q14_19, //
            R.string.o14_20_1,R.string.o14_20_2,R.string.o14_20_3,R.string.o14_20_4,R.string.q14_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power14 ={
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,4  //заглушка для 2
    };

    final int [] stringbtn15 = {
            R.string.o15_1_1,R.string.o15_1_2,R.string.o15_1_3,R.string.o15_1_4,R.string.q15_1, //
            R.string.o15_2_1,R.string.o15_2_2,R.string.o15_2_3,R.string.o15_2_4,R.string.q15_2, //
            R.string.o15_3_1,R.string.o15_3_2,R.string.o15_3_3,R.string.o15_3_4,R.string.q15_3, //
            R.string.o15_4_1,R.string.o15_4_2,R.string.o15_4_3,R.string.o15_4_4,R.string.q15_4, //
            R.string.o15_5_1,R.string.o15_5_2,R.string.o15_5_3,R.string.o15_5_4,R.string.q15_5, //
            R.string.o15_6_1,R.string.o15_6_2,R.string.o15_6_3,R.string.o15_6_4,R.string.q15_6, //
            R.string.o15_7_1,R.string.o15_7_2,R.string.o15_7_3,R.string.o15_7_4,R.string.q15_7, //
            R.string.o15_8_1,R.string.o15_8_2,R.string.o15_8_3,R.string.o15_8_4,R.string.q15_8, //
            R.string.o15_9_1,R.string.o15_9_2,R.string.o15_9_3,R.string.o15_9_4,R.string.q15_9, //
            R.string.o15_10_1,R.string.o15_10_2,R.string.o15_10_3,R.string.o15_10_4,R.string.q15_10, //
            R.string.o15_11_1,R.string.o15_11_2,R.string.o15_11_3,R.string.o15_11_4,R.string.q15_11, //
            R.string.o15_12_1,R.string.o15_12_2,R.string.o15_12_3,R.string.o15_12_4,R.string.q15_12, //
            R.string.o15_13_1,R.string.o15_13_2,R.string.o15_13_3,R.string.o15_13_4,R.string.q15_13, //
            R.string.o15_14_1,R.string.o15_14_2,R.string.o15_14_3,R.string.o15_14_4,R.string.q15_14, //
            R.string.o15_15_1,R.string.o15_15_2,R.string.o15_15_3,R.string.o15_15_4,R.string.q15_15, //
            R.string.o15_16_1,R.string.o15_16_2,R.string.o15_16_3,R.string.o15_16_4,R.string.q15_16, //
            R.string.o15_17_1,R.string.o15_17_2,R.string.o15_17_3,R.string.o15_17_4,R.string.q15_17, //
            R.string.o15_18_1,R.string.o15_18_2,R.string.o15_18_3,R.string.o15_18_4,R.string.q15_18, //
            R.string.o15_19_1,R.string.o15_19_2,R.string.o15_19_3,R.string.o15_19_4,R.string.q15_19, //
            R.string.o15_20_1,R.string.o15_20_2,R.string.o15_20_3,R.string.o15_20_4,R.string.q15_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power15 ={
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,0,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,3,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,4  //заглушка для 2
    };

    final int [] stringbtn16 = {
            R.string.o16_1_1,R.string.o16_1_2,R.string.o16_1_3,R.string.o16_1_4,R.string.q16_1, //
            R.string.o16_2_1,R.string.o16_2_2,R.string.o16_2_3,R.string.o16_2_4,R.string.q16_2, //
            R.string.o16_3_1,R.string.o16_3_2,R.string.o16_3_3,R.string.o16_3_4,R.string.q16_3, //
            R.string.o16_4_1,R.string.o16_4_2,R.string.o16_4_3,R.string.o16_4_4,R.string.q16_4, //
            R.string.o16_5_1,R.string.o16_5_2,R.string.o16_5_3,R.string.o16_5_4,R.string.q16_5, //
            R.string.o16_6_1,R.string.o16_6_2,R.string.o16_6_3,R.string.o16_6_4,R.string.q16_6, //
            R.string.o16_7_1,R.string.o16_7_2,R.string.o16_7_3,R.string.o16_7_4,R.string.q16_7, //
            R.string.o16_8_1,R.string.o16_8_2,R.string.o16_8_3,R.string.o16_8_4,R.string.q16_8, //
            R.string.o16_9_1,R.string.o16_9_2,R.string.o16_9_3,R.string.o16_9_4,R.string.q16_9, //
            R.string.o16_10_1,R.string.o16_10_2,R.string.o16_10_3,R.string.o16_10_4,R.string.q16_10, //
            R.string.o16_11_1,R.string.o16_11_2,R.string.o16_11_3,R.string.o16_11_4,R.string.q16_11, //
            R.string.o16_12_1,R.string.o16_12_2,R.string.o16_12_3,R.string.o16_12_4,R.string.q16_12, //
            R.string.o16_13_1,R.string.o16_13_2,R.string.o16_13_3,R.string.o16_13_4,R.string.q16_13, //
            R.string.o16_14_1,R.string.o16_14_2,R.string.o16_14_3,R.string.o16_14_4,R.string.q16_14, //
            R.string.o16_15_1,R.string.o16_15_2,R.string.o16_15_3,R.string.o16_15_4,R.string.q16_15, //
            R.string.o16_16_1,R.string.o16_16_2,R.string.o16_16_3,R.string.o16_16_4,R.string.q16_16, //
            R.string.o16_17_1,R.string.o16_17_2,R.string.o16_17_3,R.string.o16_17_4,R.string.q16_17, //
            R.string.o16_18_1,R.string.o16_18_2,R.string.o16_18_3,R.string.o16_18_4,R.string.q16_18, //
            R.string.o16_19_1,R.string.o16_19_2,R.string.o16_19_3,R.string.o16_19_4,R.string.q16_19, //
            R.string.o16_20_1,R.string.o16_20_2,R.string.o16_20_3,R.string.o16_20_4,R.string.q16_20,
            R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,R.string.fuuu,
    };
    final int [] power16 ={
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,2,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,0,
            0,1,2,3,2,
            0,1,2,3,0,
            0,1,2,3,1,
            0,1,2,3,3,
            0,1,2,3,1,
            0,1,2,3,1,
            0,1,2,3,4  //заглушка для 2
    };


}
