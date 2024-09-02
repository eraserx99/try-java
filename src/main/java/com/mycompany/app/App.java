/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

class Fetch {
    void fetch(List<? super Float> l) {
        l.add(100.0f);
        l.add(200.0f);
    }
}

public class App {
    public static void main(String[] args) {
        List<Number> l = new ArrayList<>();
        Fetch f = new Fetch();
        f.fetch(l);
        for (Number n : l) {
            System.out.println(n.toString());
        }

        System.out.println("Hello Remote World!");
    }
}
