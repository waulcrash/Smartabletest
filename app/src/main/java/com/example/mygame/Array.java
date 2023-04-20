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


}
