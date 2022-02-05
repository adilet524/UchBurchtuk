package com.company;

/* Уч бурчтук деген класс тузунуз.
Класстын 3 полеси болсун a, b, c.
Класстын "area" деген методу болсун.
"area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)
таянып консолго уч бурчтуктун аянтын чыгарсын. */

import java.security.cert.CertPathValidatorException;

public class Main {

    public static void main(String[] args) {

        UchBurchtuk uchBurchtuk = new UchBurchtuk();
        uchBurchtuk.a = 10;
        uchBurchtuk.b = 10;
        uchBurchtuk.c = 10;

        uchBurchtuk.area(uchBurchtuk.a, uchBurchtuk.b, uchBurchtuk.c);
    }
}
